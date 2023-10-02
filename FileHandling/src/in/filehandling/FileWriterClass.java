package in.filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterClass {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter Fw = new FileWriter("data.txt");
		Fw.write("Hi,Good Evening,");
		Fw.write("\n");
	    Fw.write("How are you today");
		Fw.flush();
		Fw.close();
		
		System.out.println("Successfully wrote data");
		
		

	}

}
