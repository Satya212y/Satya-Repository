package com.Novel_58.Service;

import java.util.List;

import com.Novel_58.Entities.Lead;

public interface LeadService {
	public void saveOneLead(Lead lead);

	public Lead findOneLeadById(long id);

	public void deleteOneLeadById(long id);

	public List<Lead> listAll();

}
