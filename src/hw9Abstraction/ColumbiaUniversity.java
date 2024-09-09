package hw9Abstraction;

public class ColumbiaUniversity extends RockefellerUniversity {

	// we can declared a default constructor in a regular class
	public ColumbiaUniversity() {
		System.out.println("I am a default contructor of ColumbiaUniversity class");
	}
	// Abstract method
	// public abstract void chemistry();
	// We can not create a abstract method inside a regular class
	// because in a regular class we can only have implemented method not declared
	// method that means no abstract method is allow in regular class.

	// Non Abstract method or implemented method


	/*
	 * Ans = A regular class can inherit only one regular class or one abstract
	 * class by extends keyword and a regular class can't inherit an Interface by
	 * extends keyword, Implements keyword is used to inherit Interface in regular
	 * class and a regular class can inherit more than one Interface but a regular
	 * class cannot inherit a regular class or abstract class by Implements keyword
	 * and extends keyword is use before implements keywords if regular class,
	 * abstract class, interface need to be inherited
	 */
	public void biology() {
		System.out.println("this is non abstract mehtod from a regular class");
	}

}
