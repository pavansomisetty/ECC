import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int num , count = 0 ;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number = ");
		num = sc.nextInt();
		
		for(int i = 1 ; i <= num ; i++){
			
			if(num % i == 0){
				count ++;
				
			}
		}
		if(count == 2)
			System.out.println(num+" is prime Number");
		else
			System.out.println(num+" is not a prime number");
		
		sc.close();

	}

}
