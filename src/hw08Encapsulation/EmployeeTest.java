package hw08Encapsulation;

public class EmployeeTest {
	// Step 04: Create EmployeeTest class, Create object from this class. Now,
	// please execute those getters and setters method and print Employee info (Use
	// necessary String to make the outcome meaningful, you can also use \n if you
	// want).
	public void main(String[] args) {
		Employee employee = new Employee();
		employee.setEmName("Elaiza");
		employee.setEmAge(23);
		employee.setEmSex('M');
		employee.setEmCitizen(true);

		System.out.println("Student Name: " + employee.getEmName() + "/nStudent Age: " + employee.getEmAge()
				+ "/nStudent Sex: " + employee.getEmSex() + "/nIs A Citizen: " + employee.getEmCitizen());

	}

}
