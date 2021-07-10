package ClassDemo;

public class FirstClassDemo {
	int a=10;
	int b=20;
	public static void main(String[] args) 
	{
		System.out.println("prgram started");
	  FirstClassDemo obj=new FirstClassDemo();
	  
		System.out.println("variable A is " +obj.a);// direct access variable using obj name
		System.out.println("variable B is " +obj.b);
      
		obj.Sum(); // call method using class object
		obj.Dif();
		System.out.println("prgram ended");

	  
		
	}
	
	public void Sum()
	{
		int c=a+b;
		System.out.println("addition is " + c);
	}

	public void Dif()
	{
		int c=b-a;
		System.out.println("subtraction  is" + c);
	}
	
	public static void staticmethod()
	{
		
		System.out.println("static method");
	}
}
