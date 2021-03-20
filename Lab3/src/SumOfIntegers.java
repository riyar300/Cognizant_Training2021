import java.util.*;
public class SumOfIntegers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringTokenizer st;
		System.out.println("Enter the line of integers separated by space:");
		st=new StringTokenizer(sc.nextLine()," ");
		int i,sum=0;
		int[] eachInteger=new int[st.countTokens()];
		System.out.println("The integers are:");
		
		while(st.hasMoreTokens()) {
			for(i=0;i<eachInteger.length;i++) {
				eachInteger[i]=Integer.parseInt(st.nextToken());
			}
		}
		
		for(i=0;i<eachInteger.length;i++) {
			sum+=eachInteger[i];
			System.out.println(eachInteger[i]);
		}
	    System.out.println("sum of integers:"+sum);
		
		
		

	}

}
