package com.USA.RTO.Service;

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
	public void insert_vchlOwnr_Details(VeichleOwnerRegstrtnBO bo) {

		// Entity Class object..
		VeichleOwnerRegstrtnEntity entity = null;
		entity = new VeichleOwnerRegstrtnEntity();
		// convert bo object to entity Object...
		BeanUtils.copyProperties(bo, entity);
		dao.save(entity);
	}

}
