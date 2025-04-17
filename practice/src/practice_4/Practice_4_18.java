package practice_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice_4_18 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = 
			new BufferedReader(new InputStreamReader( System.in ) );
			
		int sum = 0; 
		
		while(true) {
			int x = Integer.parseInt( br.readLine() );
			if(x != 0) {
				sum = sum + x;
			}else {
				System.out.println(sum);
				break;
			}
		}
	}
}
