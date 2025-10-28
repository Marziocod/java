package day07;

public class ISBN10 {

	public static boolean isValidIsbn10 (String isbn) {
		if(isbn==null) {
		return false;
		}
		String cleanIsbn = isbn.replace("-", " ");
		if(cleanIsbn.length() != 10) {
			return false;
		}
		int sum = 0;
		for (int i = 0; i<cleanIsbn.length()-1; i++) {
			char carattere= cleanIsbn.charAt(i);
			if (!Character.isDigit(carattere)) {
				return false;
			}
			sum=sum+(carattere-'0')*(10-i);
			
		}
		char ultimoCarattere = cleanIsbn.charAt(cleanIsbn.length()-1);
		int ultimoValore;
		if(ultimoCarattere =='X') {
			ultimoValore=10;
		}else if (Character.isDigit(ultimoCarattere)) {
			ultimoValore = ultimoCarattere-'0';
			
		}else {
			return false;
		}
		sum=sum+(ultimoValore*1);
		return sum %11 == 0;
	}
	
	
	public static void main(String[] args) {
		String[] testCases = {
				"3-598-21508-8",
				"3-598-21507-X",
				"31-598-21508-9", 
				"3598215088",
				"359821507X",
				"88-7642-044-7"
				};	
		for(int i=0;i<testCases.length; i++) {
		boolean result = isValidIsbn10 (testCases[i]);
		System.out.println("ISBN \"" + testCases[i] + "\" è valido? " + isValidIsbn10(testCases[i]));
		
		}
	}

}
