package tsm03_J_CSFF;

import java.io.IOException;
class Foo {
	private final Helper helper;
	public Helper getHelper() { 
		return helper;
	}
	
	public Foo() {
		// Point 1
		helper = new Helper(42);
		// Point 2
	} 
	
	public void testCase(){
		Thread test = new Thread(new Runnable() {
			public void run() {
				Foo testF = new Foo();
				testF.getHelper();
				}
			});
			   test.start();
	}
	
	public void main(String[] args) throws IOException { 
		
		testCase(); // starts thread 1 
		testCase(); // starts thread 2
	}
}