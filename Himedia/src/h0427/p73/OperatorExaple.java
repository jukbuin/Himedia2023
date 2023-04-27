package h0427.p73;

public class OperatorExaple {

	public static void main(String[] args) {
		byte a =10;
		int b = 5;
		int c = 7;
		double d = 4.8;
		float f = 5.2f;
		
		int result1 = a + b;
		byte result3 = a + b;
		double result2 = c + d;
		int result4 = c + d;
		float result5 = c + f;
		int result6 = c + f; //소수점
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		System.out.println(result1);
		System.out.println(result2);
		
	}

}
