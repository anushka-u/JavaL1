package in.newfeatures;

import java.util.Optional;
import java.util.Scanner;

public class MsgService {

	public static void main(String...strings)
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter id");
		int userId = s.nextInt();
		
		User u = new User();
//		String userName  = u.getUserNameById(userId);
//		
//		String msg = userName.toUpperCase()  + " ,hello" ;
//		System.out.println(msg);
		
		
		Optional<String> os =u.getUserNameById(userId);
		if(os.isPresent())
		{
			String name  = os.get();
			System.out.println("Hello, "+name.toUpperCase());
		}
		else
		{
			System.out.println("No Data found");
		}
			
		
	}
}
