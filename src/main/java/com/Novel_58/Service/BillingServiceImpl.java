package com.Novel_58.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Novel_58.Entities.Billing;
import com.Novel_58.Entities.Repositories.BillingRepository;
@Service
public class BillingServiceImpl implements BillingService {
@Autowired
private BillingRepository billRepo;

	@Override
	public void saveOneBill(Billing bill) {
		billRepo.save(bill);
	}

	@Override
	public List<Billing> listAll() {
		List<Billing> bills = billRepo.findAll();
		return bills;
	}

	@Override
	public void deleteOneBillById(long id) {
		billRepo.deleteById(id);		
	}

	@Override
	public Billing findOneBillById(long id) {
		Optional<Billing> findById = billRepo.findById(id);
		return findById.get();
	}

}
