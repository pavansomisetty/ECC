
public class AverageWordLength {
	public static void main(String[] args) {
		System.out.println(AverageWordLength.getAverageWordLength("Hi mom"));
		System.out.println(AverageWordLength.getAverageWordLength("hi everyone"));
		System.out.println(AverageWordLength.getAverageWordLength(null));

	}

	public static int getAverageWordLength(String str) {
		
		
		int count =0, sum = 0 , average;
		
		if(str == null){
			return -1;
		}
		else if (str == "")
			return 0;
		
		String parts[] = str.split(" ");
		for(int i = 0 ; i < parts.length ; i++){
		count++;
		sum += parts[i].length();
		}
		average = sum/count;
		
		return average;

	}
	
}
