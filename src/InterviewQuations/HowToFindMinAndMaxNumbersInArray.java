package InterviewQuations;

import java.util.Arrays;
import java.util.List;

public class HowToFindMinAndMaxNumbersInArray {
	public static void main(String[] args) {
		List<Integer> list= Arrays.asList(2,3,4,3,4,5,2,5,2,10,36);
		Integer min=	list.stream().min((x,y)->x.compareTo(y)).get();
		System.out.println(min);
		Integer max=list.stream().max((x,y)->x.compareTo(y)).get();
		System.out.println(max);
	}

}
