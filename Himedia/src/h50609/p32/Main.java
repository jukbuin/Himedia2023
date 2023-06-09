package h50609.p32;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();

		long timeStart;
		long timeEnd;

		timeStart = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			list1.add(i, String.valueOf(i));
		} 

		timeEnd = System.nanoTime();
		System.out.printf("ArrayList 걸린시간 : %9dns\n", (timeEnd - timeStart));
//		System.out.println("ArrayList 걸린시간 : " + (timeEnd - timeStart) + "ns");

		timeStart = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			list2.add(i, String.valueOf(i));
		}

		timeEnd = System.nanoTime();
		System.out.printf("LinkedList 걸린시간 : %9dns\n", (timeEnd - timeStart));
//		System.out.println("LinkedList 걸린시간 : " + (timeEnd - timeStart) + "ns");
	}

}
