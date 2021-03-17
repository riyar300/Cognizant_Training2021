import java.util.*;

public class ArrayListToArray {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		//Converting the arraylist to an array of type object
		Object[] arr=list.toArray();
		System.out.println("The object array is");
		for(Object obj:arr) {
			System.out.print(obj+" ");
		}
		
		//Converting the arraylist to an array of type Integer as it contains integer values.
		Integer[] intArray=new Integer[list.size()];
		intArray=list.toArray(intArray);
		System.out.println();
		System.out.println("The integer array is");
		for(int element:intArray) {
			System.out.print(element+" ");
		}
		
		

	}

}
