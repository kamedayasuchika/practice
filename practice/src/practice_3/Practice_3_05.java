package practice_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice_3_05{

	public static void main(String[] args)throws IOException {
		BufferedReader br = 
			new BufferedReader(new InputStreamReader( System.in ) );
		
		int x = Integer.parseInt( br.readLine() );
		 
		if((x % 2) == 0){
		    System.out.println("偶数");
		}else{
		    System.out.println("奇数");
		}
		
	}	
}