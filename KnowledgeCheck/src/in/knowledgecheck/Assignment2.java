package in.knowledgecheck;

import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter n: ");
		int n= scanner.nextInt();
		int Sum =0;
		Sum = (n*(1+n))/2;
		System.out.println(Sum);

	}

}
