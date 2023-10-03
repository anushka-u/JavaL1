package in.enums;

public class Demo {
	
	enum WEEKDAYS{
		MONDAY, TUESDAY ,WEDNESDAY, THURSDAY, FRIDAY;
	}
	
	enum WEEKENDS{
		SATURDAY, SUNDAY;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(WEEKDAYS.MONDAY);
		WEEKDAYS[] value = WEEKDAYS.values();
		
		for(WEEKDAYS w: value)
		{
			System.out.println(w);
		}
		
	}

}
