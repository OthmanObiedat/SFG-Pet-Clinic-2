package org.pet.clinic.controllers;

import org.pet.clinic.services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/owners")
public class OwnerController {

	private final OwnerService ownerService;
	public OwnerController(OwnerService ownerService) {
		this.ownerService = ownerService;
	}
	
	@RequestMapping({"","/","/index","/index.html"})
	public String listOwners(Model model) {
		model.addAttribute("owners",ownerService.findAll());
		return "owner/index";
		
	}
	@RequestMapping("/find")
	public String findOwners() {
		return"notimplem";
	}
	
}
