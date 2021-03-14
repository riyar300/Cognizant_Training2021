import java.util.*;
public class TrafficLight {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int c;
		System.out.println("1.Red\n2.Yellow\n3.Green");
		System.out.println("Enter your choice:");
		c=sc.nextInt();
		switch(c) {
		 case 1:System.out.println("Stop");
		 		break;
		 case 2:System.out.println("Ready");
		        break;
		 case 3:System.out.println("Go");
		        break;
		 default:System.out.println("Invalid Input");
		        break;
		}
	}

}
