package Interface;

public class Advanccal implements Cal {

	public static void main(String[] args) {
		
		Advanccal obj=new Advanccal();

		obj.add();
		obj.div();
		obj.mul();
		obj.sub();

	}
	
	public void mul()
	{
		System.out.println("i m in multiplication method");
	}
	
	public void div()
	{
		System.out.println("i m in division");
	}


	public void add() {
		System.out.println("i m in addition");
		
	}

	public void sub() {
		System.out.println("i m in subtraction");
		
	}

}
