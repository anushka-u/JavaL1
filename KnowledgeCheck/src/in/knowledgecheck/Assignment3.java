//Print number from 1 to 10 using recursion
package in.knowledgecheck;
import java.util.Scanner;

public class Assignment3 {
	
	void printSequence(int i,int n)
	{
		if(n==i)
		{
			System.out.println(i);
			return;
		}
		else {
			System.out.println(i);
			printSequence(i+1,n);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter n: ");
		int n= scanner.nextInt();
		Assignment3 as = new Assignment3();
		as.printSequence(1,n);
		

	}

}
