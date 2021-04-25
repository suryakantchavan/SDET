package com.comparator;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {

		TreeSet<Integer> set = new TreeSet<>(new MyComparator());

		set.add(10);
		set.add(0);
		set.add(5);
		set.add(15);
		set.add(20);
		set.add(20);
		System.out.println(set);
	}

}

class MyComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer ob1, Integer ob2) {
		if (ob1 < ob2) {
			return 1;

		}

		else if (ob1 > ob2) {
			return -1;
		}

		else {
			return 0;
		}
	}

}
