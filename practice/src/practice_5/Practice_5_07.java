package practice_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice_5_07 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = 
				new BufferedReader(new InputStreamReader( System.in ) );
		
		int kuku[][] = new int[9][9];
		
		for( int i = 0 ; i < 9 ; i++ ){
			for( int j = 0 ; j < 9 ; j++ ) {
				kuku[i][j] = (i + 1) * (j + 1);	
			}
		}
			int leftvalue = Integer.parseInt( br.readLine() );
			int rightvalue = Integer.parseInt( br.readLine() );
			
			System.out.println(kuku[leftvalue - 1][rightvalue - 1]);
	}
}

	
