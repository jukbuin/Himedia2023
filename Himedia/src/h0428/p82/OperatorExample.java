package h0428.p82;

public class OperatorExample {

	public static void main(String[] args) {
		int x = 5;
		double y = 0.0;
		
		double z = x/y;
//		double z = x % y;
		
		System.out.println(Double.isInfinite(z));
		System.out.println(Double.isNaN(z));
		System.out.println(z + 2);
	}

}
