package practice_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice_3_07 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = 
			new BufferedReader(new InputStreamReader( System.in ) );
		
		int x = Integer.parseInt( br.readLine() );
		 
		if(x >= 60){
		    System.out.println("合格");
		}else{
		    System.out.println("不合格");
		}
		 
		if(x >= 80){
		    System.out.println("たいへんよくできました");
		}else if(x >= 60){
		    System.out.println("よくできました");
		}else{
		    System.out.println("残念でした");
		}
		 
		if(x >= 80){
		    System.out.println("優");
		}else if(x >= 70){
		    System.out.println("良");
		}else if(x >= 60){
		    System.out.println("可");
		}else{
		    System.out.println("不可");
		}
	}
}	
