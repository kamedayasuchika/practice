package practice_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice_4_08 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = 
			new BufferedReader(new InputStreamReader( System.in ) );
		
		int value = 0;
		
		for(int i = 0; i < 10; i++) {
			int x = Integer.parseInt( br.readLine() );
			if(value < x) {
				value = x;
			}
			System.out.println(value);
		}
	}
}