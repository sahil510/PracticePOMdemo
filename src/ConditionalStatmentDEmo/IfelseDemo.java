package ConditionalStatmentDEmo;

public class IfelseDemo {

	public static void main(String[] args) {
		
		String browser="sahil";
				if (browser.equalsIgnoreCase("chrome")) 
				{
				System.out.println("Test Executed into Chrome");	
				}
				else if(browser.equalsIgnoreCase("Firefox"))
				{
					System.out.println("test Executed into Firefox");
				}
				else if(browser.equalsIgnoreCase("IE"))
				{
					System.out.println("Test Executed into IE");
				}
				else
				{
					System.out.println("Please Provide Proper Browser");
				}
	}

}
