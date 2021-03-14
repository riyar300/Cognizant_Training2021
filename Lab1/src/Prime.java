import java.util.*;
public class Prime {
	
	public static void getPrime(int n) {
		int flag=0;
		for(int i=2;i<=n;i++) {
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					flag=1;
					break;
				}
			}
			if(flag==0) {
				System.out.print(i+"\t");
			}
			flag=0;
		}
	}

	public static void main(String[] args) {
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		num=sc.nextInt();
		getPrime(num);

	}

}
