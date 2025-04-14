package practice_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice_4_05 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = 
			new BufferedReader(new InputStreamReader( System.in ) );
		
		int sum = 0;
		for(int i = 0; i < 10; i++ ) {
			int x = Integer.parseInt( br.readLine() );
			sum = sum + x;
		}
		System.out.println(sum / 10);
	}
}
