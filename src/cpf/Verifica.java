package cpf;

public class Verifica {

	private static String numString;
	private static int[] number = new int[11];
		
	public static boolean verificaCPF(String num) {
		
		convertNumberFromString(num);
		
		System.out.println(number[2]);
		
		return firstNumber() && secondtNumber();
	}
		
	public String getNumString() {
		return numString;
	}
	public void setNumString(String num) {
		numString = num;
	}
	public int[] getNum() {
		return number;
	}
	public void setNum(int[] num) {
		number = num;
	}
	
	
	public static void convertNumberFromString(String num) {
		
		numString = num.replace(".","" ).replace("-", "").replace("/", "").replace("_", "").replace("+", "").replaceAll(" ", "");
				
		int[] array = new int[11];
		String character;
		for(int i = 0; i < 11; i++) {
			character = numString.substring(i, i + 1);
			array[i] = Integer.parseInt(character);
		}
		
		number = array;
				
	}
	
	public static boolean firstNumber() {
		
		int[] arraySum = new int[9];
		int totalSum = 0;
		for(int i = 0, base = 10; i < 9; i++, base--) {
			
			arraySum[i] = number[i] * base;
			totalSum+= arraySum[i];
		}
		
		int result = 11 - (totalSum % 11); 
		
		
		if(result > 9) {
			result = 0;
		}
						
		return result == number[9];
	}
	
	
public static boolean secondtNumber() {
		
		int[] arraySum = new int[10];
		int totalSum = 0;
		for(int i = 0, base = 11; i < 10; i++, base--) {
			
			arraySum[i] = number[i] * base;
			totalSum+= arraySum[i];
		}
		
		int result = 11 - (totalSum % 11); 
		
		
		if(result > 9) {
			result = 0;
		}
						
		return result == number[10];
	}
	
	
}
