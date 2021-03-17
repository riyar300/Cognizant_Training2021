import java.util.*;
public class sortStringArray {
	
	public static String[] sortStrings(String arr[]){
		int i,j;
		String temp;
		for(i=0;i<arr.length;i++) {
			for(j=i+1;j<arr.length;j++) {
				if((arr[i].compareTo(arr[j]))>0) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String[] arr=new String[5];
		System.out.println("Enter the array elements:");
		int i;
		for(i=0;i<arr.length;i++) {
			arr[i]=sc.nextLine();
		}
		
		String[] sortedArray=sortStrings(arr);
		System.out.println("The sorted array is:");
		for(i=0;i<sortedArray.length;i++) {
			System.out.println(sortedArray[i]);
		}
		
	}

}
