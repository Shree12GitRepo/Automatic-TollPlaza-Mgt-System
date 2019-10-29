package com.USA.RTO.Controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.USA.RTO.BO.VeichleDetailsRegstrtnBO;
import com.USA.RTO.DTO.VeichleDetailsRegstrtnDTO;
import com.USA.RTO.DTO.VeichleOwnerAddressRegstrtnDTO;
import com.USA.RTO.Entity.VeichleDetailsRegstrtnEntity;
import com.USA.RTO.Service.veichleDetailsRegstrtnService;

@Controller
public class VeichleDetailsCtrl {
	//inject Service ..
	@Autowired
	veichleDetailsRegstrtnService service;
	@RequestMapping(value="/vchlReg/{ownrID}")
	public String insertVchlDtls(@PathVariable("ownrID")Integer ownrID,@ModelAttribute("vchlDetails")VeichleDetailsRegstrtnDTO dto , @ModelAttribute("ownrAddrsReg")VeichleOwnerAddressRegstrtnDTO addrsReg, Model model) {
		
		//copy from Dto to Bo Object...
		service.insertvchlDtls(dto,ownrID);
		System.out.println("From VchlDtls OwnerID"+ownrID);
		model.addAttribute("Msg","Inserted Success Fully");
		model.addAttribute("OwnerID",ownrID);
		return "vchl_ownrAddrs";
		
	}
}
