package hashCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DriverClass {

	public static void main(String [] args) {
		Employee emp1 = new Employee(121 , "sam" , 23);
		Employee emp2 = new Employee(121 , "sam" , 23);
		
		
		System.out.println("HashCode--> "+emp1.hashCode());
		
		System.out.println("Check if Objects are equal "+emp1.equals(emp2));
		List<Employee> el = new ArrayList<Employee>();
		el.add(emp1);
		System.out.println("ArrayList contains object " +el.contains(emp2));
		
		Set<Employee> set = new HashSet<Employee>();
		set.add(emp1);
		set.add(emp2);
		System.out.println("HashSet contains object " + set.contains(emp2));
		System.out.println("Size of HashSet -> "+set.size());
	}
}
