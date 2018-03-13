package sortingCollections.comparator;

import java.util.Comparator;

public class SortByProperty implements Comparator<Student>{

	public int compare( Student s1 , Student s2) {
		return s1.rollno- s2.rollno;
	}
}
