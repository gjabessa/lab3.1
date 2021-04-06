import java.time.LocalDate;
import java.util.Objects;

public class Employee {
	private String employeeId;
	private String firstName;
	private String middleInitial;
	private String lastName;
	private LocalDate birthDate;
	private String SSN;
	private double salary;
	
	Position position;	
	
	
	public Employee(String employeeId, String firstName, String middleInitial, String lastName, LocalDate birthDate,
			String sSN, double salary, Position position) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.middleInitial = middleInitial;
		this.lastName = lastName;
		this.birthDate = birthDate;
		SSN = sSN;
		this.salary = salary;
		this.position = position;
	}



	public String getSSN() {
		return SSN;
	}



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
		if(!((Employee)obj).position.equals(this.position)) {
			return false;
		}
		return Integer.compare(obj.hashCode(), this.hashCode()) == 0;
		
	}
	public int hashCode() {
		return Objects.hash(employeeId, firstName,middleInitial,lastName,birthDate,SSN,salary);
	}
	
	public void setSSN(String sSN) {
		SSN = sSN;
	}



	public double getSalary() {
		return salary;
	}



	public void setSalary(double salary) {
		this.salary = salary;
	}



	void print(){
		System.out.println(this);		
	}



	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", middleInitial=" + middleInitial
				+ ", lastName=" + lastName + ", birthDate=" + birthDate + ", SSN=" + SSN + ", salary=" + salary + "]\n";
	}



	public String getEmployeeId() {
		return employeeId;
	}



	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}



	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getMiddleInitial() {
		return middleInitial;
	}



	public void setMiddleInitial(String middleInitial) {
		this.middleInitial = middleInitial;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public LocalDate getBirthDate() {
		return birthDate;
	}



	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}
	
	
}
