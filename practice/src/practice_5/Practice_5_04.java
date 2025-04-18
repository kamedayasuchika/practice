package practice_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice_5_04 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = 
			new BufferedReader(new InputStreamReader( System.in ) );
		
		int tencount;
		int sum;
		int num[] = new int[10];
		
		for(tencount = 0, sum = 0; tencount < 10 && sum <= 100; tencount++) {
			num[tencount] = Integer.parseInt( br.readLine() );
			sum = sum + num[tencount];
		}
		
		for(int j = 0; j < tencount; j++) {
			System.out.println(num[j]);
		}
	}

}
