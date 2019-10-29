package com.USA.RTO.Service;

import com.USA.RTO.BO.VeichleOwnerRegstrtnBO;


public interface VeichleOwnerRegstrtnService {
	public int insert_vchlOwnr_Details(VeichleOwnerRegstrtnBO bo);
	public VeichleOwnerRegstrtnBO getOwnrDetailsByID(Integer ownerID);
}
