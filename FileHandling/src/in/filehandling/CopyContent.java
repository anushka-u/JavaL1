package in.filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CopyContent {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileWriter f1 = new FileWriter("first.txt");
		f1.write("Hello, It's good to have you here");
		f1.flush(); 
		
		FileWriter f2 = new FileWriter("second.txt");
		f2.write("Hey, I am pleased to be here");
		f2.write("\n");
		f2.write("Thanks for inviting us over");
		
		File f3 = new File("");
	
		
	}

}
