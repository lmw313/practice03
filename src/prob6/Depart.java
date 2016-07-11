package prob6;

public class Depart extends Employee {
	private String name;
	private int salary;
	private String depart;
	
	public Depart(String name, int salary, String depart) {
		this.name = name;
		this.salary = salary;
		this.depart = depart;
	}
	
	public void getInformation() {
		System.out.printf( "이름: %s   연봉: %d   부서:%s\n", name, salary, depart );
	}
	
}
