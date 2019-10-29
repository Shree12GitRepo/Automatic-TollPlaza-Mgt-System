package com.USA.RTO.Service;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.USA.RTO.BO.VeichleOwnerRegstrtnBO;
import com.USA.RTO.DAO.OwnerDetailsRegstrtnDAO;
import com.USA.RTO.Entity.VeichleOwnerRegstrtnEntity;

@Service
public class VeichleOwnerRegstrtnServiceIMPL implements VeichleOwnerRegstrtnService {
	// inject DAO...
	@Autowired
	private OwnerDetailsRegstrtnDAO dao;

	@Override
	public int insert_vchlOwnr_Details(VeichleOwnerRegstrtnBO bo) {

		// Entity Class object..
		VeichleOwnerRegstrtnEntity entity = null;
		entity = new VeichleOwnerRegstrtnEntity();
		// convert bo object to entity Object...
		BeanUtils.copyProperties(bo, entity);
		VeichleOwnerRegstrtnEntity ownrEntity = dao.save(entity);
		int ownrID=ownrEntity.getVchl_ownrID();
		System.out.println("Owner ID "+ownrID);
		return ownrID;
	}

	@Override
	public VeichleOwnerRegstrtnBO getOwnrDetailsByID(Integer ownerID) {
		VeichleOwnerRegstrtnBO bo = null;
		// use dao object to find Ownerdetails...
		Optional<VeichleOwnerRegstrtnEntity> entity = null;
		entity = dao.findById(ownerID);
		if (entity.isPresent()) {
			bo = new VeichleOwnerRegstrtnBO();
			VeichleOwnerRegstrtnEntity ownerEntiy = entity.get();
			// copy ownerEntity Object to Bo Object..
			BeanUtils.copyProperties(ownerEntiy, bo);
		}
		return bo;
	}

}
