package aaaaaComparatorAndComparable;

import java.util.ArrayList;
import java.util.Collections;

public class TestSortComparable {

	public static void main(String[] args) {
		ArrayList<Student1> al = new ArrayList<>();

		al.add(new Student1(101, 10, "krsna"));
		al.add(new Student1(101, 5, "Radha"));
		al.add(new Student1(101, 2, "Kana"));
		
		Collections.sort(al);
		
		for(Student1 s:al)
		{
			System.out.println(s.age+" " +s.Name+" "+s.rollNo);
		}
	}

}
