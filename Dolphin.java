import java.util.Scanner;

public class Dolphin {

	public static void main(String[] args){
		
		int testCase = 0;
		int input = 0;
		int currentRound = 0;
		int oldRound = 0;
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
				oldRound = 0;
				currentRound = 0;
				dolphin = 1; 
				jump = 1;
				
				for(int j = 1 ; j <= 2000000000 ; j++){
					oldRound = currentRound;
					currentRound += j*3;
				
					if((input <= currentRound) && (input <= 2000000000)){
						if((input - oldRound) <= dolphin * j){
							if(oldRound != 0){
								System.out.println(j + " dolphins");break;
							}else{
								System.out.println(j + " dolphin");break;
							}
						}else if((input - oldRound) <= (dolphin + jump) * j){
							if(oldRound != 0){
								System.out.println(j + " jumps");break;
							}else{
								System.out.println(j + " jump");break;
							}
						}else {
							System.out.println("splash");break;
						}
					}
					
				}
				
			}
			System.out.println("END");
			
		} else {
			System.out.println("Error");
		}
		
	}
	
}
