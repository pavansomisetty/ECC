
public class SumOfDigits01 {

	public static void main(String[] args) {
		int num = 99;
        System.out.println(getSumOfDigits(num));
	}
	
	 public static int getSumOfDigits(int num)	{
		 int unitdigit = 0 , tendigit = 0, result = 0;
		 if(num > 99 || num < 10)
			 return 0;
		 
		 else{
			 
			 unitdigit = num % 10;
			 tendigit = num/10;
			 result = unitdigit + tendigit;
		 }
			 
			  
			 
		 return result;
		    //ADD YOUR CODE HERE
	    }

}
