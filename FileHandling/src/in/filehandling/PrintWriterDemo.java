package in.filehandling;

import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		PrintWriter pw = new PrintWriter(System.out);
		
		pw.print("hi");
		
		pw.flush();
		pw.close();
		
	}

}
