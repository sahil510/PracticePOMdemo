package ReturnValueDemo;

public class ReturnDemo {

	public static void main(String[] args) {
		ReturnDemo rd=new ReturnDemo();
		int q=rd.Sum(10, 20);
		int r=rd.sub(10, 20);
		System.out.println("value is "+q);
		System.out.println("value is "+r);


	}

	public int Sum(int a, int b) { // user void than there is no return value.
		int c=a+b;
			return c;	

	}
	
	public int sub(int a, int b) {
		int c=b-a;
			return c;	

	}

}
