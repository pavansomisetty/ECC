
public class OddPalindromes01 {
	
	 public static void main(String[] args) {
	        int num1 = 1500;
	        int num2 = 2000;
	        System.out.println(generateOddPalindromes(num1, num2));
	        
	    }

	    public static String generateOddPalindromes(int start, int limit) {
	    	
	    	
	    	if(start <= 0 || limit <=0)
	    		return "-1";
	    	if(start >= limit)
	    		return "-2";
	       
	    	String str = "";
	    	for(int i = start ; i <= limit ; i++){
	    		if(isPalindrome(i) && isAllDigitsOdd(i)){
	    			str += i+",";
	    		}
	    	}
	    	if(str.isEmpty())
	    		return "-3";
	    	return str.substring(0,str.length()-1);
	    	
	    	
	    	
	    }

	    public static boolean isPalindrome(int num) {
	        if(num == reverse(num))
	        	return true;
	        else
	        	return false;
	    
	    }

	    public static int reverse(int num) {
	        int rev =0 , rem;
	    	while(num != 0){
	    		rem = num % 10;
	    		rev = rev*10 + rem;
	    		num = num/10;
	    	}
	    	
	    	return rev;
	    	
	    }

     public static boolean isAllDigitsOdd(int num) {
	        int count = 0,rem;
	    	while(num != 0){
	    		rem = num %10;
	    		num = num/10;
	    		if(rem % 2 == 0){
	    			count++;
	    			
	    		}
	    		
	    	}
	    	
	    	if(count == 0)
	    		return true;
	    	
	    	else
	    		return false;
	    }
	
	
	
	
	

}
