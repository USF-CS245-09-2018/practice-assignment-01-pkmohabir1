//package edu.usfca.cs.cs245;

public class FactorialIterative implements Factorial{ 
      public int factorial(int n){
        int num =1; 
        for(int i=n;i>0;i--){
            num = num * i;
        }

        return num; 
    }

}


