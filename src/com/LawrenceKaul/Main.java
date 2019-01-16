package com.LawrenceKaul;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // int x = first parameter, int y = second parameter

        int x = 3;
        int y = 5;


        for(int i = 1; i <= 100; i++){
            if(i % x == 0 && i % y == 0) {
                System.out.println("FizzBuzz");
            } else if(i % x == 0){
                System.out.println("Fizz");
            } else if (i % y == 0){
                System.out.println("Buzz");
            }else {
            System.out.println(i);
            }
        }
    }
}
