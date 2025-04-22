package practice_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice_6_03 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = 
				new BufferedReader(new InputStreamReader( System.in ) );

		int x = Integer.parseInt( br.readLine() );
		int y = Integer.parseInt( br.readLine() );
		int z = Integer.parseInt( br.readLine() );

		int keep = sort(x , y);
		System.out.println(sort(keep , z));
	}

	public static int sort(int num1 , int num2) {
		if(num1 > num2) {
			return num1;
		}else {
			return num2;
		}
	}
}
