package collectionInJava;

public class Student implements Comparable<Student>{
	
	public int roll;
	public String name;

	Student(int i, String name) {
		// TODO Auto-generated constructor stub
		this.roll = i;
		this.name =name;
	}
		
		public String toString()
		{
			return roll + " "+name;
		}

		public int compareTo(Student s) {
			// TODO Auto-generated method stub
			
			//return this.roll - s.roll;
			return this.name.compareTo(s.name);
		}

		

}
	
