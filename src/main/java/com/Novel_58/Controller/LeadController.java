package com.Novel_58.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Novel_58.Entities.Contact;
import com.Novel_58.Entities.Lead;
import com.Novel_58.Service.ContactService;
import com.Novel_58.Service.LeadService;

@Controller
public class LeadController {
	@Autowired
	private LeadService leadService;
	@Autowired
	private ContactService contactService;
	@RequestMapping("/")
	public String viewOneLead() {
		return "view_lead";
		
	}
	@RequestMapping("/saveOneLead")
	public String saveOneLead(@ModelAttribute("leads") Lead lead,ModelMap model) {
		leadService.saveOneLead(lead);
		model.addAttribute("lead", lead);
		return "lead_info";
		
	}
	@RequestMapping("/convert")
	public String convertOneLead(@RequestParam("id") long id,ModelMap model) {
		Lead lead = leadService.findOneLeadById(id);
		Contact contact =new Contact();
		contact.setFirstName(lead.getFirstName());
		contact.setLastName(lead.getLastName());
		contact.setEmail(lead.getEmail());
		contact.setGender(lead.getGender());
		contact.setLeadSource(lead.getLeadSource());
		contact.setMobile(lead.getMobile());
		contactService.saveOneContact(contact);
		leadService.deleteOneLeadById(id);
		List<Contact> contacts = contactService.listAll();
		model.addAttribute("leads", contacts);
		return "contact_details";
		
	}
	
	@RequestMapping("/leadList")
	public String getAllLeads(ModelMap model) {
		List<Lead> lead = leadService.listAll();
		model.addAttribute("leads", lead);
		return "Lead_details";
		
	}
	@RequestMapping("/getOneLeadInfo")
	public String getOneLeadInfo(@RequestParam("id") long id,ModelMap model) {
		Lead leadInfo = leadService.findOneLeadById(id);
		model.addAttribute("lead", leadInfo);
		return "lead_info";
		
	}
	@RequestMapping("/deleteLead")
	public String deleteOneLeadById(@RequestParam("id") long id,Model model) {
		leadService.deleteOneLeadById(id);
		List<Lead> lead = leadService.listAll();
		model.addAttribute("leads", lead);
		return "Lead_details";
		
	}
	@RequestMapping("/UpdateLead")
	public String updateOneLead(@RequestParam("id") long id,Model model) {
		Lead lead = leadService.findOneLeadById(id);
		model.addAttribute("lead", lead);
		return "update_info";
		
	}
	@RequestMapping("/updateOneLead")
	public String updateLeadBuId(@ModelAttribute("xxx") Lead lead,ModelMap model) {
       leadService.saveOneLead(lead);
       List<Lead> leads = leadService.listAll();
		model.addAttribute("leads", leads);
		return "Lead_details";
		
	}

}
