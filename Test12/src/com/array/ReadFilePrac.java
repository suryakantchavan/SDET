package com.array;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFilePrac {

	public static void main(String[] args) throws IOException {

		FileReader fr = new FileReader(new File("./abc.txt"));

		BufferedReader br = new BufferedReader(fr);

		StringBuffer sb = new StringBuffer();

		String line;

		while ((line = br.readLine()) != null) {
			sb.append(line);
			sb.append("\n");
		}

		System.out.println(sb.toString());
	}

}
