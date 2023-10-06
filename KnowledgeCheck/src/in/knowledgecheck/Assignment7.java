//Display all the even numbers between 50 and 70
package in.knowledgecheck;

import java.util.Scanner;

public class Assignment7 {
	
	static int evenNumber(int a, int b)
	{
		int count =0;
		for(int i =a+1;i<b;i++)
		{
			if(i%2==0)
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
		int c= evenNumber(a,b);
		System.out.println("Even number in between " +a+" and "+b +" is " +c);

		
	}

}
