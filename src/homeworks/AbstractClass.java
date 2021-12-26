package homeworks;

abstract class BallPython{
	
	String morphs;
	String prices;
	
	public void albino () {
		System.out.println("albino");
		
	}
	public abstract void temperature();
	
	
}

class care extends BallPython {
	
	public void temperature() {
		System.out.println("88°F");
		
	}
}

public class AbstractClass {

	public static void main(String[] args) {
		care c = new care();
		
		c.albino();
		c.temperature();
		
		

	}

}
