package ClassDemo;

public class SecondCLass {

	public static void main(String[] args) {

		FirstClassDemo obj1=new FirstClassDemo();
		SecondCLass obj2CLass=new SecondCLass();
		
		obj1.Sum();
		obj2CLass.mul();
		FirstClassDemo.staticmethod(); // call static method using class name directely without creat object
		
	}
	
	public void mul()
	{
		System.out.println("multiplications " );
	}

}
