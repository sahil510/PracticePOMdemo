package StringDemo;

public class StringDemo4 {

	public static void main(String[] args) {

		String name = "Welcome-To-Selenium-Webdriver";
		
	String arrname[]=name.split("-");
	  for(int i=0;i<arrname.length;i++)
	  {
		  System.out.println(arrname[i]);
		  
		  if(arrname[i].equalsIgnoreCase("selenium"))
		  {
			  System.out.println("Test Passed");
			  break;
		  }
	  }

		


	}

}
