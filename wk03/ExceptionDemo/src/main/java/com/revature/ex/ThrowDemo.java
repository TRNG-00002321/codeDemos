package com.revature.ex;

public class ThrowDemo {

    public static void validateAge(int age) throws InvalidAgeException{
        if(age<18)
            throw new ArithmeticException("Invalid age");
        else
            System.out.println("You can Vote");
    }

    public static void main(String[] args) {
        int age=17;
        try {
            validateAge(age);
        } catch (InvalidAgeException e) {
          e.printStackTrace();
            //System.out.println(e.getMessage());
        }
    }
}
