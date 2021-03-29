import java.util.ArrayList;
import java.util.List;

public class Department {
	String name;
	String location;
	
	List<Position> positions;
	
	Department(String name, String location){
		this.name = name;
		this.location = location;
		positions = new ArrayList<Position>();
	}
	
	void print(){
		System.out.println(this);
		for(Position position: positions) {
			position.print();
		}
	}
	public double getSalary() {
		double totalSalary =  0;
		for(Position pos: positions)
			totalSalary+= pos.getSalary();
		return totalSalary;
		}

	@Override
	public String toString() {
		return "Department [name=" + name + ", location=" + location + "]";
	}
	

}
