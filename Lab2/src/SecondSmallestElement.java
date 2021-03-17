import java.util.*;
public class SecondSmallestElement {
	
	public static int getSecondSmallest(int arr[]) {
		Arrays.sort(arr);
		return arr[1];
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,arr[]=new int[5];
		System.out.println("Enter the elements");
		for(i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		int secondSmallestElement=getSecondSmallest(arr);
		System.out.println("The second smallest element is "+secondSmallestElement);
		

	}

}
