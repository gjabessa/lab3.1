import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Position {

	String title;
	String description;
	List<Employee> employee;
	Position(String title, String description){
		this.title = title;
		this.description = description;
		employee = new ArrayList<Employee>();
	}
	
	
	void setEmployee(Employee employee){
		this.employee.add(employee);
	}
	
	void print() {
		System.out.println(this);
		if(employee != null) {
			for(Employee emp: employee) {
				emp.print();
			}
		    
		}
	}
	public double getSalary() {
		double salary = 0;
		if(employee != null) {
			for(Employee emp: employee) {
				salary =  emp.getSalary();
			}
		}
		
		return salary;
		}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(obj == null) {
			return false;
		} 
		if(obj.getClass() != this.getClass()) {
			return false;
		}
		return Integer.compare(obj.hashCode(), this.hashCode()) == 0;
		
	}
	@Override 
	public int hashCode() {
		return Objects.hash(this.title, this.description,this.employee);
		
	}
	@Override
	public String toString() {
		return "Position [title=" + title + ", description=" + description + "]";
	}
	

}
