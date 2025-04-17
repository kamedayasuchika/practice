package practice_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice_4_21 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = 
			new BufferedReader(new InputStreamReader( System.in ) );

		int x = Integer.parseInt( br.readLine() );
		
		for(int i = 0; i < x; i++) {
			for(int j = 0; j < x; j++) {
				if(i == j || j == (x - i - 1)) {
					System.out.print( "X" );
				} else {
					System.out.print( " " );
				}
			}
			System.out.println("");
		}
	}

}
