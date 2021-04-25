package com.array;

public class ArrayInPlaceRemovingDuplicate {
	
	public static void main(String[] args) {
		int nums[]= {0,0,1,1,1,2,2,3,3,4};
		
		 int reserve = 1;
	        // first one can never be duplicate
	        for (int i = 1; i < nums.length; i++) {   
	            if (nums[i] != nums[i-1]) {        //TODO: not  if (nums[i] != nums[reserve])  think why
	                nums[reserve] = nums[i];
	                reserve++;
	            }
	        }
	      System.out.println(reserve);
	}

}
