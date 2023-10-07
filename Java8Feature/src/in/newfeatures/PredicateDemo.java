package in.newfeatures;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateDemo {
 //  old way of writing a method which checks whether i is greater than 10 or not and return a boolean value
	public boolean test(int i){
		if(i>10)
		{
			return true;
		}else
		{
			return false;
		}
	}
	public static void main(String[] args) {
		
		//Predicate way of writing above method -  Predicate will only take one input
		Predicate<Integer> p = i -> i>10;
		System.out.println(p.test(5));
		System.out.println(p.test(15));

		//It will only accept two inputs
		BiPredicate<Integer,Integer> bip = (i,j) -> (i+j) >=20;
		System.out.println(bip.test(12, 7));
		System.out.println(bip.test(12, 9));
	}

}
