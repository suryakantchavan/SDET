package CustomSorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListCustomSorting {

	public static void main(String[] args) {

		ArrayList<Employee> list = new ArrayList<>();
		list.add(new Employee(1, "raju", 5000d));
		list.add(new Employee(5, "srinu", 2000d));
		list.add(new Employee(2, "abhi", 15000d));
		list.add(new Employee(9, "balu", 32000d));
		list.add(new Employee(6, "ramu", 200d));
		list.add(new Employee(8, "vamsi", 700d));
		list.add(new Employee(4, "danush", 8000d));
		
		System.out.println("Beofre sortig");
		for (Employee employee : list) {
			System.out.println(employee.getEno()+" "+ employee.getName()+" " +employee.getSalary());
		}

		
		System.out.println("After sorting");
		System.out.println("***********************");
		
		
		
		System.out.println("sorting by number");
		
		Collections.sort(list, (o1,o2)->o1.getEno().compareTo(o2.getEno()));
		for (Employee employee : list) {
			System.out.println(employee.getEno()+" "+ employee.getName()+" " +employee.getSalary());
		}
		
		
		System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||");
		Collections.sort(list,(o1,o2)->o1.getName().compareTo(o2.getName()));
		
		for(Employee emp:list)
		{
			System.out.println(emp.getName()+"  "+emp.getEno()+" "+emp.getSalary());
		}
	}

}
