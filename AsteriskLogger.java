package week05OOP;

public class AsteriskLogger implements Logger {

	@Override
	public void Log(String str) {
		// TODO Auto-generated method stub
		System.out.println(Hello(str));
	}

	@Override
	public void Error(String str) {
		// TODO Auto-generated method stub
		String error = Hello("Error: " + str);
		System.out.println("*".repeat(error.length()));
		System.out.println(error);
		System.out.println("*".repeat(error.length()));
	}
	
	public String Hello(String str) {
		return "***" + str + "***";
		
	}

}
