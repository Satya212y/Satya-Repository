package com.Novel_58.Controller;

import java.util.List;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Novel_58.Entities.Billing;
import com.Novel_58.Entities.Contact;
import com.Novel_58.Entities.Lead;
import com.Novel_58.Service.BillingService;
import com.Novel_58.Service.ContactService;
import com.Novel_58.Service.LeadService;

@Controller
public class BillingController {
@Autowired
private BillingService billService;
@Autowired
private ContactService contactService;
@Autowired
private LeadService leadService;
@RequestMapping("/savebill")
public String saveOneBill(@ModelAttribute Billing bill,ModelMap model) {
	billService.saveOneBill(bill);
	List<Billing> listAll = billService.listAll();
	 model.addAttribute("Bill", listAll);
	return "Billing_details";
	
}
 @RequestMapping("/billlist")
public String getAllBills(ModelMap model) {
	 List<Billing> listAll = billService.listAll();
	 
	 model.addAttribute("Bill", listAll);
	return "Billing_details";
	
}
 @RequestMapping("/delete")
 public String deleteOneBillById(@RequestParam("id") long id,Model model) {
	 billService.deleteOneBillById(id);
	 List<Billing> listAll = billService.listAll();
	 model.addAttribute("Bill", listAll);
	return "Billing_details";
	 
 }
 @RequestMapping("/billinfo")
 public String billInfo(@RequestParam("id") long id,@RequestParam("id") long id1,ModelMap model) {
	 Billing bill = billService.findOneBillById(id);
	 model.addAttribute("bill", bill);
	return "one_Bill_info";
	 
 }
 @RequestMapping("/convertIntoLead")
 public String convertIntoLead(@RequestParam("id") long id,ModelMap model) {
	 Contact lead = contactService.findOneContactById(id);
	 Lead l =new Lead();
			
	
		l.setFirstName(lead.getFirstName());
		l.setLastName(lead.getLastName());
		l.setEmail(lead.getEmail());
		l.setGender(lead.getGender());
		l.setLeadSource(lead.getLeadSource());
		l.setMobile(lead.getMobile());
		leadService.saveOneLead(l);
		contactService.deleteOneContactById(id);
		List<Lead> leads = leadService.listAll();
		model.addAttribute("leads", leads);
		return "Lead_details";
	 
 }


}
