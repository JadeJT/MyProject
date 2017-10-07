import java.util.Scanner;

public class GCD {

	public static int max(int number1, int number2){
		int max = 0;
		if(number1 > number2){
			max = number1;
		}else{
			max = number2;
		}
		return max;
	}
	
	public static int min(int number1, int number2){
		int min = 0;
		if(number1 < number2){
			min = number1;
		}else{
			min = number2;
		}
		return min;
	}
	
	public static void main(String[] args) {
		
		int integer1 = 0, integer2 = 0, integer3 = 0;
		int GCD = 1;
		int tempGCD = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter 3 integer : ");
		integer1 = scan.nextInt();
		integer2 = scan.nextInt();
		integer3 = scan.nextInt();
		
		if( max(integer1, integer2) % min(integer1, integer2) == 0 ){
			int tempMin = min(integer1, integer2);
			if( max(tempMin, integer3) % min(tempMin, integer3) == 0 ){
				GCD = min(tempMin, integer3);
			}else{
				int tempNumber = max(tempMin, integer3) % min(tempMin, integer3);
				if(( tempMin % tempNumber == 0 ) && ( integer3 % tempNumber == 0)){
					GCD = tempNumber;
				}
			}
		}else if (max(integer1, integer2) % min(integer1, integer2) != 0){
			while(max(integer1, integer2) % min(integer1, integer2) != 0){
				tempGCD = max(integer1, integer2) % min(integer1, integer2);
				integer1 = integer2;
				integer2 = tempGCD;
			}
			if(max(tempGCD, integer3) % min(tempGCD, integer3) == 0){
				GCD = tempGCD;
			}
		}
		
		System.out.println("GCD is " + GCD);
		
	}
}
