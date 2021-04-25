package com.array;



public class KLengthAprat {
	
	
	public static boolean kLengthApart(int[] nums, int k) {
	    int count=Integer.MAX_VALUE;
	    int temp=0;
	    for(temp=0;temp<nums.length;temp++){
	        if(nums[temp]==1)
	            break;
	    }
	    for(int i=temp;i<nums.length;i++){
	        if(nums[i]==1){
	            if(count<k)
	                return false;
	            count=0;
	        }
	        else {
	            count++;
	        }
	    }
	    return true;
	}
	
public static void main(String[] args) {
	
	
	int nums[]= {1,1,0,1};
	int k=2;
	 boolean b=kLengthApart(nums, k);
	 System.out.println(b);
}
}
