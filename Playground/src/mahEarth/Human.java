package mahEarth;

//Human class
public class Human {
	
	//Constructor
	public Human(String name, String eyeColor, int age, int height) {
		System.out.println("Giving birth...");
		this.name = name;
		this.eyeColor = eyeColor;
		this.age = age;
		this.height = height;
	}
	
	//Default Constructor
	public Human() {
		System.out.println("Giving birth to a boring human...");
		this.name = "Boring McBored";
		this.eyeColor = "Black";
		this.age = 1;
		this.height = 1;
	}
	
	//Attributes
	String name;
	String eyeColor;
	int age;
	int height;
	
	//instance variable, below is creating the Organ object when Human object is created. 
	Organ heart = new Organ();
	
	//Methods
	public void speak() {
		System.out.println("Hello! My name is " + name);
		System.out.println("I am " + height + " inches tall, " + age + " years old, and have " + eyeColor + " eyes.");
	}
	
	public void  eat() {
		System.out.println("Eating...");
	}
	
	public void walk() {
		System.out.println("Walking...");
	}
	
	public void work(){
		System.out.println("Working hard...");
		
	}	
	
	public void sleep() {
		System.out.println("Sleeping...");
		
		System.out.println("Adelaide is very particular about her age");
		System.out.println("Tim is very fond of Adelaide, they'll get married someday");
		System.out.println("Apparently, Adelaide is very picky also");
	}



}
