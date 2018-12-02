
public class Max3Num01 {
	 public static void main(String[] args) {
	        int n1 = 42;
	        int n2 = 56;
	        int n3 = 12;
	        System.out.println(getMaxNumber(n1, n2, n3));
	    }

	    public static int getMaxNumber(int num1, int num2, int num3) {
	       
	    	if(num1 < 1 || num2 < 1 || num3 < 1)
	    		return -1;
	    	    	
	    	if((num1 > num2) && (num1 > num3) )
	    		return num1;
	    	
	    	else if (num2 > num3)
	    		return num2;
	    	else
	    		return num3;
	    	
	    	
	    }
}
