
public class TypeOfNumber01 {
	public static void main(String[] args) {
        int num = 28;
        int res = sumOfProperDivisors(num);
        if (res == 0)
            System.out.println(0);
        else if (res == 1) 
            System.out.println(1);
        else if (res == -1)
            System.out.println(-1);
       else if (res == -2)
        	System.out.println(-2);
        else if(res == -3)
        	System.out.println(-3);
        else
            System.out.println("Please Enter Positive Number");
    }

    public static int sumOfProperDivisors(int num) {
         int sum = 0;
         
         if(num < 0)
        	 return -2;
         if(num == 0)
        	 return -3;
         
    	for(int i = 1 ; i < num ; i++){
    		if(num % i == 0){
    			sum = sum + i;
    		}
    		
    	}
    	
    	if( sum == num)
    	return 0;
    	else if (sum > num)
    		return 1;
    	else
    		return -1;
    	
    	
    }
	
	
	

}
