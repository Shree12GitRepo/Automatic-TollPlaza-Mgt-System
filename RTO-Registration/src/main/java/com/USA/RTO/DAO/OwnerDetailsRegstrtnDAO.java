package com.USA.RTO.DAO;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.USA.RTO.Entity.VeichleOwnerRegstrtnEntity;

public interface OwnerDetailsRegstrtnDAO extends JpaRepository<VeichleOwnerRegstrtnEntity, Serializable> {

}
