package practice_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice_4_06 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = 
			new BufferedReader(new InputStreamReader( System.in ) );
		
		int win = 0;
		int lose = 0;
		
		for(int i = 0; i < 10; i++ ) {
			int x = Integer.parseInt( br.readLine() );
			if(x == 0) {
				lose = lose + 1;
			}else if(x == 1) {
				win = win + 1;
			}
		}
		System.out.println("勝ち" + win);
		System.out.println("負け" + lose);
	}
}
