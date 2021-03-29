
public class Position {

	String title;
	String description;
	Employee employee;
	Position(String title, String description){
		this.title = title;
		this.description = description;
	}
	
	
	void setEmployee(Employee employee){
		this.employee = employee;
	}
	
	void print() {
		System.out.println(this);
		if(employee != null) {
		    employee.print();
		}
	}
	public double getSalary() {
		double salary = 0;
		if(employee != null) {
			salary =  employee.getSalary();
		}
		
		return salary;
		}
	

	@Override
	public String toString() {
		return "Position [title=" + title + ", description=" + description + "]";
	}
	

}
