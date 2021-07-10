package StringDemo;

public class StringDemo1 {

	public static void main(String[] args) {
		
		// both the method is case sensitive.
		String name="Welcome To Selenium Webdriver";
		String name1="Welcome To Webdriver";
		
		boolean status=name.startsWith("Welcome");
		System.out.println("Old Status is "+status);
		
		boolean status1=name1.endsWith("Webdriver");
		System.out.println("Old Status is "+status1);

	}

}
