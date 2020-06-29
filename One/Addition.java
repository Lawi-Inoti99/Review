package One;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {

		Scanner sn = new Scanner(System.in);
		System.out.println("enter num 1:");
		int m = sn.nextInt();
		System.out.println("enter num 2:");
		int n = sn.nextInt();
		int sum = Math.addExact(m, n);
		int prd = Math.max(n, m);
		System.out.println(sum);
		System.out.print(prd);

		
	}

}
