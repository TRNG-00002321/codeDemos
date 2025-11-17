package com.revature.ex;

public class ExceptionDemo01 {
    public static void main(String[] args) {
        int [] myArray=new int[5];
        try {
            myArray[5] = 10;
            }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
            //System.out.println(e.getMessage());
        }

        System.out.println("Ending Execution....");

    }
}
