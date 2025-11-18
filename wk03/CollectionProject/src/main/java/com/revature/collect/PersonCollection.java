package com.revature.collect;

import java.util.ArrayList;
import java.util.List;

public class PersonCollection {
    public static void main(String[] args) {

        Person p1=new Person(1,"Alex",22);
        Person p2=new Person(2,"Vu",22);

        List<Person> personList=new ArrayList<Person>();

        personList.add(p1);
        personList.add(p2);
        for(Person p:personList)
            System.out.println(p);
    }
}
