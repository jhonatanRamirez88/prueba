package com.udemy.service;

import java.util.List;

import com.udemy.entity.Contact;
import com.udemy.model.ContactModel;

public interface ContactService {

	public abstract ContactModel addContact(ContactModel contactmodel);
	public abstract List<ContactModel> ListAllContacts();
	public abstract Contact findContactById(int id);
	public abstract void removeContact(int id);
	public abstract ContactModel findContactByIdModel(int id);
}
