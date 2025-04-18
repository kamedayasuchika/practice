package practice_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice_5_05 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(
                new InputStreamReader( System.in ) );
		
		int value = Integer.parseInt( br.readLine() );
		int binary[] = new int[16];
		
		//10進数を2進数に変換するには、変換する10進数を2で繰り返し割っていき、
		//その余り（0か1になる）を下位から上位へ順に並べていく。
		for(int i = 15; i >= 0; i--) {
			binary[i] = value % 2;
			value = value / 2;
			System.out.print(binary[i]);
 		}
		
		System.out.println(" ");
		
		//配列 binaryに0か1を代入する
		for( int i = 0 ; i < 16 ; i++ )
			System.out.print( binary[i] );
		}

	}
