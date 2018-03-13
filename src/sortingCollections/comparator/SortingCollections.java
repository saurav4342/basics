package sortingCollections.comparator;

//Java program to demonstrate working of Comparator
//interface and Collections.sort() to sort according
//to user defined criteria.
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Driver class
public class SortingCollections
{
 public static void main (String[] args)
 {  
 
     List<Student> ar = new ArrayList<Student>();
     ar.add(new Student(111, "sumit", "london"));
     ar.add(new Student(101, "ram", "kolkata"));
     ar.add(new Student(131, "ajay", "bombay"));
     ar.add(new Student(121, "murali", "chicago"));
     
     System.out.println("Unsorted");
     for (int i=0; i<ar.size(); i++)
         System.out.println(ar.get(i));

     Collections.sort(ar, new SortByProperty());

     System.out.println("\nSorted by rollno");
     for (int i=0; i<ar.size(); i++)
         System.out.println(ar.get(i));
 }
}