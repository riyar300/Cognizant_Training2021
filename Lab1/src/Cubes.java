import java.util.*;
public class Cubes {
	
	public static int sumOfCubes(int num) {
		int r,sum=0;
		while(num>0) {
			r=num%10;
			sum=sum+(r*r*r);
			num=num/10;
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n,cube;
		System.out.println("Enter the number:");
		n=sc.nextInt();
		cube=sumOfCubes(n);
		System.out.println("Sum of cubes of digits of the number is "+cube);
	}

}
