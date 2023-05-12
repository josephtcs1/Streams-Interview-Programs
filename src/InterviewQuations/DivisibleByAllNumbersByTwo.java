package InterviewQuations;

import java.util.Arrays;
import java.util.List;

public class DivisibleByAllNumbersByTwo {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(2,4,6,8,5,10);
		boolean result=list.stream().allMatch(n->n%2==0);
		if(result) {
			System.out.println("All elements divisible by 2");
		}
		else
		{
			System.out.println("All elements not divisible by 2");
		}
	}

}
