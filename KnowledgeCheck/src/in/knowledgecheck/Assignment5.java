//Print fibonacci series using recursion
// 0 1 1 2 3 5 8
package in.knowledgecheck;

import java.util.Scanner;

public class Assignment5 {
	
	static int n1=0,n2=1,n3=0;
	static void fibonacciSeries(int n)
	{
		if(n>0)
		{
			n3 = n1+n2;
			n1=n2;
			n2=n3;
			System.out.printf(" "+n3);
			fibonacciSeries(n-1);
		}
		 
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.printf("Enter n: ");
		int n= scanner.nextInt();
		System.out.println(n1+" "+n2);
		fibonacciSeries(n-2);


	}

}
