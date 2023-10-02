//WAP to find number of words available in file
package in.filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordsInFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader Fr = new FileReader("data.txt");
		BufferedReader Br =new BufferedReader(Fr);
		
		String line = Br.readLine();
		int count =0;
		while(line!=null)
		{
			String[] words = line.split(" ");
			count+=words.length;
			
		}

		System.out.println(count);
		Fr.close();
		Br.close();
	}

}
