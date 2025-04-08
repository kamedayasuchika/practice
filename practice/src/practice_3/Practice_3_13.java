package practice_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice_3_13 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = 
			new BufferedReader(new InputStreamReader( System.in ) );
		
		int monthOfEndDay = Integer.parseInt( br.readLine() );
		
		switch(monthOfEndDay) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("月の最終日は31");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("月の最終日は30");
			break;
		case 2:
			System.out.println("月の最終日は28");
			break;
		default:
			System.out.println("入力が間違っています");
			break;
		}
	}
}
