package practice_4;

public class Practice_4_22 {

	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 1;
		int sum = num1 + num2;
		
		while(num1 <= 1000) {
			System.out.print(num1 + "," );
			
			num1 = num2;
			num2 = sum;
			sum = num1 + num2;
			
			}
		}

	}
