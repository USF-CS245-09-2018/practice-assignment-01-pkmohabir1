public class FibonacciIterative implements Fibonacci{ 
 
     public int fibonacci(int n){
 		int num1=0;
 		int num2=1;
 		int num=0;
 		
 		if(n<=1){
 			return 1;
 		}
 		
 		for(int i=0; i<=n-2; i++){
 			num = num1+num2;
 			num1=num2;
 			num2 = num;
 		}
 		
 		return num;
 	}

 } 