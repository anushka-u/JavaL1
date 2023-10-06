package collectionInJava;

import java.util.StringTokenizer;

public class Tokenizer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    String s = "Core Java tutorial";
		StringTokenizer st =new StringTokenizer(s, " ");
		while(st.hasMoreElements())
		{
			System.out.println(st.nextElement());
		}
	}

}
