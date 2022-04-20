package week10;

public class Employee extends Person implements Measure {
	
	private String jobTitle;
	private double salaryPerMonth;
	
	public Employee(String name, String add, String jobTitle, double salary) {
		super(name, add);
		this.jobTitle = jobTitle;
		salaryPerMonth = salary;
		
	}

	public double getMeasure() {
		return salaryPerMonth;
	}

	 
	
	public void findJob() {
		System.out.println("Put the job here");
	}
	public String formatAddress() {
		String add =  super.getAddress();
		return add;
	}

	public String toString()
	{
		String out = super.toString();
		out = out + " is a " + jobTitle;
		out = out + " and they make " + salaryPerMonth + " per month. ";
		return out;
	}
	 

}
