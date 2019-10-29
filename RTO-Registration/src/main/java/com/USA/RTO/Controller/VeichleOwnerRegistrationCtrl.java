package com.USA.RTO.Controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.USA.RTO.BO.VeichleOwnerRegstrtnBO;
import com.USA.RTO.DAO.OwnerDetailsRegstrtnDAO;
import com.USA.RTO.DTO.VeichleDetailsRegstrtnDTO;
import com.USA.RTO.DTO.VeichleOwnerRegstrtnDTO;
import com.USA.RTO.Entity.VeichleOwnerRegstrtnEntity;
import com.USA.RTO.Service.VeichleOwnerRegstrtnService;

@Controller
public class VeichleOwnerRegistrationCtrl {
	//inject Service class..
	@Autowired
	private VeichleOwnerRegstrtnService service;
	@Autowired
	private OwnerDetailsRegstrtnDAO dao;
	@RequestMapping(value = "/ownrReg")
	public String show_veichleScree(@ModelAttribute("VchlownrDetls")VeichleOwnerRegstrtnDTO dto) {
		System.out.println("VeichleRegistrationCtrl.show_veichleScree()");
		return "veichleReg";
	}
	@RequestMapping(value="/vchlDetails")
	public String register_OwnerDetails(@ModelAttribute("VchlownrDetls")VeichleOwnerRegstrtnDTO vchlonrReg,@ModelAttribute("vchlDtls")VeichleDetailsRegstrtnDTO vchldtls,Model model) {
		VeichleOwnerRegstrtnEntity entity=null;
		System.out.println("VeichleOwnerRegistrationCtrl.register_OwnerDetails()");
		System.out.println("Name of Gender "+vchlonrReg.getOwner_Gender());
		//set owner regid to jsp...
		
		
		//copy dto to bo Object..
		VeichleOwnerRegstrtnBO bo=null;
		bo=new VeichleOwnerRegstrtnBO();
		BeanUtils.copyProperties(vchlonrReg, bo);
		try {
			int ownrID=service.insert_vchlOwnr_Details(bo);
			//set Owner Id into VeichleDetails...
			model.addAttribute("OwnerID",ownrID);
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
		return "vchlDtls";
	}
	
	
	
	//redirecting ownerpage...
	@RequestMapping(value="/redirctOwner")
	public String redirectOwnerPage(@RequestParam Integer ownerID ,@ModelAttribute("VchlownrDetls")VeichleOwnerRegstrtnDTO dto) {
		VeichleOwnerRegstrtnBO bo=null;
		bo=service.getOwnrDetailsByID(ownerID);
		//copy bo to dto..
		BeanUtils.copyProperties(bo, dto);
		System.out.println(dto.getOwner_Fname());
		dto.setOwner_Fname(dto.getOwner_Fname());
		dto.setOwner_Lname(dto.getOwner_Lname());
		dto.setOwner_DOB(dto.getOwner_DOB());
		dto.setOwner_email(dto.getOwner_email());
		dto.setOwner_Gender(dto.getOwner_Gender());
		return "redirect:ownrReg";
	}

}
