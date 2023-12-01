package com.delbusque;

public class Application {
    public static void main(String[] args){
        fib(100);
    }

    public static void fib(int boundary){
        int first = 1;
        int second = 2;
        int temp = 0;

        while(first < boundary){
            System.out.println(first);
            temp = second;
            second = first + second;
            first = temp;
        }
    }
}
