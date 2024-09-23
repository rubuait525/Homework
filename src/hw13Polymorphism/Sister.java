package hw13Polymorphism;
/*
 *  Method Overloading = When different methods exist with the same method name but with different parameters or signature,
 *  it is called method overloading. 
 *  Method Overloading occurs during compile time.
 */

public class Sister {

	public void sister() {
		System.out.println("This is a void type method (1) of Sister class");// void type implement method (1)

	}

	public void sister(int age1, int age2) {
		System.out.println("This is a void parameterized method (2) of Sister class");// void type parameterized
																						// implement method (2)

	}

	public int sister(int age1, int age2, int age3) {
		int total = (age1 + age2 + age3);
		System.out.println("This is a return type parameterized method (3) of Sister class");
		return total;

	}

	public void sister(int age1, String age2, int age3) {
		int total1 = (age1 + Integer.parseInt(age2) + age3);
		System.out.println("Total age of sister is:" + total1);
		System.out.println("This is a void type parameterized method (4) of Sister class ");

	}

	public void sister(int age1, int age2, int age3, int age4) {
		int total2 = (age1 + age2 + age3 + age3 + age4);
		System.out.println("Total age of sister is:" + total2);
		System.out.println("This is a void type parameterized method (5) of Sister class");

	}

	public int sister(int age1, int age2, float age3, int age4, String age5) {
		int total3 = (age1 + age2 + (int) age2 + age4 + Integer.parseInt(age5));
		System.out.println("Total age of sister is:" + total3);
		System.out.println("This is a return type parameterized method (6) of Sister class");
		return total3;
	}

	public final int sister(int age1, int age2, int age3, int age4, int age5) {
		int total4 = (age1 + age2 + age3 + age4 + age5);
		System.out.println("Total age of sister is:" + total4);
		System.out.println("This is a return type final method (7) of Sister class");
		return total4;
	}

	public static void sister(int age2, int age5, String age3) {
		int total5 = (age2 * age5 * Integer.parseInt(age3));
		System.out.println("This is a multiplication age of sisters age: " + total5);
		System.out.println("This is a void type static method (8) of Sister class");
	}

}
