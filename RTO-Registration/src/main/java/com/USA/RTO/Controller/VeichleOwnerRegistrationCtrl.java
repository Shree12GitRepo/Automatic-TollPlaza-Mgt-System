package com.USA.RTO.Controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.USA.RTO.BO.VeichleOwnerRegstrtnBO;
import com.USA.RTO.DTO.VeichleOwnerRegstrtnDTO;
import com.USA.RTO.Service.VeichleOwnerRegstrtnService;

@Controller
public class VeichleOwnerRegistrationCtrl {
	//inject Service class..
	@Autowired
	private VeichleOwnerRegstrtnService service;
	@RequestMapping(value = "/veichle")
	public String show_veichleScree(@ModelAttribute("VchlownrDetls")VeichleOwnerRegstrtnDTO dto) {
		System.out.println("VeichleRegistrationCtrl.show_veichleScree()");
	//	String str="JAVA";
	//	model.addAttribute("str",str);
		return "veichleReg";
	}
	@RequestMapping(value="/vchlOwnrReg")
	public String register_OwnerDetails(@ModelAttribute("VchlownrDetls")VeichleOwnerRegstrtnDTO dto) {
		System.out.println("VeichleOwnerRegistrationCtrl.register_OwnerDetails()");
		System.out.println("Name of Gender "+dto.getOwner_Gender());
		//copy dto to bo Object..
		VeichleOwnerRegstrtnBO bo=null;
		bo=new VeichleOwnerRegstrtnBO();
		BeanUtils.copyProperties(dto, bo);
		try {
			service.insert_vchlOwnr_Details(bo);
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
		return "vchlDtls";
	}

}
