package practice_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice_4_16 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = 
			new BufferedReader(new InputStreamReader( System.in ) );
		
		int x = Integer.parseInt( br.readLine() );
		int sosu = 2;
		
		while(x > 1) {
			if(x % sosu == 0) {
				System.out.print(sosu + "");
				x = x / sosu;
			}
			else {
				sosu++;
			}
		}
	}

}
