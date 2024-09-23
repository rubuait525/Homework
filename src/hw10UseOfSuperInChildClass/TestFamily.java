package hw10UseOfSuperInChildClass;

public class TestFamily {

	public static void main(String[] args) {
		Father father = new Father(); // Father class instantiated and default constructor initialized
		System.out.println(".......................................................................");
		Father father2 = new Father("Alex", 54, 'M', true); // Parameterized constructor initialized
		System.out.println(".......................................................................");

		// void type method initialized
		father.father();
		System.out.println(".......................................................................");

		// void type parameterized method initialized
		father.fatherInfo("Jerry", 60, 'M', false);
		System.out.println(".......................................................................");

		Daughter daughter = new Daughter();// Daughter class instantiated and default constructor initialized
		System.out.println(".......................................................................");

		Daughter daughter2 = new Daughter(2010, 14);// Parameterized constructor initialized
		System.out.println(".......................................................................");

		daughter2.daughter();// void type method initialized
		System.out.println(".......................................................................");

		daughter2.daughterInfo(2008, 16);

	}

}
