package InterviewQuations;

import java.util.Arrays;

public class TwoIntegersArraysFindUnique {
	public static void main(String[] args) {
		int[] firstArray= {1,3,4,5,6};
		int[] secondArray= {3,3};
		Arrays.stream(firstArray).filter(y->Arrays.stream(secondArray).allMatch(x->x==y))
	.forEach((y)->System.out.println(y));
	}

}
