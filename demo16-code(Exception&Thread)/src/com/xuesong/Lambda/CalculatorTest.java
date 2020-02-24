package com.xuesong.Lambda;

public class CalculatorTest {
    public static void main(String[] args) {
        invokeCal(3, 4, new Calculator() {
            @Override
            public int add(int a, int b) {
                return a+b;
            }
        });

        invokeCal(3,5,(a,b)->{
            return a+b;
        });

        invokeCal(3,4,(a,b)->a+b);

    }

    public static void invokeCal(int a, int b,Calculator calculator){
        int result = calculator.add(a,b);
        System.out.println("result："+result);
    }
}
