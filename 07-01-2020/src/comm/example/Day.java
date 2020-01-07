package comm.example;

public enum Day {
	SUN("Today is Sunday",1),
	MON("Today is Monday",2),
	TUE("Today is Tuesday",3),
	WED("Today is Wednesday",4),
	THU("Today is Thursday",5),
	FRI("Today is Friday",6),
	SAT("Today is Saturday",7);
  
	private final String day;
	private final int dayNo;

	private Day(String d, int n) {
		// TODO Auto-generated constructor stub
		day=d;
		dayNo=n;
	}
	
	public String getDay() {
		return day;
	}
	public int getDayNo() {
		return dayNo;
	}

}
