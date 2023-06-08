package InterviewQuations;

public class MissingNumberFromTheArray {
	
	public static void main(String[] args) {
		
	int[] arr= new int[] {1,2,3,4,5,6,8,9,10};
	int sum= (10*11)/2;
	int actsum= 0 ;
	for(int i=0;i<arr.length;i++) {
		actsum = actsum+arr[i];
		
	}
	
	System.out.println("Missing number  : " +(sum-actsum));
	
	}
	
}
