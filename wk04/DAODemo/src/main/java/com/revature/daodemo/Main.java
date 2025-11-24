package com.revature.daodemo;

import com.revature.daodemo.dao.ContactDAO;
import com.revature.daodemo.dao.ContactsJDBCImpl;
import com.revature.daodemo.model.Contacts;
import com.revature.daodemo.service.ContactsService;
import com.revature.daodemo.service.ContactsServiceImpl;
import com.revature.daodemo.util.ConnectionUtil;

import java.sql.Connection;

public class Main {

    public static void main(String[] args) {
        ContactsService contactsService=new ContactsServiceImpl();
        Contacts contact=contactsService.getContact(0);
        System.out.println(contact);
    }
}
