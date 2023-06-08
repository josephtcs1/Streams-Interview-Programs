package InterviewQuations;

public class StringSwapWithOutThirdVerible {
	
	public static void main(String[] args) {
		String str1="joseph";
		String str2="josh";
		System.out.println("First String print with swap   "+str1);
		System.out.println("Second String print with out Swaup   "+str2);
		
		str1=str1+str2;
		
		str2=str1.substring(0, str1.length()-str2.length());
		System.out.println(str2);
		str1=str1.substring(str2.length());
		System.out.println("First string after swap   "+str1);
		System.out.println("Second String After swap  "+str2);
		
		
		
	}

}
