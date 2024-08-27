package hw5JavaMethods;

public class FullName {

	// Implement return type and parameterized method
	public String fullName(String fName, String lName) {
		System.out.println("Family Member: " + fName + " " + lName);
		return null;
	}

	public static void main(String[] args) {
		// Instantiate the class and call the method by the object

		FullName name = new FullName();
		name.fullName("AB", "Rahman");
		name.fullName("CD", "Rahman");
		name.fullName("ABC", "Rahmann");

	}

}
