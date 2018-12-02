
public class MaskEmailID01 {
	public static void main(String[] args) {
        String email = "testmail@gmail.com";
        System.out.println(maskMailID(email));
    }

    public static String maskMailID(String email) {
        
    	int index = email.indexOf("@");
    	//String output = "teXXXXXX@gmail.com";
    	String str ="";
    	String mask = email.substring(2, index);
    	
    	String str1 = "";
    	for(int i = 2 ; i < index ; i++ ){
    		
    		str += "X" ;
    	}
    		str1 = email.replace(mask, str);
    		
    		//System.out.println(str1.equals(output));
    	return str1;
    	
    }

}
