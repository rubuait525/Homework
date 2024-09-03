package hw7Abstraction;

public class ColumbiaUniversity {
	
	//we can declared a default constructor in a regular class
	public ColumbiaUniversity() {
		System.out.println("I am a default contructor of ColumbiaUniversity class");
	}
	//Abstract method
	//public abstract void chemistry();
	//We can not create a abstract method inside a regular class
	//because in a regular class we can only have implemented method not declared method that means no abstract method is allow in regular class.
	
	//Non Abstract method or implemented method
	public void biology() {
		System.out.println("this is non abstract mehtod from a regular class");
	}

}
