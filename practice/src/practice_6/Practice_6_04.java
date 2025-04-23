package practice_6;

public class Practice_6_04 {

	public static void main(String[] args){
		//3,4,5の同時表示
		size(3);
		System.out.println("");
		size(4);
		System.out.println("");
		size(5);
	}
	
	public static void size(int x) {
		for(int i = 0; i < x; i++) {
			for(int j = 0; j <= i; j++) {
					System.out.print( "$" );
			}
			System.out.println("");
		}
	}
		
}

