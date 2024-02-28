import java.util.Scanner;

public class DeseneGoreMetod {

public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
	int num;
	System.out.print("Enter a number :");
	num = input.nextInt();
	fiveGame(num);
			
}


public static void fiveGame(int num) {
	
	
	
	if(num<=0)  {
			
		System.out.print(num + " ");
		

		}
	
	else if (num>0){
		
		System.out.print(num + " ");
		fiveGame(num-5);
		System.out.print(num +" ");
		
		
		}
	
}
	
}