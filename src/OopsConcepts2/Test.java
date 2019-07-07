package OopsConcepts2;

public class Test extends Shape {

	public static void main(String[] args) {
		
		Shape s = new Test();
		
		s.drawing();
		
		s.fill();
		
		System.out.println(s.colour);
		
		
	}

	// @Overridden method
	
	void drawing() {
		
		System.out.println("drawing");
		
	}

}
