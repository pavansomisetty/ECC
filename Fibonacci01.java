
public class Fibonacci01 {
	
	public static void main(String[] args) {
	 	System.out.println(getFibonacciSeries(4));
	}
	public static String getFibonacciSeries(int num) {
		
		int a = 0 , b = 1 ,sum;
		
		  String str= "";
		  
		  if(num < 1 || num > 40)
			  return "-1";
		  
		  if(num == 1)
			  return "0";
		  
		  if(num == 2)
			  return "0,1";
        
           for(int i = 1 ; i <= num ; i++){
			
        	  
			
			sum = a + b;
			
			 str +=  a+",";
			
			a = b ;
			
			b = sum ;
			
			
		}
		str = str.substring(0, str.length()-1);
           return str;
		
    }

}
