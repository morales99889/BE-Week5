package week05OOP;

public class SpacedLogger implements Logger {

	@Override
	public void Log(String str) {
		// TODO Auto-generated method stub
		System.out.println(createSpace(str));
	}

	@Override
	public void Error(String str) {
		// TODO Auto-generated method stub
		System.out.println("ERROR: " + createSpace(str));
		
	}	
		
		public String createSpace(String str) {
			String newString = " ";
			for (int i =0; i < str.length(); i++) {
				newString += str.charAt(i) + " ";
			}
			return newString;
		}

}
