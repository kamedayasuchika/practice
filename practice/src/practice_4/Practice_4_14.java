package practice_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice_4_14 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = 
			new BufferedReader(new InputStreamReader( System.in ) );
		int strike = 0;
		int ball = 0;
		
		while(strike < 3 && ball < 4) {
			System.out.println("ストライク=1 or ボール=2 or ファール=3");
			int x = Integer.parseInt( br.readLine() );
			
			if(x == 1) {
				strike++;
			}else if(x == 2) {
				ball++;
			}else if(x == 3 && strike < 2) {
				strike++;
			}
		}
		System.out.println(strike + "ストライク," + ball + "ボール");
	}
}
