package day07;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class esempioRegex {

	public static void main(String[] args) {
		String testo = "la data odiera è: 2023-08-10. Domani sarà 2023-02-11 ";
		String regex = "\\d{4}-\\d{2}-\\d{2}";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(testo);
		System.out.println("Date trovate:");
		while(matcher.find()) {
		String data = matcher.group();
		System.out.println(data);
		
		}
	}

}
