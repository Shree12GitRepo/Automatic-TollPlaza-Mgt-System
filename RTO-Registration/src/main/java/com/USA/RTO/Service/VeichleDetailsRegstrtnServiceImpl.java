package com.USA.RTO.Service;



import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.USA.RTO.DAO.OwnerDetailsRegstrtnDAO;
import com.USA.RTO.DAO.VeichleDetailsRegstrtnDAO;
import com.USA.RTO.DTO.VeichleDetailsRegstrtnDTO;
import com.USA.RTO.Entity.VeichleDetailsRegstrtnEntity;
import com.USA.RTO.Entity.VeichleOwnerRegstrtnEntity;

@Service
public class VeichleDetailsRegstrtnServiceImpl implements veichleDetailsRegstrtnService {
	@Autowired
	private VeichleDetailsRegstrtnDAO dao;
	@Autowired
	private OwnerDetailsRegstrtnDAO ownerDao;

	@Override
	public void insertvchlDtls(VeichleDetailsRegstrtnDTO dto,Integer OwnerID) {
		VeichleDetailsRegstrtnEntity Vchl_entity=null;
		Vchl_entity=new VeichleDetailsRegstrtnEntity();
		System.out.println("Owner ID "+OwnerID);
		
		Optional<VeichleOwnerRegstrtnEntity> findById = ownerDao.findById(OwnerID);
		VeichleOwnerRegstrtnEntity ownerEntity = findById.get();
		
		Vchl_entity.setOwnerID(ownerEntity);
		
		//copy Dto Object to entity Object...
		BeanUtils.copyProperties(dto, Vchl_entity);
	
		//System.out.println("Owner Id In Vchl Enty "+owner_Entity.getVchl_ownrID());
		dao.save(Vchl_entity);
	}
	
}
