package com.bit;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {

	/*
	 * @RequestMapping("/") public String welcome() {
	 * System.out.println("AppController -> welcome()"); return "index"; }
	 */
	
	@RequestMapping("/test")
	public String welcome()
	{
		System.out.println("AppController -> welcome()");
		
		return "test";
	}
	
	@RequestMapping("/list_contact")
	public String listContact(Model model)
	{
		ContactBusiness business = new ContactBusiness();
		List<Contact> contactList = business.getContactList();
		
		model.addAttribute("contacts", contactList);
		
		return "contact";
	}
}
