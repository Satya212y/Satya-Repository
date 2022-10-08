package com.Novel_58.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Novel_58.Entities.Contact;
import com.Novel_58.Service.ContactService;

@Controller
public class ContactController {
	@Autowired
	private ContactService contactService;
	@RequestMapping("/contactlist")
	public String getAllContact(ModelMap model) {
		List<Contact> contacts = contactService.listAll();
		model.addAttribute("leads", contacts);
		return "contact_details";
		
		
	}
	@RequestMapping("/getOneContactDetail")
	public String getOneLeadInfo(@RequestParam("id") long id,ModelMap model) {
		Contact contactInfo = contactService.findOneLeadById(id);
		model.addAttribute("contact", contactInfo);
		return "contact_info";
		
	}
	@RequestMapping("/BillinDetails")
	public String saveOneBill(@RequestParam("id") long id,ModelMap model) {
		Contact contactInfo = contactService.findOneLeadById(id);
		model.addAttribute("contact", contactInfo);
		return "Bill_info";
		
	}
	@RequestMapping("/deleteContact")
	public String deleteById(@RequestParam("id") long id,ModelMap model) {
		contactService.deleteOneContactById(id);
		List<Contact> contacts = contactService.listAll();
		model.addAttribute("leads", contacts);
		return "contact_details";
	}
	
}
