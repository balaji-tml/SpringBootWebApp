package com.bit;

import java.util.ArrayList;
import java.util.List;

public class ContactBusiness {
	
	public List<Contact> getContactList()
	{
		List<Contact> listcontact = new ArrayList<>();
		listcontact.add(new Contact("Marry John","marry.john@gmail.com","USA"));
		listcontact.add(new Contact("Tom Smith","tomsmith@outlook.com","England"));
		listcontact.add(new Contact("John Purchel","john123@yahoo.com","Australia"));
		listcontact.add(new Contact("Siva Krishna","sivakrishna@gmail.com","India"));
		return listcontact;
	}

}
