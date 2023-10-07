package in.newfeatures;

import java.util.function.Supplier;

public class SupplierDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String symbols  = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		
		Supplier<String>s = ()->{
			String otp = " ";
			for(int i=1;i<=6;i++)
			{
				otp  = otp+ (int) (Math.random() * 10);

			}
			return otp;
		};
	
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
		
	}

}
