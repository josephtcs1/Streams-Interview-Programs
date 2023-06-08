 package InterviewQuations;

import java.util.Map;
import java.util.stream.Collectors;

public class CountDuplicateCharsInString {
	public static void main(String[] args) {

		// given Input to String
		String str="josephjosh";
		// converting string in to stream
		Map<Character,Long> results=str.chars().mapToObj(x->(char) x).collect(Collectors.groupingBy(c->c,Collectors.counting() ));
		results.forEach((k,v)->System.out.println(k+ " : "+v));
		
		
		String string="KingKohliKIng";
		Map<Character,Long> josh=string.chars().mapToObj(x->(char) x).collect(Collectors.groupingBy(j->j, Collectors.counting()));
	josh.forEach((j,n)->System.out.println(j+" :"+n));	
	
	
	String joseph="Kisajkkjdhjahwerwerwer";
	           Map<Character,Long> kinh=joseph.chars().mapToObj(x->(char) x).collect(Collectors.groupingBy(k->k,Collectors.counting()));
	      //  System.out.println(kinh);   
	   kinh.forEach((k,n)->System.out.println(k+" ,"+n));
	   
	   
	   String king ="josepj kosjd iwejwiwdgggggggggggggggsgsdfwerwr";
	  Map<Character,Long> josh1= king.chars().mapToObj(k->(char) k).collect(Collectors.groupingBy(i->i,Collectors.counting()));
	  System.out.println(josh1);
	  josh1.forEach((k,m)->System.out.println(k+" : "+m));
	  
	  
	   String str4 ="joasojpijq";
	 Map<Character,Long> jodhh  =str4.chars().mapToObj(l->(char) l).collect(Collectors.groupingBy(k->k,Collectors.counting()));
	 jodhh.forEach((k,m)->System.out.println(k+" :: "+m));
	   
	   
	   
	   
	   
	}
            
}
