package practice_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice_2_06{

	public static void main(String[] args) throws IOException{
		BufferedReader br = 
				new BufferedReader(new InputStreamReader( System.in ) );

		System.out.println("あなたの年齢を教えてください");
		int x = Integer.parseInt( br.readLine() );
		System.out.println("あなたが生まれておよそ" + x * 365 + "日経っています");
	}

}