package conditionalstatements;



public class IfElseIfDemo {

	public static void main(String[] args) {


		int a =90;
		String browser = "Chrome";
		System.out.println("Test Started");
		if(browser.equals("Chromeh"))
		{
			System.out.println("Which browser is executed "+ browser + "Browser");
		}
		else if(browser.equalsIgnoreCase("Firefox"))
		{
			System.out.println( "Test Case Executd on Firefox");
		}
		else if(browser.equals("IE"))
		{
			System.out.println("test cases executed on IE Browser");
		}
		else
		{
			System.out.println("kindly provide valid credentials");
		}

		System.out.println("Test Ended");
	}

}
