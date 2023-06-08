package InterviewQuations;

import java.util.StringJoiner;

public class StringJoiner1 {
public static void main(String[] args) {
	StringJoiner sj1=new StringJoiner(",", "[" ,"]");
	sj1.add("A").add("B").add("C");
	System.out.println(sj1);
	StringJoiner sj2=new StringJoiner(":");
    sj2.add("P").add("Q");
    System.out.println(sj2);
    
    sj1.merge(sj2);
    System.out.println(sj1);
    
    StringJoiner sj3=new StringJoiner(",", "(" ,")");
    sj3.add("joseph").add("josh").add("king");
    System.out.println(sj3);
	
}
}
