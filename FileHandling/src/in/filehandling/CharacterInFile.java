package in.filehandling;

import java.io.FileReader;
import java.io.IOException;

public class CharacterInFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileReader Fr= new FileReader("data.txt");
		int i = Fr.read();
		int count =0;
		
		while(i!=-1)
		{
			count+=1;
			i = Fr.read();
		}
		System.out.println("Number of character in file is: "+ count);
		
		Fr.close();
	}

}
