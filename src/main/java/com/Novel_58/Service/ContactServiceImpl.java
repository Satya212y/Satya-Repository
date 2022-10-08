package com.Novel_58.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Novel_58.Entities.Contact;
import com.Novel_58.Entities.Repositories.ContactRepository;
@Service
public class ContactServiceImpl implements ContactService {
@Autowired
 private ContactRepository contactRepo;
	@Override
	public void saveOneContact(Contact contact) {
		contactRepo.save(contact);
	}
	@Override
	public List<Contact> listAll() {
		List<Contact> contact = contactRepo.findAll();
		return contact;
	}
	@Override
	public Contact findOneContactById(long id) {
		Optional<Contact> findById = contactRepo.findById(id);
		return findById.get();
	}
	@Override
	public Contact findOneLeadById(long id) {
		Optional<Contact> findById = contactRepo.findById(id);
		return findById.get();
	}
	@Override
	public void deleteOneContactById(long id) {
		contactRepo.deleteById(id);
	}

}
