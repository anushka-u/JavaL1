//Sum of n number using recursion
package in.knowledgecheck;

import java.util.Scanner;

public class Assignment4 {
	
	int SumOfN(int n)
	{
		if(n==0)
		{
			return 0;
		}
		else
		{
			return n+SumOfN(n-1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter n: ");
		int n= scanner.nextInt();
		Assignment4 a4 =new Assignment4();
		int ans = a4.SumOfN(n);
		System.out.println(ans);
		

		
	}

}
