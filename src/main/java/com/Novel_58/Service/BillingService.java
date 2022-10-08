package com.Novel_58.Service;

import java.util.List;

import com.Novel_58.Entities.Billing;

public interface BillingService {
	public void saveOneBill(Billing bill);
	public List<Billing> listAll();
	public void deleteOneBillById(long id);
	public Billing findOneBillById(long id);
}
