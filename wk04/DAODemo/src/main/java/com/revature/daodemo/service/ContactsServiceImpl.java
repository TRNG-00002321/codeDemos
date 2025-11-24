package com.revature.daodemo.service;

import com.revature.daodemo.dao.ContactDAO;
import com.revature.daodemo.dao.ContactsJDBCImpl;
import com.revature.daodemo.model.Contacts;

public class ContactsServiceImpl implements ContactsService{
    public  Contacts getContact(int id) {

        ContactDAO contactDAO=new ContactsJDBCImpl();
        if(id>0) {
            Contacts contacts = contactDAO.getContact(id);
            return contacts;
        }
        return null;
    }
}
