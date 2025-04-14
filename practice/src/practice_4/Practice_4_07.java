package practice_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice_4_07 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = 
			new BufferedReader(new InputStreamReader( System.in ) );
		
		int kyozin = 0;
		int hansin = 0;
		
		for(int i = 1; i < 10; i++) {
			System.out.print(i + "回表、巨人の得点は？");
			kyozin = kyozin + Integer.parseInt( br.readLine() );
			
			System.out.print(i + "回裏、阪神の得点は？");
			hansin = hansin + Integer.parseInt( br.readLine() );
		}
		System.out.println("巨人:" + kyozin + "点,阪神:" + hansin + "点");
		if(kyozin < hansin) {
			System.out.println("阪神の勝ち");
		}else if(kyozin == hansin) {
			System.out.println("引き分け");
		}else {
			System.out.println("巨人の勝ち");
		}
	}

}
