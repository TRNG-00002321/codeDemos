package com.revature.collect;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
         Set<String> names=new LinkedHashSet<>() ;

        names.add("Andrew");
        names.add("Ian");
        names.add("Brandon");

        System.out.println(names);

        for(String name:names)
            System.out.println(name);
    }
}
