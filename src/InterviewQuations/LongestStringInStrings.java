package InterviewQuations;

import java.util.Arrays;
import java.util.List;

public class LongestStringInStrings {
public static void main(String[] args) {
	String[] list={"joseph","King","Josephjosh","nagubamujoseph"};
	       String LongestString=Arrays.stream(list).reduce((word1,word2)->word1.length()>word2.length()?word1:word2).get();
	       System.out.println(LongestString);
	       
	       // Approuch2
	       List<String> list2=Arrays.asList("king","kong","joseph","josephjosh");
	       String LongestString1=list2.stream().reduce((josh,joseph)->josh.length()>josh.length()?josh:joseph).get();
	       System.out.println(LongestString1);
	       
	       }
}
