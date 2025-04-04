package practice_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice_3_08 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = 
			new BufferedReader(new InputStreamReader( System.in ) );
		
		int tyukan = Integer.parseInt( br.readLine() );
		int kimatsu = Integer.parseInt( br.readLine() );
		
		if(tyukan >= 60 && kimatsu >= 60) {
			System.out.println("合格");
		}else if((tyukan + kimatsu) >= 130) {
			System.out.println("合格");
		}else if(tyukan >= 90 || kimatsu >= 90 &&
				(tyukan + kimatsu) >= 100){
			System.out.println("合格");
		}else {
			System.out.println("不合格");		
		}
	}
}
