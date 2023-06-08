package InterviewQuations;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Java8InterviewQuetionsImp {
public static void main(String[] args) {
	// Find Unique values from Array
	List<Integer> list =Arrays.asList(2,3,4,5,4,32,4,3,22,2,3,4,2,5,6);
	List<Integer> unque	=list.stream().distinct().collect(Collectors.toList());
	System.out.println(unque);
	
	// Find Duplicate Elements from given Integer List
	List<Integer> list1=Arrays.asList(2,3,4,3,2,12,34,13,23);
	Set<Integer> set =new HashSet<>();
	list1.stream().filter(y->!set.add(y)).collect(Collectors.toList()).forEach(y->System.out.println(y));
	
	// Number of Occurrences count in Sentences Count
	
	String str="Hi I am joseph how are all";
	List<String> list4 =Arrays.asList(str.split(" "));
	Map<String, Long> list5=list4.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	System.out.println(list5);
	
	// Skip() method And limit() method example
	
	List<Integer> list6=Arrays.asList(2,3,4,2,3,4,10,12,12,14,15);
	list6.stream().skip(4).forEach(y->System.out.println(y));
	list6.stream().limit(2).forEach(y->System.out.println("limit method"+y));
}
}
