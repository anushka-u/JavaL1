package in.filehandling;

import java.io.File;
import java.io.IOException;

public class ContentInsideFile {

	public static void main(String[] args) throws IOException {
		//To Create a directory
		File f2 = new File("My Work");
		boolean statusF2 = f2.mkdir(); //mkdir() is used to create directory
		System.out.println(statusF2);
		
		
		
		//To create a file inside a directory
		File f3 = new File(f2,"test.txt");
		boolean statusF3 =f3.createNewFile();
		System.out.println(statusF3);
		
		File f4 = new File(f2,"Demo.txt");
		f4.createNewFile();
		
		File f5 = new File(f2,"Workspace");
		f5.mkdir();
		
		String[] arr = f2.list();
		for(String name:arr)
		{
			System.out.println("Inside loop");
			File obj = new File(f2,name);
			if(obj.isFile())
			{
				System.out.println("File : " + name);
			}
			else if(obj.isDirectory())
			{
				System.out.println("Directory : " + name);
			}
			System.out.println("End of" + name+ " Iteration");
			System.out.println();
		}
		
		f2.deleteOnExit();
		f3.deleteOnExit();
		f4.deleteOnExit();
		f5.deleteOnExit();
		

	}

}
