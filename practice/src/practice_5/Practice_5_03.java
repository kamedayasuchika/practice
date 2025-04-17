package practice_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice_5_03 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = 
			new BufferedReader(new InputStreamReader( System.in ) );
		
		int num[] = new int[10];
		
		for(int i = 0; i < 10; i++) {
			num[i] = Integer.parseInt( br.readLine() );
		}
		
		System.out.print("偶数:");
		for(int i = 0; i < 10; i++) {
			if(num[i] % 2 == 0) {
				System.out.print(num[i] + " ");
			}
		}
		
		System.out.print("奇数:");
		for(int i = 0; i < 10; i++) {
			if(!(num[i] % 2 == 0)) {
				System.out.print(num[i] + " ");
			}
		}
	}
}

