package InterviewQuations;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class random {
	public static void main(String[] args) {
     List<String> list =Arrays.asList("joseph","joe","john","joe");
     List<String> str1=list.stream().distinct().collect(Collectors.toList());  
     System.out.println(str1);
     
     Random random = new Random();
     random.ints(1,10).distinct().limit(10).sorted().forEach(System.out::println);
	random.ints(1,100).distinct().limit(10).sorted().forEach(System.out::println);

	}

}
