package InterviewQuations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ManhattanInterview {
	public static void main(String[] args) {
		List<String> list =Arrays.asList("joseph","josh","joe","joe");
		String list1List=list.stream().filter(y->y.startsWith("j")).collect(Collectors.joining(" "));
		System.out.println(list1List);
		
		List<String> list1L=	list.stream().filter(y->y.length()>3).collect(Collectors.toList());
		
		System.out.println(list1L);
		
		list.stream().distinct().collect(Collectors.toList()).forEach(y->System.out.println());
	}

}
