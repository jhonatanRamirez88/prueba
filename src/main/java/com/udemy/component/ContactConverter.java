package com.udemy.component;

import org.springframework.stereotype.Component;

import com.udemy.entity.Contact;
import com.udemy.model.ContactModel;

// TODO: Auto-generated Javadoc
/**
 * The Class ContactConverter.
 */
@Component("contactConverter")
public class ContactConverter {

	/**
	 * Convert contact model 2 contact.
	 *
	 * @param contactModel the contact model
	 * @return the contact
	 */
	public Contact convertContactModel2Contact(ContactModel contactModel){
		Contact contact = new Contact();
		contact.setId(contactModel.getId());
		contact.setCity(contactModel.getCity());
		contact.setLastname(contactModel.getLastname());
		contact.setFirstname(contactModel.getFirstname());
		contact.setTelephone(contactModel.getTelephone());
		return contact;
	}
	
	/**
	 * Convert contact 2 contact model.
	 *
	 * @param contact the contact
	 * @return the contact model
	 */
	public ContactModel convertContact2ContactModel(Contact contact){
		ContactModel contactModel = new ContactModel();
		contactModel.setId(contact.getId());
		contactModel.setCity(contact.getCity());
		contactModel.setLastname(contact.getLastname());
		contactModel.setFirstname(contact.getFirstname());
		contactModel.setTelephone(contact.getTelephone());
		return contactModel;
	}
}
