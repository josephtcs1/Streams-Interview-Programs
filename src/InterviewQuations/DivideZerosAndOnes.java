package InterviewQuations;

import java.util.Arrays;
import java.util.List;

public class DivideZerosAndOnes {
	public static void main(String[] args) {
		List<Integer> list =Arrays.asList(1,0,1,0,1,1,0,1);
		Integer sum=list.stream().reduce(0, Integer :: sum);
		System.out.println("Number of  1s are : "+sum);
		System.out.println("Number of 0s are   :"+(list.size()-sum));
	}

}
