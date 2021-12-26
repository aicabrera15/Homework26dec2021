package encapsulation;

public class Dog {
	
	private String name;
	private int age;
	
	public void setName(String newName) {
		name = newName;
	}
// Set methond and get method for the variable
	public String getName() {
		return name;
	}
	public void setAge(int newAge) {
		age = newAge;
	}
	
	public int getAge() {
		return age;
	}
}
