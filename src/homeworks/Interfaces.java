package homeworks;

interface BabyClothing{
	
	String size = "0-3";
	void pink();
	
	
}
public class Interfaces implements BabyClothing{

	public static void main(String[] args) {
		System.out.println(size);
		
		Interfaces ex = new Interfaces();
		ex.pink();
		

	}

	@Override
	public void pink() {
		System.out.println("It is pink");
		
		
	
		
	}

}
