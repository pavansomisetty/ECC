
public class TwoBoolean01 {
	 public static void main(String[] args) {
	        boolean b1 = true, b2 = true, b3 = false;
	        System.out.println(countBoolean(b1, b2, b3));
	    }
	    public static boolean countBoolean(boolean b1, boolean b2, boolean b3) {
	        
	    	if(b1 == true && b2 == true && b3 == true)
	    		return true;
	    	
	    	else if(b1 == true && b2 == true && b3 == false)
	    	    return true;
	    	else if(b1 == true && b2 == false && b3 == true)
	    		return true;
	    	else if(b1 == false && b2 == true && b3 == true)
	    		return true;
	    	else if(b1 == true && b2 == false && b3 == false)
	    		return false;
	    	else
	    		return false;
	    	
	    	
	     }
}
