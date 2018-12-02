import java.util.Scanner;

public class SumOfOdd {

	public static void main(String[] args) {
		
		int num , sum = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number = ");
		num = sc.nextInt();
		
		for(int i = 1 ; i <= num * 2   ; i++){
			if( i % 2 != 0)
			{
			System.out.println(i);
			
			sum += i;
			}
		}
		System.out.println("Sum of odd natural numbers = "+sum);
		
		sc.close();
		
	}

}
