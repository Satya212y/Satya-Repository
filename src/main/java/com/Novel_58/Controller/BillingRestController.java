package com.Novel_58.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Novel_58.Entities.Billing;
import com.Novel_58.Service.BillingService;


@RestController
@RequestMapping("/bill")
public class BillingRestController {
	@Autowired
	private BillingService billService;
@GetMapping
public List<Billing> getJsonObject() {
	List<Billing> list = billService.listAll();
	return  list;
	
}
@PostMapping
public void addOneBillInBilling(@RequestBody Billing bill) {
	billService.saveOneBill(bill);
}
@PutMapping
public void updateOneBillInBilling(@RequestBody Billing bill) {
	billService.saveOneBill(bill);
}
@DeleteMapping("/delete/{id}")
public void DeleteOneBillInBilling(@PathVariable("id") long id) {
	billService.deleteOneBillById(id);
}
@GetMapping("/api/{id}")
public Billing getOneBillInBilling(@PathVariable("id") long id) {
	Billing findOneBillById = billService.findOneBillById(id);
	
	return findOneBillById;
}

}
