package practice_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice_6_01 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = 
				new BufferedReader(new InputStreamReader( System.in ) );
		
		int x = Integer.parseInt( br.readLine() );
		
		System.out.println(nizyo(x));
	}

	public static int nizyo(int num) {
		return num * num;
	}
}
