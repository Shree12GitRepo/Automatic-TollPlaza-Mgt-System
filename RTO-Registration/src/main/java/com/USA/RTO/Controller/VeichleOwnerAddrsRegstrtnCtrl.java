package com.USA.RTO.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.USA.RTO.DTO.VeichleOwnerAddressRegstrtnDTO;
import com.USA.RTO.Service.VeichleOwnerAddressRegsttnService;
import com.USA.RTO.Service.VeichleRegistrationNumberService;

@Controller
public class VeichleOwnerAddrsRegstrtnCtrl {
	//inject ownerAddrs Service...
	@Autowired
	private VeichleOwnerAddressRegsttnService Owner_Adrs_service;
	@Autowired
	private VeichleRegistrationNumberService Regstrtn_Number_service;
	@RequestMapping("/ownrAddrs/{OwnerID}")
	public String insertOwnrAddrsRcrd(@PathVariable("OwnerID")Integer OwnrID,@ModelAttribute("ownrAddrsReg")VeichleOwnerAddressRegstrtnDTO addrsReg,Model model) {
		//use service..
		System.out.println("VeichleOwnerAddrsRegstrtnCtrl.insertOwnrAddrsRcrd()"+OwnrID);
		Owner_Adrs_service.ownerAddrsInsrt(addrsReg, OwnrID);
		Regstrtn_Number_service.insertRegstrtnNumberDetails(OwnrID);
		model.addAttribute("Msg","Inserted Success Fully");
		return "vchl_regDtls";
	}
}
