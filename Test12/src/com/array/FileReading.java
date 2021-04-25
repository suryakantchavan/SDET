package com.array;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReading {
	
	public static void main(String[] args) throws IOException {
	
		
		File file = new File("./abc.txt");
		FileReader fr= new FileReader(file);
		
		BufferedReader fb=  new BufferedReader(fr);
		
		StringBuffer sb = new StringBuffer();
		
		String line;
		
		while((line=fb.readLine())!=null)
		{
			sb.append(line);
			sb.append("\n");
		}
		
		System.out.println(sb.toString());	
	}

}
