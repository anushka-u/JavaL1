package in.knowledgecheck;
import java.util.Scanner;

public class SumOfNInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter n: ");
		int n= scanner.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			sum+=i;
		}
		System.out.println("Sum of Integers from 1 to "+ n +" is " + sum);
		

	}

}
