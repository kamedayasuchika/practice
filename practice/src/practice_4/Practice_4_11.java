package practice_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice_4_11 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = 
			new BufferedReader(new InputStreamReader( System.in ) );

		int x = Integer.parseInt( br.readLine() );
		int count = 0;
		
		for(int i = 0; i < x; x--) {
			System.out.println(count++);
			
			if(count > 9) {
				count = 0;
			}
		}
	}
}
