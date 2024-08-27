package hw4Constructor;

public class StudentTest {

	public static void main(String[] args) {
		Student student = new Student();
		System.out.println("---------------//-------------");
		Student alex = new Student("Alex", 10000, 'M', 2.2222F, true);
		System.out.println("---------------//-------------");
		Student jim = new Student("Jim", 20000, 'M', 3.333f, false);
		System.out.println("--------------//--------------");
		Student maria = new Student("maria", 30000, 'F', 4.300f, true);

	}

}
