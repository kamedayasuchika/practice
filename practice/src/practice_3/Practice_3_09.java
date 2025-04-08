package practice_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice_3_09{

	public static void main(String[] args)throws IOException {
		BufferedReader br = 
			new BufferedReader(new InputStreamReader( System.in ) );
		
		System.out.println("0=日曜、1=月曜、2=火曜、3=水曜、4=木曜、5=金曜、6=土曜");
		System.out.println("0=午前、1=午後、2=夜間");
		int day = Integer.parseInt( br.readLine() );
		int time= Integer.parseInt( br.readLine() );
		
		if(day == 0){
			System.out.println("休診");
		}else if(time == 0 && (day == 2 || day == 5)){
			System.out.println("休診");
		}else if(time == 1 && day == 6){
			System.out.println("休診");
		}else if(time == 2 && (day == 3 || day == 6)){
			System.out.println("休診");
		}else{
			System.out.println("〇");
		}
	}
}