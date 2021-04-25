package AAAGeneric;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader122 {

	public static void main(String[] args) throws IOException {

		File f = new File("./abc.txt");
		FileReader fr = new FileReader(f);

		BufferedReader br = new BufferedReader(fr);

		StringBuffer bf = new StringBuffer();

		String line;

		while ((line=br.readLine())!=null) {
			bf.append(line);
			bf.append("\n");
		}

		System.out.println(bf.toString());
	}

}
