package day3interface;

public interface Bounceable {
	
	//property in an interface is by default public, static and final
	int bf = 5;
	
	//all methods in an interface are by default public and abstract
     void setBounceFactor(int bouncef);
	 void bounce();

}



