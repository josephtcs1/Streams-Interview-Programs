package InterviewQuations;

import java.util.Arrays;
import java.util.List;

public class StartWithSameCharectorEndWithSameCharector {
	public static void main(String[] args) {
		List<String> list=Arrays.asList("lml","xlx","josh","kin","lom");
		list.stream().filter(y->y.length()>0 && y.endsWith(String.valueOf(y.charAt(0))))
		.forEach(y->System.out.println(y));
		
		
		
		List<String> list1=Arrays.asList("mlm","xlx","sls","klk","joj");
		list1.stream().filter(y->y.endsWith(String.valueOf(y.charAt(0)))).forEach(h->System.out.println(h));
		
	}

}
