//Reversing a String using recursion

package in.knowledgecheck;

import java.util.Scanner;
public class ReverseAString {
	
	static void reverseAString(String s)
	{
		if(s.length()==0)
		{
			return;
		}
		reverseAString(s.substring(1));
		System.out.print(s.charAt(0));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		reverseAString(str);
		
		
	}

}
