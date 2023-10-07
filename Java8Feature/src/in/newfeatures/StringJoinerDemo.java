package in.newfeatures;

import java.util.StringJoiner;

public class StringJoinerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringJoiner str = new StringJoiner("-");
		str.add("Anushka");
		str.add("You");
		str.add("Can");
		str.add("Do");
		str.add("it");
		
		System.out.println(str);
		
		StringJoiner str2 = new StringJoiner("-","(",")");
		str2.add("Anushka");
		str2.add("You");
		str2.add("Can");
		str2.add("Do");
		str2.add("it");
		
		System.out.println(str2);
	}

}
