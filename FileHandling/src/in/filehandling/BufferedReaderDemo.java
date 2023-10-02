package in.filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader Fr =new FileReader("data.txt");
		BufferedReader br =new BufferedReader(Fr);
		String line = br.readLine();
		
		while(line!=null)
		{
			System.out.println(line);
			line = br.readLine();
		}
		
	}

}
