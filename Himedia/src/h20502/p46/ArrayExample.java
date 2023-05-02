package h20502.p46;

public class ArrayExample {

	public static void main(String[] args) {
		int[] score = { 83, 90, 87, 79, 56, 89 };
		
		for(int i = 0; i < score.length; i++) {
			System.out.println("score[" + i + "] : " + score[i]);
		}
//		System.out.println("score[0] : " + score[0]);
//		System.out.println("score[1] : " + score[1]);
//		System.out.println("score[2] : " + score[2]);
//		System.out.println("score[3] : " + score[3]);
		
		int sum = 0;
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		
		System.out.println("sum : " + sum);
		double avg = (double) sum / score.length;
		System.out.printf("avg : %.1f", avg);
				
	}

}
