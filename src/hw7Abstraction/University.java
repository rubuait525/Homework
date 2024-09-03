package hw7Abstraction;

import javax.lang.model.type.DeclaredType;

public interface University {
	//construction declare
	//public University() {}
	// we can not create a construction inside a interface because interface cannot be instantiated or cannot create an object
	//and interface is a collection methods that are declare or define not implemented
	
	//Declare some methods
	public void classSize();
	public void playGround();
	public void teacher();

}
