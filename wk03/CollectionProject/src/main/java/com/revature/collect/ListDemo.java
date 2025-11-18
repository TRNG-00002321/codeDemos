package com.revature.collect;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String> myList=new ArrayList<String>();
        //myList.add(1);
        myList.add("Moses");
        myList.add("Jasdhir");
        myList.add("Nikhil");

        myList.add(1,"Perry");
        //myList.add(10.3);

        System.out.println(myList.get(1));

        Iterator iterator=myList.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());


        for(int i=0;i<myList.size();i++)
            System.out.println(myList.get(i));

        for(String str:myList)
            System.out.println(str);

        myList.remove(1);
        System.out.println(myList);
    }


}
