package ConditionalStatmentDEmo;

public class SwitchCaseDemp {

	public static void main(String[] args) {

    String browser="IE";
    		switch(browser)
    		{
    		case "Firefox":
    			System.out.println("Test Executed into Firefox");
    		  break;
    		case "chrome":
    			System.out.println("Test Executed into Chrome");
    		  break;
    		case "IE":
    			System.out.println("Test Executed into IE");
    		  break;
    		  
    		  default:
    			  System.out.println("Provide Proper Browser");
    			  
    		 
    		}

	}

}
