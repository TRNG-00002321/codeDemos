package com.revature.java8;

public class CalculatorLambda {
    public static void main(String[] args) {
       /* Calculator calculator=(x,y,op)->{
        if(op.equalsIgnoreCase("add"))
            return x+y;
        else if(op.equalsIgnoreCase("sub"))
            return x-y;
           else
            return 0;
        };

        System.out.println(calculator.operation(2,4,"add"));
        System.out.println(calculator.operation(4,2,"sub"));*/

        printResult(2,3,(x,y)->x+y);
        printResult(3,2,(a,b)->a-b);
    }

    public static void printResult(int a, int b, Calculator func) {
        // perform operation, print result
        int result = func.operation(a, b);
        System.out.println(result);
    }

}
