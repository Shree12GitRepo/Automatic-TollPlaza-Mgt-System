package com.USA.RTO.DAO;

import java.io.Serializable;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Repository;

import com.USA.RTO.Entity.VeichleOwnerAddressRegistrationEntity;

@Repository
public interface OwnerAddressRegstrtnDAO extends JpaRepository<VeichleOwnerAddressRegistrationEntity, Integer> {
	@Query("from VeichleOwnerAddressRegistrationEntity e where e.vchl_ownrID.vchl_ownrID = :oid")
	Optional<VeichleOwnerAddressRegistrationEntity> findByOwnerid(int oid);
	 
}
