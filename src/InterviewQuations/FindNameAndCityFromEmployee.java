package InterviewQuations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindNameAndCityFromEmployee {
	public static void main(String[] args) {
		Employee e1=new Employee("joseph","Hyd");
		Employee e2=new Employee("Ravi","bang");
		Employee e3=new Employee("Roja","Hyd");
		Employee e4=new Employee("Rakesh","bang");
		Employee e5=new Employee("Charan","Hyd");
		Employee e6=new Employee("Kin","bang");
      List<Employee> list=Arrays.asList(e1,e2,e3,e4,e5,e6);
      list.stream().collect(Collectors.groupingBy(Employee :: getLocation)).entrySet()
      .forEach(y->{System.out.println(y.getKey() +" :");
      System.out.println(y.getValue().stream().map(Employee ::getName).collect(Collectors.joining(":")));
      });
      // Approuch 2
      list.stream().collect(Collectors.groupingBy(Employee :: getLocation)).entrySet()
      .forEach((y)->System.out.println(y));
      // Approuch 3
//      list.stream().filter(y->y.getName()).collect(Collectors.toList());
      
	}

}
