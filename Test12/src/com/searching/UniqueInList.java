package com.searching;

import java.util.ArrayList;
import java.util.List;

public class UniqueInList {

	public static void main(String[] args) {

		List<ArrayList<String>> listOfLists = new ArrayList<ArrayList<String>>();
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("Delhi");
		list1.add("Mumbai");
		listOfLists.add(list1);

		ArrayList<String> anotherList = new ArrayList<String>();

		anotherList.add("Beijing");
		anotherList.add("Shanghai");
		listOfLists.add(anotherList);

		
		System.out.println(listOfLists);
	}

}
