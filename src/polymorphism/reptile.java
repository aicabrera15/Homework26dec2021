package polymorphism;
class rep{
	public void scales() {
		System.out.print("soft");
		
		
	}

}
class DorsalScale extends reptile {
public void scales () {
	System.out.println("rough");
	//Even though DorsalScale know 2 methods called scales
	//it prioritizes the one that is directly in the class.
	
}
}
public class reptile {
public static void main (String[] args) {
	DorsalScale d = new DorsalScale();
	d.scales();
}
}

	