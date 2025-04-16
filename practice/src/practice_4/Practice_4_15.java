package practice_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice_4_15 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = 
			new BufferedReader(new InputStreamReader( System.in ) );
		
		int x = Integer.parseInt( br.readLine() );
		int sosucount = 0;
		
		
		for(int i = 2; i <= x ; i++) {
			if(x % i == 0) {
				sosucount++;
			}
		}
		if(sosucount == 1) {
			System.out.println(x + "素数である。");
		}else {
			System.out.println(x + "素数ではない。");
		}
	}
	
}
