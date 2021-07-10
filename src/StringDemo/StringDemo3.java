package StringDemo;

public class StringDemo3 {

	public static void main(String[] args) {

		String name = "Welcome To Selenium Webdriver";
		String name1 = "Selenium";

		// method is case sensitive.
		boolean status = name.contains(name1);
		System.out.println("Status is " + status);

	}

}
