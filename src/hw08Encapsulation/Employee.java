package hw08Encapsulation;

public class Employee {
	//declare some private variables----> name, age, sex, citizen.
	private String emName;
	private int emAge;
	private char emSex;
	private Boolean emCitizen;
	//Step 03: How can you access those variables by the getter and setter method?
	//select variable > right click > source > generate getter and setter > insertion point > access modifier > generate
	public String getEmName() {
		return emName;
	}
	public void setEmName(String emName) {
		this.emName = emName;
	}
	public int getEmAge() {
		return emAge;
	}
	public void setEmAge(int emAge) {
		this.emAge = emAge;
	}
	public char getEmSex() {
		return emSex;
	}
	public void setEmSex(char emSex) {
		this.emSex = emSex;
	}
	public Boolean getEmCitizen() {
		return emCitizen;
	}
	public void setEmCitizen(Boolean emCitizen) {
		this.emCitizen = emCitizen;
	}


	
	
	

}
