//WAP to count the number of lines in a file
package in.filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LinesInFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub\
		FileReader Fr = new FileReader("data.txt");
		BufferedReader Br =new BufferedReader(Fr);
		String line = Br.readLine();
		int count=0;
		while(line!=null){
			line = Br.readLine();	
			count+=1;
			}
		System.out.println(count);
		
		Fr.close();
		Br.close();
		}
	

}
