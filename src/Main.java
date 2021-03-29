import java.time.LocalDate;

public class Main {

	public static void main(String args[]) {
		Company company = new Company();
		
		Department department1 = new Department("Name","Location");
		Position position1 = new Position("Title","description");
		department1.positions.add(position1);
		Employee employee1 = new Employee("employeeId", "firstname", "middlename", "lastname", LocalDate.now(),
				"22345", 1234);
		position1.employee = employee1;
		
		
		Department department2 = new Department("Name1","Location1");
		Position position2 = new Position("Title1","description1");
		department2.positions.add(position2);
		//department 2 has no employee
		
		company.departments.add(department1);
		company.departments.add(department2);
		
		System.out.println(company.getSalary());
	
		company.print();
		
	}
}
