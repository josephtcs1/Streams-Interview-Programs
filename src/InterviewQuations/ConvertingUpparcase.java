package InterviewQuations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//converting All the country names toUppercase and separate by ,using Java 8
public class ConvertingUpparcase {
public static void main(String[] args) {
	List<String> contries =Arrays.asList("India","Japan","America","Austarelia","Cenada");
	String str=contries.stream().map(x->x.toUpperCase()).collect(Collectors.joining(" ,"));
	System.out.println(str);
	
	
	String j="Joseph JOsh";
	String b=j.toUpperCase();
	System.out.println(b);

	
}
}
