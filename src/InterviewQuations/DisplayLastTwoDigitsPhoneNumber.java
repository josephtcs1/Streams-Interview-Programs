package InterviewQuations;

public class DisplayLastTwoDigitsPhoneNumber {
	public static void main(String[] args) {
		String phoneNumber="09494740057";
				String reex=phoneNumber.replaceAll(".(?=.{2})", "#");
				System.out.println(reex);
				
				// remove the special charectors
				 String num= "ewkpwe123!##2djjdsf@#ndcs";
				 String original =num.replaceAll("[^A-Z0-9]", "");
				 System.out.println(original);
	}
}
