package h50609.p9;

public class BeepTask implements Runnable {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("미강이");
			try {
				Thread.sleep(500);
			} catch (Exception e) {

			}
		}
	}
}
