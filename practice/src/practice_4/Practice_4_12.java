package practice_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice_4_12 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = 
			new BufferedReader(new InputStreamReader( System.in ) );

		int count = 0;
		
		while(count <= 100) {
			int x = Integer.parseInt( br.readLine() );
			count = count + x;
		}
		System.out.println("合計" + count);
	}
}
