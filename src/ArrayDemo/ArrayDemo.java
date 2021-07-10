package ArrayDemo;

public class ArrayDemo {

	public static void main(String[] args) {

		int student_id[] = new int[3]; // initalize array 
		student_id[0] = 10;// assign value to array 
		student_id[1] = 20;
		student_id[2] = 30;

		System.out.println("student id is " + student_id[2]); // print array 

		int sizeofarr = student_id.length;
		System.out.println("size of array is " + sizeofarr);

		for (int i = 0; i < sizeofarr; i++) {
			System.out.println("value of aray " + student_id[i]);
		}

	}

}
