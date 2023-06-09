package h50609.p4;

public class TreadTest01 {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			System.out.println("thread");

			try {
				Thread.sleep(1000);
			} catch (Exception e) {

			}
		}
	}

}
