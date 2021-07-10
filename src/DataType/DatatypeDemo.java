package DataType;

import java.io.FileInputStream;
import java.util.Properties;

public class DatatypeDemo {
	
	public static Properties prop;

	public static void main(String[] args) {

		boolean status = true;
		boolean statusss = false;
		System.out.println("my old status " + status + " my new status " + statusss);

		char a = 'A';
		char b = 'B';
		char c = 65; // as per unicode table
		char d = 66;
		System.out.println("Value OF a IS " + a);
		System.out.println("Value OF b IS " + b);
		System.out.println("Value OF c IS " + c);
		System.out.println("Value OF d IS " + d);

		byte x = 100;
		System.out.println("vaue of b is " + x);
		byte y = (byte) 128; // as byte range -128 to 127 not allow to store
		System.out.println("vaue of b is " + y);// result convert value into -125 so use short
		short e = 12345;
		System.out.println("value of short is " + e);
		// short e=(short)33000; not allow due to range short 32768 to 32767
		// System.out.println("value of short is "+e);

		int f = 909090909; // range
		System.out.println("f is " + f);
		float h = (float) 12.40;
		System.out.println("float value is " + h);
		float j = 12.40f;
		System.out.println("float value is " + j);

		double k = 45.5656;
		System.out.println("double value is " + k);
		int l = (int) 4554.5665;// also known as downcasting
		System.out.println("double value is " + l);// restl 4545 in terminate
		
	String ss=	System.getProperty("user.dir");
	System.out.println("system DIr "+ss);


	
	try {
		prop = new Properties();
		String Dir=System.getProperty("user.dir");

		// FileInputStream fileinput = new FileInputStream(file);
		//FileInputStream fileinput = new FileInputStream(System.getProperty("user.dir")
		//		+ "/DesignPageFactory/COnfiguration/config.properties");
		FileInputStream fileinput = new FileInputStream(Dir
				+ "/DesignPageFactory/COnfiguration/config.properties");
		System.out.println("file is " +fileinput);
		
		prop.load(fileinput);
	} catch (Exception ew) {
		System.out.println(ew);
	}

	}

}
