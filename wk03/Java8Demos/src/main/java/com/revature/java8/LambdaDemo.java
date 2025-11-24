package com.revature.java8;

import java.io.Closeable;
import java.io.Serializable;
import java.rmi.Remote;
import java.util.Comparator;

public class LambdaDemo {
    public static void main(String[] args) {

        Calculator calculator=(n1, n2)-> (n1+n2);

        System.out.println(calculator.operation(3,4));


    }
}
