package InterviewQuations;

import java.util.Map;
import java.util.stream.Collectors;

public class DuplicateCharsInString {
	public static void main(String[] args) {
		String josh="joadhiohasdoi oieiowef";
   Map<Character,Long> king=josh.chars().mapToObj(k-> (char) k).collect(Collectors.groupingBy(y->y, Collectors.counting()));
   king.forEach((k,n)->System.out.println(k+" "+n));
	}
	
			

}
