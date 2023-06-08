package InterviewQuations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Add Sum of Array to each element of the array using java 8
public class AddSumOfArray {
	public static void main(String[] args) {
		List<Integer> list =Arrays.asList(10,20,30,40,50);
		Integer sum =list.stream().reduce(0, Integer :: sum);
		List<Integer> list1 =list.stream().map(x->x+sum).collect(Collectors.toList());
		System.out.println(list1);
    		System.out.println("hiii");
		
		// Squre the values
		list.stream().map(x->x*x).forEach(y->System.out.println(y));
	}

}
