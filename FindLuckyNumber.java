
public class FindLuckyNumber {

	public static void main(String[] args) {
        String date = "15-MARCH-2016";
        System.out.println(getLuckyNumber(date));
        
    }
    // return the lucky number, based on date of birth
    public static int getLuckyNumber(String date) {
    	
    	String str[] = date.split("-");
        int s = convertMMMtoMM(str[1]);
        int num = Integer.parseInt(str[0]) + s + Integer.parseInt(str[2]);
        int d = getSumOfDigits(num);
		return d;
        // ADD YOUR CODE HERE
    }

    // convert the given month in to number format(given "JAN" return 1)
   public static int convertMMMtoMM(String mon) {
    	
    	
    	if(mon.toLowerCase().equals("jan") || mon.toLowerCase().equals("january"))
    			return 1;
    	else if(mon.toLowerCase().equals("feb") || mon.toLowerCase().equals("february"))
			return 2;
    	else if(mon.toLowerCase().equals("mar") || mon.toLowerCase().equals("march"))
			return 3;
    	else if(mon.toLowerCase().equals("apr") || mon.toLowerCase().equals("april"))
			return 4;
    	else if(mon.toLowerCase().equals("may"))
			return 5;
    	else if(mon.toLowerCase().equals("jun") || mon.toLowerCase().equals("june"))
			return 6;
    	else if(mon.toLowerCase().equals("jul") || mon.toLowerCase().equals("july"))
			return 7;
    	else if(mon.toLowerCase().equals("aug") || mon.toLowerCase().equals("august"))
			return 8;
    	else if(mon.toLowerCase().equals("sep") || mon.toLowerCase().equals("september"))
			return 9;
    	else if(mon.toLowerCase().equals("oct") || mon.toLowerCase().equals("october"))
			return 10;
    	else if(mon.toLowerCase().equals("nov") || mon.toLowerCase().equals("november"))
			return 11;
    	else if(mon.toLowerCase().equals("dec") || mon.toLowerCase().equals("december"))
			return 12;
    	
    	else
    	
		return 0;
        // ADD YOUR CODE HERE    
    }
    
    // add the sum of all digits for the given number
   public static int getSumOfDigits(int num) {
    	int sum = 0 ;
    	
    	while (num > 0 || sum > 9)  
        { 
            if (num == 0) { 
                num = sum; 
                sum = 0; 
            } 
            else{
            sum += num % 10; 
            num /= 10;
            }
        } 
    	
    	
		return sum;
        // ADD YOUR CODE HERE
    }
	
	
	
	
	
	
}
