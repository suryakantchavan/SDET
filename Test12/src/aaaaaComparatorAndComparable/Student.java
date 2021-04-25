package aaaaaComparatorAndComparable;

public class Student {
	private int age;
	private int rollNo;
	private String name;

	public Student(int rollNo, String Name, int age) {
	
		this.rollNo=rollNo;
		this.name=Name;
		this.age=age;
	}
	
	

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
	

}
