package com.Novel_58.Service;

import java.util.List;

import com.Novel_58.Entities.Contact;
import com.Novel_58.Entities.Lead;

public interface ContactService {
public void saveOneContact(Contact contact);

public List<Contact> listAll();

public Contact findOneContactById(long id);

public Contact findOneLeadById(long id);

public void deleteOneContactById(long id);
}
