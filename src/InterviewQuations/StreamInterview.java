package InterviewQuations;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamInterview {
public static void main(String[] args) {
	List<EmployeeList> list =new ArrayList<>();
	list.add(new EmployeeList (11,"joseph",120,123));
	list.add(new EmployeeList (22,"chd",1201,1231));
	list.add(new EmployeeList (11,"ewrrewq",1320,1213));
	list.add(new EmployeeList (11,"jidjwe",1320,1233));
	list.add(new EmployeeList (11,"ewqrq",1203,1323));
	list.add(new EmployeeList (11,"qwtt",1120,13123));
	// print employeee details working based in each department
	
	Map<Integer,List<EmployeeList>> emp=list.stream().collect(Collectors.groupingBy(EmployeeList :: getDeptId,Collectors.toList()));
	emp.forEach((k,v)->System.out.println(k+" "+v));
	
	//print employee count working in each department
	Map<Integer, Long> emp1=list.stream().collect(Collectors.groupingBy(EmployeeList ::getDeptId,Collectors.counting()));
	emp1.forEach((k,v)->System.out.println(k+"    "+v));
	
	//print active and inavctive employees in the given collection
	// print Max/Min employee salary from the given Collection 
	
	Optional<EmployeeList> emppp=list.stream().max(Comparator.comparing(EmployeeList::getSalary));
	System.out.println(emppp);
	Optional<EmployeeList> emppp1=list.stream().min(Comparator.comparing(EmployeeList::getSalary));
	System.out.println(emppp1);
	
	// print the Max salary of an employee from each deportment
	

}
}
