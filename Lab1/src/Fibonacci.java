import java.util.*;
import java.lang.*;
public class Fibonacci {
	
	public static StringBuilder generateFib(int n) {
		StringBuilder series=new StringBuilder();
		int fib1=0,fib2=1,fib3;
		series.append(fib1);
		series.append(fib2);
		for(int i=0;i<(n-2);i++) {
			fib3=fib1+fib2;
			fib1=fib2;
			fib2=fib3;
			series.append(fib3);
		}
		return series;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of digits in the series:");
		int num=sc.nextInt();
		StringBuilder sb=generateFib(num);
		for(int i=0;i<sb.length();i++) {
			System.out.print(sb.charAt(i));
		}
		
		
		
				
	}

}
