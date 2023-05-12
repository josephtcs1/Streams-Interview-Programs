package InterviewQuations;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DuplicateCharsCount {
	public static void main(String[] args) {
		String josh="joseph josh king kong";
		Map<Character, Long> king=josh.chars().mapToObj(j->(char) j).collect(Collectors.groupingBy(l->l, Collectors.counting()));
           king.forEach((l,m)->System.out.println(l+ " : "+m));	
           
           String King="Nagubamu Joseph";
          Map<Character,Long> Josh= King.chars().mapToObj(k->(char) k).collect(Collectors.groupingBy(f->f, Collectors.counting()));
          Josh.forEach((k,m)->System.out.println(k+" :"+m));
           
           
           
           String kushi="I Love My India";
           List<String> list=Arrays.asList(kushi.split(" "));
           String str=list.stream().map(k-> new StringBuffer(k).reverse()).collect(Collectors.joining(" "));
           System.out.println(str);
           
           String ja="Joseph josh King";
           List<String> list1=Arrays.asList(ja.split(" "));
           String jos=list1.stream().map(l-> new StringBuffer(l).reverse()).collect(Collectors.joining(" "));
           System.out.println(jos);
           
	}

}
