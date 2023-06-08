package InterviewQuations;

public class CountNumberOfDigitsInIntiger {
	public static void main(String[] args) {
		int count=0;
		long num =2361123;
		while(num!=0) {
			num=num/10;
			count++;
		}
		System.out.println(count++);
	}

}
