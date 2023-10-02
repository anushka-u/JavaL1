//SERIALIZATION DEMO---
package in.filehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Person implements Serializable {
	/**
	 * Generated SerialVersionUID
	 */
	private static final long serialVersionUID = -101;
	int id;
	String name;
	String email;
	transient String pwd;
	public static void main(String[] args) throws IOException, Exception {
		// TODO Auto-generated method stub
		 Person p = new Person();
		 p.id =100;
		 p.name = "Anushka";
		 p.email ="anushkau032@gmail.com";
		 p.pwd ="CustomMadePassword";
		 
		 FileOutputStream fOS = new FileOutputStream("data.txt");
		 ObjectOutputStream oos = new ObjectOutputStream(fOS);
		 oos.writeObject(p);
		 oos.flush();
		 oos.close();
		 
		 System.out.println("serialization completed");
		 
		 FileInputStream fIs = new FileInputStream("data.txt");
		 ObjectInputStream ois = new ObjectInputStream(fIs);
		 Object object = ois.readObject();
		 Person p1 = (Person)object;
		 System.out.println("Id is "+p1.id);
		 System.out.println("Name is "+p1.name);
		 System.out.println("Email is "+p1.email);
		 System.out.println("Password is "+p1.pwd);
		 ois.close();
		 
	}

}
