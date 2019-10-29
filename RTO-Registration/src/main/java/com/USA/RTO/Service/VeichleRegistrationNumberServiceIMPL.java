package com.USA.RTO.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.USA.RTO.DAO.OwnerAddressRegstrtnDAO;
import com.USA.RTO.DAO.OwnerDetailsRegstrtnDAO;
import com.USA.RTO.DAO.RegsitrationNumberDAO;
import com.USA.RTO.DAO.VeichleDetailsRegstrtnDAO;
import com.USA.RTO.Entity.RegistrationNumberEntity;
import com.USA.RTO.Entity.VeichleDetailsRegstrtnEntity;
import com.USA.RTO.Entity.VeichleOwnerAddressRegistrationEntity;
import com.USA.RTO.Entity.VeichleOwnerRegstrtnEntity;

@Service
public class VeichleRegistrationNumberServiceIMPL implements VeichleRegistrationNumberService {
	@Autowired
	private OwnerDetailsRegstrtnDAO ownr_regstrtn_DAO;
	@Autowired
	private VeichleDetailsRegstrtnDAO vchl_dtls_rgstrtn_DAO;
	@Autowired
	private OwnerAddressRegstrtnDAO ownr_addrs_rgstrtn_DAO;
	@Autowired
	private RegsitrationNumberDAO regstrtn_DAO;

	@Override
	public void insertRegstrtnNumberDetails(int ownerID) {

		System.out.println("Owner Id From RegistrtnNumberEntity " + ownerID);

		// create RegistrationNumber Entity Object...
		RegistrationNumberEntity regNumEntity = null;

		// create OwnerDetails Entity Object..
		Optional<VeichleOwnerRegstrtnEntity> ownr_rgstrtn_entityALl = null;
		VeichleOwnerRegstrtnEntity ownr_rgstrtn_entity = new VeichleOwnerRegstrtnEntity();
		ownr_rgstrtn_entityALl = ownr_regstrtn_DAO.findById(ownerID);
		ownr_rgstrtn_entity = ownr_rgstrtn_entityALl.get();
		System.out.println("Owner Regstr " + ownr_rgstrtn_entity.getOwner_Fname());

		// create OwnerAddrsRegstrtn Entity Object..

		Optional<VeichleOwnerAddressRegistrationEntity> ownr_addrs_entityAll = null;
		VeichleOwnerAddressRegistrationEntity ownr_addrs_entity = new VeichleOwnerAddressRegistrationEntity();
		ownr_addrs_entityAll = ownr_addrs_rgstrtn_DAO.findByOwnerid(ownerID);
		System.out.println("Owner Address Entity Object " + ownr_addrs_entityAll);
		if (ownr_addrs_entityAll.isPresent()) {
			System.out.println("VeichleRegistrationNumberServiceIMPL.insertRegstrtnNumberDetails()");
			ownr_addrs_entity = ownr_addrs_entityAll.get();
			System.out.println("Owner House No " + ownr_addrs_entity.getHouse_no());
		}

		// create Veichle Details Entity Object..
		Optional<VeichleDetailsRegstrtnEntity> vchlDetails_entityAll = null;
		VeichleDetailsRegstrtnEntity vchl_Dtls_entiy = new VeichleDetailsRegstrtnEntity();

		vchlDetails_entityAll = vchl_dtls_rgstrtn_DAO.findByOwnerID(ownerID);
		if (vchlDetails_entityAll.isPresent()) {
			vchl_Dtls_entiy = vchlDetails_entityAll.get();
		}

		// System.out.println("Number Plate "+vchl_Dtls_entiy.getVchl_Numbplate());
		// copy dto Object to Entity...
		regNumEntity = new RegistrationNumberEntity();
		regNumEntity.setOwner_name(ownr_rgstrtn_entity.getOwner_Fname() + " " + ownr_rgstrtn_entity.getOwner_Lname());
		 regNumEntity.setOwner_Numberplate(vchl_Dtls_entiy.getVchl_Numbplate());
		regNumEntity.setOwner_SSN_NO(ownr_addrs_entity.getSsn_no());
		 regNumEntity.setOwner_Veichle_Type(vchl_Dtls_entiy.getVchl_Type());

		regstrtn_DAO.save(regNumEntity);

	}

}
