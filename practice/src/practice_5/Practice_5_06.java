package practice_5;

public class Practice_5_06 {

	public static void main(String[] args) {
		
		int kuku[][] = new int[9][9];
		
		for( int i = 0 ; i < 9 ; i++ ){
			for( int j = 0 ; j < 9 ; j++ ) {
				kuku[i][j] = (i + 1) * (j + 1);
			}
		}

		//配列 kuku に値を代入する
		for( int i = 0 ; i < 9 ; i++ ){
			for( int j = 0 ; j < 9 ; j++ ) {
				System.out.printf( " %2d", kuku[i][j] );
			}
			System.out.println(" ");
		}
	}
	
}
