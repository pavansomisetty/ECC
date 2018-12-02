
public class NextHundred01 {
	public static void main(String[] args) {
		int num = 79;
		System.out.println(getNextMultipleOf100(num));
		
		//Add your code here
		
	}
	
	public static int getNextMultipleOf100(int num) {
		
		int digit;
		if(num < 1)
			return -1;
		else{
			
			digit = ((num / 100)+1)*100;
		}
			return digit;
			
	
		
		//Add your code here
		
	}
	

}
