package practice_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice_5_08 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = 
				new BufferedReader(new InputStreamReader( System.in ) );
		
		int sort[] = new int[10];
		
		for(int i = 0; i < 10; i++) {
			sort[i] = Integer.parseInt( br.readLine() );
		}
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				if(sort[i] > sort[j]) {
					int keep = sort[i];
					sort[i] = sort[j];
					sort[j] = keep;
				}
			}
		}
		for(int i = 9; i >= 0 ; i--) {
			System.out.print(sort[i] + " ");
		}
		
	}
}

