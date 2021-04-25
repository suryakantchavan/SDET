package com.array;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadTextFile {
	
	public static void main(String[] args) throws IOException {
		
	;    //creates a new file instance  
		FileReader fr=new FileReader(new File("abc.txt"));   //reads the file  
		BufferedReader br=new BufferedReader(fr);  //creates a buffering character input stream  
		StringBuffer sb=new StringBuffer();    //constructs a string buffer with no characters  
		String line;  
		while((line=br.readLine())!=null)
		{
			sb.append(line);
			sb.append("\n");
		}
		fr.close();    //closes the stream and release the resources  
		System.out.println("Contents of File: ");  
		System.out.println(sb.toString());   //returns a string that textually represents the object  
		}  
		
	}


