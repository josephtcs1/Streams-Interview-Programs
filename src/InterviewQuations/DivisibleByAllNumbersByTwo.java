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
		
		
		List<Integer> list2=Arrays.asList(8,6,5,4,68,3);
		boolean result2=list2.stream().allMatch(y->y%2==0);
		if(result2) {
			System.out.println("All elements Divisible by 2");
		}
		else
		{
			System.out.println("All elements Not Divisible By 2");
		}
		
	}

}
