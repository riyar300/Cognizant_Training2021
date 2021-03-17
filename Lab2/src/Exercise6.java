import java.util.*;
public class Exercise6 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[20],i,count=0;
		System.out.println("Enter 20 elements:");
		for(i=0;i<20;i++) {
			arr[i]=sc.nextInt();
		}
		
		//Finding no. of odd numbers
		System.out.print("No. of Odd elements in the array ");
		for(i=0;i<arr.length;i++) {
			if(!(arr[i]%2==0)) {
				count++;
			}
		}
		System.out.println(count);
		count=0;
		//Finding the no. of even numbers
		System.out.print("No. of even elements in the array ");
		for(i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				count++;
			}
		}
		System.out.print(count);
		count=0;
		//Finding the no. of positive numbers
		System.out.print("No. of positive elements in the array ");
		for(i=0;i<arr.length;i++) {
			if(arr[i]>0) {
				count++;
			}
		}
		System.out.print(count);
		count=0;
		
		//Finding the no. of negative numbers
		System.out.print("No. of negative elements in the array ");
		for(i=0;i<arr.length;i++) {
			if(arr[i]<0) {
				count++;
			}
		}
		System.out.print(count);
		count=0;
		
		//Finding the no. of zeros
		System.out.println("No. of 0's in the array");
		for(i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				count++;
			}
		}
		System.out.print(count);
		

	}

}
