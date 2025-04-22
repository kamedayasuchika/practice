package practice_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice_6_02 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = 
				new BufferedReader(new InputStreamReader( System.in ) );

		int x = Integer.parseInt( br.readLine() );
		int y = Integer.parseInt( br.readLine() );
		
		System.out.println(aveculc(x, y));

	}
	
	public static int aveculc(int x, int y) {
		return (x + y) / 2;
	}

}
