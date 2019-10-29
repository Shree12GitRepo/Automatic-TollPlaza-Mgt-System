package com.USA.RTO.Service;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.USA.RTO.DAO.OwnerAddressRegstrtnDAO;
import com.USA.RTO.DAO.OwnerDetailsRegstrtnDAO;
import com.USA.RTO.DTO.VeichleOwnerAddressRegstrtnDTO;
import com.USA.RTO.Entity.VeichleOwnerAddressRegistrationEntity;
import com.USA.RTO.Entity.VeichleOwnerRegstrtnEntity;

@Service
public class VeichleOwnerAddressRgstrtnServiceIMPL implements VeichleOwnerAddressRegsttnService {
	// inject DAO Repository...
	@Autowired
	private OwnerAddressRegstrtnDAO ownerAddrsDAO;
	// inject OwnerDetails Repository...
	@Autowired
	private OwnerDetailsRegstrtnDAO ownerDetailsDAO;

	@Override
	public void ownerAddrsInsrt(VeichleOwnerAddressRegstrtnDTO dto, Integer ownerID) {
		System.out.println("Owner ID From OwnerADrss class");
		// create OwnerAddrs Entity Object...
		VeichleOwnerAddressRegistrationEntity ownr_Addrs_entity = null;
		// create Ownr_Rgstrtn_Details Object...
		Optional<VeichleOwnerRegstrtnEntity> ownr_Regstrtn_EntityAll = null;
		VeichleOwnerRegstrtnEntity ownr_Regstrtn_Entity = null;
		ownr_Addrs_entity = new VeichleOwnerAddressRegistrationEntity();
		// copy Dto to ownr_Addrs_Entity..
		BeanUtils.copyProperties(dto, ownr_Addrs_entity);
		// create Ownr_Rgstrtn_Entity for get the Owner ID from entity ..
		ownr_Regstrtn_EntityAll = ownerDetailsDAO.findById(ownerID);
		// get the Entity Object from Ownr_Rgstrtn_Details Object...
		ownr_Regstrtn_Entity = ownr_Regstrtn_EntityAll.get();
		ownr_Addrs_entity.setVchl_ownrID(ownr_Regstrtn_Entity);
		//insert the Owner Address Object to Database...
		ownerAddrsDAO.save(ownr_Addrs_entity);
		

	}

}
