package com.semra;

public class Calculator {

    public static void main(String[] args){

        int result = sum("/", new int[] {200, 50, 2});

        System.out.println(result);
    }
    
    public static int sum(String operator, int[] numbers){

        int result = 0;

        if(operator.equals("/")){
            result = numbers[0];
            for (int i = 1; i < numbers.length; i++) {
                result /= numbers[i];
            }
        }
        
        for (int number : numbers) {

            switch (operator){
                case "+":
                    result += number;
                    break;
                case "-":
                    result -= number;
                    break;
                case "*":
                    if(result == 0){
                        result = 1;
                    }
                    result *= number;
                    break;
                case "/":
                    continue;
                default: throw new RuntimeException("No such operator !");
            }
        }
        return result;
    }
}
