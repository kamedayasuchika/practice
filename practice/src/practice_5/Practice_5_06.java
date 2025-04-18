package practice_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice_5_06 {

	public static void main(String[] args)throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = 
				new BufferedReader(new InputStreamReader( System.in ) );
		
		int kuku[][] = new int[9][];

		//配列 kuku に値を代入する
		for( int i = 0 ; i < 9 ; i++ ){
			for( int j = 0 ; j < 9 ; j++ ) {
				System.out.printf( " %2d", kuku[i][j] );
			}
			System.out.println();
		}
	}
	
}
