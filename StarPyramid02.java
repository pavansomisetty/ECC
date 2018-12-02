
public class StarPyramid02 {
	 public static void main(String[] args) {
	        System.out.print(starPattern(6));
	    }

		public static String starPattern(int rows) {
			String str = "";
			
			if(rows < 0)
				return "-1";
			if(rows == 0)
			return "-2";
			for(int i = 1 ; i <= rows ; i++){
				
				for(int k = rows ; k > i ; k--){
					
					str += " ";
				}
				for(int j = 1 ; j <= i ; j++){
					if(j == i)
					str += "*";
					
					else
						str += "**";
				}
				str += "\n";
				
			}
			
			
			
			return str;
	    }
}
