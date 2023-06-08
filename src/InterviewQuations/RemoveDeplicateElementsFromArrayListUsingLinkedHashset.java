package InterviewQuations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDeplicateElementsFromArrayListUsingLinkedHashset {
	public static void main(String[] args) {
		ArrayList<Integer> numbers=new ArrayList<Integer>(Arrays.asList(23,34,2,3,4,5,6,7,5,4,3,4,3,4,3,5,67,7,54));
		LinkedHashSet<Integer> linkedhashset= new LinkedHashSet<Integer>(numbers);
		System.out.println(linkedhashset);
		ArrayList<Integer> duplictatesremove= new ArrayList<Integer>(linkedhashset);
		System.out.println(duplictatesremove);
		
		

		
	} 

}
