package practice_6;

public class Practice_6_06 {

	public static void main(String[] args) {

		for(int i = 1; i < 10; i++) {
			kukuLine(i);
		}
	}

	public static void kukuLine(int kuku) {
		for(int i = 1; i < 10; i++) {
			System.out.printf(" %2d", kuku * i );
		}
		System.out.println("");
	}
}
