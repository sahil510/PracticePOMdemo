package LoopDemo;
/* first execute inner loop that outer loop +inner loop*/
public class ForloopDemo {

	public static void main(String[] args) {
		System.out.println("loop started");
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j = j + 2) {
				System.out.println("value of j is " + j);
			}
			System.out.println("Value OF I Is " + i);
		}
		System.out.println("loop ended");
	}

}
