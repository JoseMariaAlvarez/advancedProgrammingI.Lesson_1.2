
public class PrimitiveTypes {

	public static void main(String[] args) {
		byte b = 1;
		short s = 2;
		int i = 4;
		long l = 8L;
		char c = 'a';
		float f = 1.0f;
		double d = -.034d;
		boolean bl = true;
		
		b++;
		++s;
		i = i + 3;
		l *= 2;
		
		System.out.println(b);
		System.out.println(s);
		System.out.println(s != b);
		System.out.println(i + 1);
		System.out.println((l + 10) / 3);
		System.out.println(i > l? 'g': 'l');
		System.out.println(c);
		System.out.println((char) 67);
		System.out.println(f * 4E-01);
		System.out.println(d * 4E-01);
		System.out.println(!bl && false);
		
	}

}
