package InterviewQuations;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class ManhattanInterview1 {
	
	public static void main(String[] args) {
		Random random =new Random();
//		random.ints(0,10).distinct().limit(100).sorted().forEach(y->System.out.println(y));
//    	random.ints(1,10).distinct().limit(10).sorted().forEach(y->System.out.println(y));
		
		List<String> list =Arrays.asList("joseph","josh","joe","joe","kol");
		String list1List=list.stream().filter(y->y.startsWith("j")).collect(Collectors.joining(" "));
		System.out.println(list1List);
		
		List<String> list1L=	list.stream().filter(y->y.length()>3 && y.startsWith("j") ).collect(Collectors.toList());
		
		System.out.println(list1L);
		
		List<String> str2=list.stream().distinct().collect(Collectors.toList());
		System.out.println(str2);
        String str3=list.stream().collect(Collectors.joining(" "));
        System.out.println(str3);
        
        String jo="(joseph, josh,)";
        List<String> ko=Arrays.asList(jo.split(" "));
        String list5=ko.stream().collect(Collectors.joining(" "));
        System.out.println(list5);

	}

}
