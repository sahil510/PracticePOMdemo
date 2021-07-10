package StringDemo;

public class StringDemo2 {

	public static void main(String[] args) {

		String name = "Welcome To Selenium Webdriver";
		String name1 = "welcome To Selenium Webdriver";

		// method is case sensitive.
		boolean status = name.equals(name1);
		System.out.println("Status is " + status);
// method is case in sensitive.
		boolean status1 = name.equalsIgnoreCase(name1);
		System.out.println("Status is " + status1);

	}

}
