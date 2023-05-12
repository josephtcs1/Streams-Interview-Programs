package InterviewQuations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
// Merge the two Arrays in List
// Print unique values from the list
public class MergeList {
	public static void main(String[] args) {
		List<Integer> list1=Arrays.asList(2,3,4,24,64,32,23);
		List<Integer> list2=Arrays.asList(7,8,75,45,3,35,3);
		List<Integer> mergeList= Stream.concat(list1.stream(), list2.stream()).collect(Collectors.toList());
		System.out.println(mergeList);
		
		List<Integer> unique=mergeList.stream().distinct().collect(Collectors.toList());
		System.out.println(unique);
	}

}
