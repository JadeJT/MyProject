import java.util.Scanner;

public class Dolphin {

	public static void main(String[] args){
		
		int testCase = 0;
		int input = 0;
		int round = 0;
		int old = 0;
		int dolphin = 1, jump = 1;
		Scanner number = new Scanner(System.in);
		
		System.out.print("Input testcase : ");
		testCase = number.nextInt();
		
		if((testCase >= 1) && (testCase <= 1000)){
			for(int i = 1; i <= testCase; i++){
				System.out.print("Input : ");
				input = number.nextInt();
				if(input == 0){
					i = testCase + 1;
					continue;
				}
				old = 0;
				round = 0;
				dolphin = 1; 
				jump = 1;
				
				for(int j = 1 ; j <= 2000000000 ; j++){
					old = round;
					round += j*3;
				
					if((input <= round) && (input <= 2000000000)){
						if((input - old ) <= dolphin*j){
							if(old != 0){
								System.out.println(j + " dolphins");break;
							}else{
								System.out.println(j + " dolphin");break;
							}
						}else if((input - old) <= (dolphin + jump) * j){
							if(old != 0){
								System.out.println(j + " jump");break;
							}else{
								System.out.println(j + " jump");break;
							}
						}else {
							System.out.println("splash");break;
						}
					}
				}
			}
		} else {
			System.out.println("Error");
		}
	}
}