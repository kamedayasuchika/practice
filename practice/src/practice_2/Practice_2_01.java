package practice_2;

import java.io.*;

public class Practice_2_01{

	public static void main(String[] args) throws IOException{
		BufferedReader br = 
				new BufferedReader(new InputStreamReader( System.in ) );

		String  s = br.readLine();    // 1行分の文字列を入力する
		System.out.println(s);
	}

}
