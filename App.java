package week05OOP;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Logger errorMessage = new AsteriskLogger();
		
		errorMessage.Log("Hello");
		errorMessage.Error("Hello");
		
		Logger spaces = new SpacedLogger();
		
		spaces.Log("Spaces Test");
		spaces.Error("Test 2");
		
	}

}
