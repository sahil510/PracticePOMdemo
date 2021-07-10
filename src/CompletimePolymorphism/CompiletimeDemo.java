package CompletimePolymorphism;

public class CompiletimeDemo {

	public static void main(String[] args) {
		
		CompiletimeDemo obj=new CompiletimeDemo();
		
		obj.add(10, 20);
		obj.add(10, 20, 30);
		obj.add(10, 20.40);
		obj.add(10.40, 20.40);
		obj.add(10.20, 30);
		

	}
	
	public void add(int a, int b)
	{
		int c=a+b;
		System.out.println("Addition is "+ c);
	}
	// same name but number of argument are different
	public void add(int a, int b,int d)
	{
		int c=a+b+d;
		System.out.println("Addition is "+ c);
	}
	// same name same number of argument but type of argument is different

	public void add(double a, double b)
	{
		double c=a+b; //type casting, uper type casting int to double
		System.out.println("Addition is "+ c);
	}
	// same name same number of argument type of argument is different 

	public void add(int a, double b)
	{
		double c=a+b; //type casting, uper type casting int to double
		System.out.println("Addition is "+ c);
	}
	
	// same name same number of argument type of argument same type but order of type is is different 

	public void add(double a, int b)
	{
		double c=a+b; //type casting, uper type casting int to double
		System.out.println("Addition is "+ c);
	}

}
