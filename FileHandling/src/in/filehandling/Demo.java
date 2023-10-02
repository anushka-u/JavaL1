package in.filehandling;
import java.io.File;
import java.io.IOException;
public class Demo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File f = new File("abc.txt"); // We just created an object
		f.createNewFile(); // file got created, to create a file we are using createNewFile
		
		File f1 = new File("xyz.txt");
		boolean Statusf1 = f1.createNewFile();
		System.out.println(Statusf1);
		
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
		
		String[] arr = f2.list();
		for( String name:arr)
		{
			System.out.println(name);
			File fobj = new File(name);
			boolean statusofObj = fobj.isFile();
			System.out.println(statusofObj);
		}
		
		
		f.deleteOnExit(); // will delete the files on exit
		f1.deleteOnExit();
		f2.deleteOnExit();
		f3.deleteOnExit();
		
	}

}
