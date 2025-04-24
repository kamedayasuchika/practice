package practice_6;

public class Practice_6_07 {

	public static void main(String[] args) {
		
		for(int i = 10000; i < 10100; i++) {
			sosu(i);
		}
	}
	
	public static void sosu(int x){
		int count = 0;
		for(int i = 2; i <= x ; i++) {
			if(x % i == 0) {
				count++;
			}
		}
			if(count == 1) {
				System.out.println(x);
			}
		}
		;
	}
		


