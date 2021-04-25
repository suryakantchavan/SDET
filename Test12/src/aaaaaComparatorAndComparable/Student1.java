package aaaaaComparatorAndComparable;

public class Student1 implements Comparable<Student1> {

	int rollNo;
	int age;
	String Name;
	
	 public Student1(int rollNo, int age, String Name) {
		this.age=age;
		this.rollNo=rollNo;
		this.Name=Name;
	}
	
	
	@Override
	public int compareTo(Student1 st) {
		
		if(age==st.age)
		{
		return 0;
		}
		
		else if(age>st.age)
		{
			return 1;
		}
		
		else
		{
			return -1;
		}
	}

}
