package com.revature.person;

public class PersonManager {
    public static void main(String[] args) {
        Person person1=new Person("Alex",22);

        Person person2=new Person();
        person2.setName("Alex");
        person2.setAge(22);

        System.out.println("Person 1 :: "+person1);
        System.out.println("Person 2 :: Name :- "+person2.getName() +" , Age :- "+person2.getAge());

        if(person1.equals(person2))
            System.out.println("Person 1 is equal to Person 2");
        else
            System.out.println("Person 1 is NOT equal to Person 2");
    }
}
