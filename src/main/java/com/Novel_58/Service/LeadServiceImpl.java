package com.Novel_58.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Novel_58.Entities.Lead;
import com.Novel_58.Entities.Repositories.LeadRepository;
@Service
public class LeadServiceImpl implements LeadService {
@Autowired
private LeadRepository LeadRepo;
	@Override
	public void saveOneLead(Lead lead) {
		LeadRepo.save(lead);
		
	}
	@Override
	public Lead findOneLeadById(long id) {
		Optional<Lead> findById = LeadRepo.findById(id);
		return findById.get();
	}
	@Override
	public void deleteOneLeadById(long id) {
		LeadRepo.deleteById(id);
	}
	@Override
	public List<Lead> listAll() {
		List<Lead> findAll = LeadRepo.findAll();
		return findAll;
	}

}
