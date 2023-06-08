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
	       
	       
	       List<String> list3=Arrays.asList("King","qeriuyiuer","fkjef","qwroiqe");
	      String Longest= list3.stream().reduce((king,king1)->king.length()>king.length()?king:king1).get();
	      System.out.println(Longest);
	      
	      
	      List<String> list5=Arrays.asList("dfskjerh","aksfjiojef","sdjkfbew","PAEuewg");
	      String longee=list5.stream().reduce((jo,joo)->jo.length()>joo.length()?jo:joo).get();
	      System.out.println(longee);
	       
	       }
}
