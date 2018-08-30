package mahEarth;

public class Earth {

	public static void main(String[] args) {
		
		
		Human adelaide = new Human("Adelaide Pham", "Black", 24, 59);
		
		//invoke class methods
		adelaide.speak();
		adelaide.eat();
		adelaide.sleep();		
		
		//calling object's var's method.
		adelaide.heart.isActive();
		
		
	}

}
