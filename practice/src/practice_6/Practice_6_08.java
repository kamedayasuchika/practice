package practice_6;

public class Practice_6_08 {

	public static void main( String[] args )
	{
	    for( int n = 11 ; n <= 20 ; n++ )
	        System.out.print( fibo( n ) + " " );
	}

	public static int fibo( int n ){
		if(n < 2) {
			return n;
		} else {
			return fibo(n - 1) + fibo(n - 2);
		}

	}
}



