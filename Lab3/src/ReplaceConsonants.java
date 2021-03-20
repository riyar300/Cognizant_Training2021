import java.util.Scanner;

public class ReplaceConsonants {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the word:");
		String alteredWord=alterString(sc.nextLine());
		System.out.println(alteredWord);
		}

	private static String alterString(String str) {
		
		int i;
		str=str.toLowerCase();
		String str2="";
		char c=' ';
		for(i=0;i<str.length();i++)
		{	
			c=str.charAt(i);
			if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
				{
				str2=str2+c;
				}
			else
			{
				char m=((char)((int)c+1));
				str2=str2+m;
			}
		}
		return str2;
	}

}