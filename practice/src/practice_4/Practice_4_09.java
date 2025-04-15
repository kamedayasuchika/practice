package practice_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice_4_09 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = 
			new BufferedReader(new InputStreamReader( System.in ) );

			int max_value = Integer.parseInt( br.readLine() );
			int min_value = max_value;

			for( int i = 1 ; i < 10 ; i++ ){
		    int value = Integer.parseInt( br.readLine() );

		    if( value > max_value )
		        max_value = value;

		    if( value < min_value )
		        min_value = value;
		}

		System.out.println( "最大値" + max_value);
		System.out.println( "最小値" + min_value);
	}
}

