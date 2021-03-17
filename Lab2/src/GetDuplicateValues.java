
public class GetDuplicateValues {

	public static void main(String[] args) {
		int[] arr= {1,1,3,8,5,6,7,8,9,5,2};
		int i,j,flag=0;
		for(i=0;i<arr.length;i++) {
			for(j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					flag=1;
					break;
				}
			}
			
			if(flag==1) {
				System.out.println(arr[i]+" is a duplicate value");
			}
			flag=0;
			
		}

	}

}
