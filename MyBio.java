
public class MyBio {
	
	private static int personId;
	private static String personName;
	private static String location;
	private static String contact;
	private static String email;
	
	

	public static void main(String[] args) {
		getInput(1001,"Riya Roy","Kolkata","9123691991","908318@cognizant.com");
		showOutput();

	}
	private static void getInput(int id,String name,String loc,String cont,String em) {
		personId=id;
		personName=name;
		location=loc;
		contact=cont;
		email=em;
	}
	
	private static void showOutput() {
		System.out.println("Id:"+personId+"\nName:"+personName+"\nLocation:"+location+"\nContact:"+contact+"\nEmail:"+email);
	}

}
