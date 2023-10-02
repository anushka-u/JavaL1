package in.filehandling;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader Fr = new FileReader("data.txt");
		int i=Fr.read();
		
		while(i!=-1)
		{
			System.out.print((char)i);
			i=Fr.read();
		}
		
		Fr.close();
	}

}
