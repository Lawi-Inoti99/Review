package One;

import java.util.ArrayList;
import java.util.Scanner;

public class CharacterShift {
	public static void main(String[] args) {

		ArrayList wes = new ArrayList();
		Scanner lawi = new Scanner(System.in);
		System.out.println("enter the string you want");
		String str = lawi.next();
		for (int i = 0; i < str.length(); i++) {
			char w = str.charAt(i);
			w += 3;
			wes.add(w);

		}
		System.out.println(wes);

	}

}
