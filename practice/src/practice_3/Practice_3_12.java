package practice_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice_3_12 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = 
			new BufferedReader(new InputStreamReader( System.in ) );
		
		int sushi = Integer.parseInt( br.readLine() );
		
		switch(sushi) {
		case 1:
			System.out.println("マグロ");
			break;
		
		case 2:
			System.out.println("えび");
			break;
		
		case 3:
			System.out.println("こはだ");
			break;
		}
	}

}
