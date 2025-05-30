package practice_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice_3_11 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = 
			new BufferedReader(new InputStreamReader( System.in ) );
		
		int month = Integer.parseInt( br.readLine() );
		
		switch(month) {
		case 1:
			System.out.println("元旦、成人の日");
			break;
		case 2:
			System.out.println("建国記念の日");
			break;
		case 3:
			System.out.println("春分の日");
			break;
		case 4:
			System.out.println("昭和の日");
			break;
		case 5:
			System.out.println("憲法記念日、緑の日、こどもの日");
			break;
		case 6:
			System.out.println("なし。");
			break;
		case 7:
			System.out.println("海の日");
			break;
		case 8:
			System.out.println("なし。");
			break;
		case 9:
			System.out.println("敬老の日、秋分の日");
			break;
		case 10:
			System.out.println("体育の日");
			break;
		case 11:
			System.out.println("文化の日、勤労感謝の日");
			break;
		case 12:
			System.out.println("天皇誕生日");
			break;
		}
	}

}
