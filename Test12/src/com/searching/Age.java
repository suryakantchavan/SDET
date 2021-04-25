package com.searching;

public class Age extends Exception{
	
	@Override
	public String toString() {
		return "Age [msg=" + msg + "]";
	}

	String msg="";
	
	public Age(String msg)
	{
		this.msg=msg;
	}
	
	
	
	

}
