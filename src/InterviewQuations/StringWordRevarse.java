package InterviewQuations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringWordRevarse {
public static void main(String[] args) {
	String name ="India is My Contry";
	List<String> str=Arrays.asList(name.split(" "));
	String str2=str.stream().map(x-> new StringBuffer(x).reverse()).collect(Collectors.joining(" "));
	System.out.println(str2);
	
	
	String josh="josh is josh king";
	List<String> list=Arrays.asList(josh.split(" "));
	  String str3=list.stream().map(x-> new StringBuffer(x).reverse()).collect(Collectors.joining(" "));
	  System.out.println(str3);
	  
	  
	  String king="king is best cricketer";
	  List<String> ko=Arrays.asList(king.split(" "));
	  
//=ko.stream().map(k-> new StringBuffer(x).reverse()).collect(Collectors.toList());
	
	
}
}
