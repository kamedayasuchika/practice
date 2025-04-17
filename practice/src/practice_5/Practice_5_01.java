package practice_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice_5_01 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = 
			new BufferedReader(new InputStreamReader( System.in ) );
		
		int num[] = new int[10];
		
		for(int i = 0; i < 10; i++) {
			num[i] = Integer.parseInt( br.readLine() );
		}
		for(int i = 0; i < 10; i++) {
			System.out.println(num[i] * 2);
		}
	}

}
