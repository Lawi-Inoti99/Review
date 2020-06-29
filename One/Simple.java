package One;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*/this can be used to refer current class instance variable.
this can be used to invoke current class method (implicitly)
this() can be used to invoke current class constructor.
this can be passed as an argument in the method call.
this can be passed as argument in the constructor call.
this can be used to return the current class instance from the method.
		/**/
public class Simple {
	
	int rollno;
	String name;
	float fee;

	Simple(int rollno, String name, float fee) {
		this.rollno = rollno;
		this.name = name;
		this.fee = fee;
	}

	public static void main(String[] args) {

		Scanner sn = new Scanner(System.in);
		System.out.println("Enter number you want to convert:");
		int p = sn.nextInt();
		ArrayList ln = new ArrayList();
		ArrayList lm = new ArrayList();

		while (p > 0) {
			int m = p % 2;
			ln.add(m);
			p /= 2;

		}
		Collections.reverse(ln);
		System.out.println(ln);
	}

}
