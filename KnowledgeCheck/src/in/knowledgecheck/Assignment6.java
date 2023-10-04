package in.knowledgecheck;

import java.util.Scanner;

public class Assignment6 {

	int factorial(int n)
	{
		if(n==1)
		{
			return 1;
		}
		else
		{
			return n*factorial(n-1);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter n: ");
		int n= scanner.nextInt();
		Assignment6 a6 = new Assignment6();
		int ans = a6.factorial(n);
		System.out.println(ans);
		
	}

}
