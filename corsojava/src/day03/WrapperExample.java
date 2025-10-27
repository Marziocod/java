package day03;

public class WrapperExample {

	public static void main(String[] args) {
		Integer intWrapper = Integer.valueOf(42);
		int intValue = intWrapper.intValue();
		Double doubleWrapper = Double.valueOf(3.14);
		double doubleValue = doubleWrapper.doubleValue();
		Character charWrapper = Character.valueOf('A');
		char charValue = charWrapper.charValue();
		Boolean boolWrapper = Boolean.valueOf(true);
		boolean boolValue = boolWrapper.booleanValue();

		System.out.println("int : " + intValue);
		System.out.println("double : " + doubleValue);
		System.out.println("char : " + charValue);
		System.out.println("boolean : " + boolValue);

	}

}
