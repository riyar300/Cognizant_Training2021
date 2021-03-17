import java.util.*;
public class FindASpecificValue {

	public static void main(String[] args) {
		 int[] arr= {10,0,8,345,67,8,7};
		 int flag=0,index=0;
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the value you want to find:");
		 int value=sc.nextInt();
		 for(int i=0;i<arr.length;i++) {
			 if(arr[i]==value) {
				 flag=1;
				 index=i;
				 break;
			 }
		 }if(flag==1) {
		 System.out.println(value+" is found at index "+index);
		 }else {
		 System.out.println(value+" is not in the array");
		 }

	} 

}
