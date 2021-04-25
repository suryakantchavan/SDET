package aaaaaComparatorAndComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestSortComparator {

	 public static void main(String[] args) {
		 ArrayList<Student> al=new ArrayList<Student>();    
		  al.add(new Student(101,"Vijay",23));    
		  al.add(new Student(106,"Ajay",27));    
		  al.add(new Student(105,"Jai",21));  
		  
		  Comparator<Student> cm1= Comparator.comparing(Student::getName);
		  
		  Collections.sort(al,cm1);
		  
		  for(Student s:al)
		  {
			  System.out.println(s.getName()+" " +s.getRollNo()+" "+s.getAge());
		  }
		  System.out.println();
		  
		////another method
		  Collections.sort(al, (o1, o2)->o1.getName().compareTo(o2.getName()));
		  
		  for(Student s:al)
		  {
			  System.out.println(s.getName()+" " +s.getRollNo()+" "+s.getAge());
		  }
		  
		  
	}
	  
}
