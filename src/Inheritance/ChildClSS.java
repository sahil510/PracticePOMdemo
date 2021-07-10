package Inheritance;

public class ChildClSS extends BaseClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildClSS  obj=new ChildClSS();
		obj.DIV();
		obj.MUL();
		obj.Sum(); // call method off base class using child class object
		obj.DIFF();

	}
	
	public void MUL()
	{
		System.out.println("multiplication is 1000");
		
	}
	
	public void DIV()
	{
		System.out.println("division is 5");
		}
}
