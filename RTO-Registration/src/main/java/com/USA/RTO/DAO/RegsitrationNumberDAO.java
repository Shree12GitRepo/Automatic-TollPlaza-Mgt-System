package com.USA.RTO.DAO;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.USA.RTO.Entity.RegistrationNumberEntity;
@Repository
public interface RegsitrationNumberDAO extends JpaRepository<RegistrationNumberEntity, Serializable> {

}
