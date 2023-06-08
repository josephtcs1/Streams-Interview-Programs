package InterviewQuations;

import java.util.Arrays;
import java.util.List;

public class StartWithOneUsingJava8 {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(2,4,1,12,1,3,1,3,1,3,12,19);
		list.stream().map(s->s+"").filter(s->s.startsWith("1")).forEach((y)->System.out.println(y));
	}

}
