package homeworks;
interface Iphone{
	String color = "black";
	String size ="11inch";
	void apple ();
	
}


public class InterfaceNumberTwo implements Iphone{

	public static void main (String [] args) {
		System.out.println(color);
		System.out.println(size);
		
		InterfaceNumberTwo ex = new InterfaceNumberTwo();
		ex.apple ();
		
		
	}
	
	@Override
	public void apple() {
		System.out.println("It's on");
		
		
		
	}

}
