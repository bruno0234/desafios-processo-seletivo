/*
	This source code has three different solutions, namely
	reverseString1(), reverseString2() and reverseString3() for the fifth
	challenge
*/

public class Challenge5 {
	public static void main(String[] args) {
		String str = "String to reverse";
		System.out.println(reverseString1(str));
		System.out.println(reverseString2(str));
		System.out.println(reverseString3(str));
	}

	public static String reverseString1(String str) {
		// We could use the StringBuilder.reverse() method here
		StringBuilder reversedString = new StringBuilder(str.length());
		for (int i = str.length() - 1; i >= 0; i--) {
			reversedString.append(str.charAt(i));
		}
		return reversedString.toString();
	}

	public static String reverseString2(String str) {
		char[] reversedString = new char[str.length()];
		int lastIndex = str.length() - 1;
		for (int i = 0; i < str.length(); i++) {
			reversedString[i] = str.charAt(lastIndex - i);
		}
		return new String(reversedString);
	}

	public static String reverseString3(String str) {
		String reversedString = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reversedString += str.charAt(i);
		}
		return reversedString;
	}
}
