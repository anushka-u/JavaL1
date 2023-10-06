//Display all the odd number in between 30 and 50
package in.knowledgecheck;

import java.util.Scanner;

public class Assignment8 {

	static int oddNumber(int a, int b)
	{
		int count =0;
		for(int i =a+1;i<b;i++)
		{
			if(i%2!=0)
			{
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c= oddNumber(a,b);
		System.out.println("Odd number in between " +a+" and "+b +" is " +c);

	}

}
