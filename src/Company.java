import java.util.ArrayList;
import java.util.List;

public class Company {

	List<Department> departments;
	String name;
	Company(){
		departments = new ArrayList<Department>();
		name = "Test Company";
	}
	
	@Override
	public String toString() {
		return "Company name "+name;
	}

	public double getSalary() {
		double totalSalary =  0;
		for(Department dept: departments)
			totalSalary+= dept.getSalary();
			return totalSalary;
		}
	void print() {
		System.out.println(this);
		
		for(Department department: departments) {
			department.print();
			
		}
	}
	

	
}
