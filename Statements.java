
public class Statements {

	public static void main(String[] args) {
		int i = 0;
		while (i < 10) {
			System.out.print(' ');
			System.out.print(i);
			i++;
		}
		System.out.print('\n');

		int j = 1;
		do {
			System.out.print(' ');
			System.out.print(j);
			j *= 2;
		} while (j < 20);
		System.out.print('\n');
		
		for (int k = 21; k < 30;k++) {
			System.out.print(' ');
			System.out.print(k);
		}
		System.out.print('\n');

		if (10 < 11 || 11 < 10) {
			System.out.println('y');
		}
		if (10 < 11) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		int x = 10, y = 11, z = 12;
		if (x == y) {
			System.out.println('a');
		} else if (x == z) {
			System.out.println('b');
			
		} else {
			System.out.println('c');
		}
		
		// switch STATEMENT
		switch(x) {
		case 1, 2, 3, 4, 5, 6, 7, 8, 9:
			System.out.println('a');
			break;
		case 10:
			System.out.println('b');
			break;
		default:
			System.out.println('c');
		}
		
		// switch EXPRESSION
		int monthNumber = 5;
		int numberOfDays = 
				switch(monthNumber) {
					case 1, 3, 5, 7, 8, 10, 12 -> 31;
					case 2 -> 28;
					default -> 30;
				};
		System.out.println(numberOfDays);
			
	
	}

}
