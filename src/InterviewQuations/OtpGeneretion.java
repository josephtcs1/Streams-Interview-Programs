package InterviewQuations;

public class OtpGeneretion {
	public static void main(String[] args) {
		int random=(int) (Math.random()*9000)+1000;
		String otp=String.valueOf(random);
		System.out.println("OTP.."+otp);
	}
	

}
