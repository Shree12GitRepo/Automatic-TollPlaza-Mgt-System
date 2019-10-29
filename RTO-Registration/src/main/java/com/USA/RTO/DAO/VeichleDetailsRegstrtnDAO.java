package com.USA.RTO.DAO;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import com.USA.RTO.Entity.VeichleDetailsRegstrtnEntity;

@Repository
public interface VeichleDetailsRegstrtnDAO extends JpaRepository<VeichleDetailsRegstrtnEntity,Integer>  {
	@Query("from VeichleDetailsRegstrtnEntity e where e.OwnerID.vchl_ownrID = :oid")
	Optional<VeichleDetailsRegstrtnEntity> findByOwnerID(int oid);
}
