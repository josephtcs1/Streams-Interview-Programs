package InterviewQuations;

public class DuplicateCharectorsInString {
	public static void main(String[] args) {
		String str="joseph josh";
		//int count=0;
		char[] str2=str.toCharArray();
		for(int i=1;i<str2.length;i++) {
			for(int j=i+1;j<str2.length;j++) {
				if(str2[i]==str2[j]) {
					System.out.println(str2[j]);
					
					//count++;
					//break++;
					
				}
			}
		}

		}

}
