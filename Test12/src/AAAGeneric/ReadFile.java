package AAAGeneric;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
	public static void main(String[] args) throws IOException {

		FileReader fr = new FileReader(new File("./abc.txt"));

		BufferedReader br = new BufferedReader(fr);

		StringBuffer bf = new StringBuffer();

		String line;

		while ((line = br.readLine()) != null) {

			bf.append(line);
			bf.append("\n");

		}

		System.out.println(bf.toString());

	}
}
