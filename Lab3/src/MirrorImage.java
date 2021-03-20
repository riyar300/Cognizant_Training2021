import java.util.*;
public class MirrorImage {
	
	public static String getImage(String s) {
		int i;
		String mirrorImage=new String();
		char array[]=new char[s.length()];
		for(i=0;i<s.length();i++) {
			array[i]=s.charAt(i);
		}
		for(i=array.length-1;i>=0;i--) {
			mirrorImage+=array[i];
		}
		return s+"|"+mirrorImage;
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s;
		System.out.println("Enter the word:");
		s=sc.nextLine();
		s=getImage(s);
		System.out.println(s);

	}

}
