package challenge;

public class MergeString {

	public static String mergeTwoString(String str1,String str2) {
		//calculate length of String1:str1.length()
		//calculate length of String2:str2.length()
		String outputString = "";
		//totally execute :str1.length() + str2.length() times
		
		if (str1.length() > str2.length()) {
			//Case1:
			//if str1.length() > str2.length()
			//1.for loop common length:
			int length1 = str2.length();
			for (int i = 0; i < length1; i++) {
				outputString += "" + str1.charAt(i) + str2.charAt(i);
			}
			//2.interate the remain of str1
			//calculate the remain:
			//times = str1.length() - str2.length();
			int startFromv1 = str2.length();
			for (int i = startFromv1; i < str1.length(); i++) {
				outputString += "" + str1.charAt(i);
			}
		}else if (str1.length() < str2.length()) {
			//Case2:
			//if str2.length() > str1.length()
			int length2 = str1.length();
			for (int i = 0; i < length2; i++) {
				outputString += "" + str1.charAt(i) + str2.charAt(i);
			}

			//2.interate the remain of str1
			//calculate the remain:
			//times = str1.length() - str2.length();
			int startFromv2 = str1.length();
			for (int i = startFromv2; i < str2.length(); i++) {
				outputString += "" + str2.charAt(i);
			}
		}else {
			//case 3： same length
			int length = str1.length();
			for (int i = 0; i < length; i++) {
				outputString += "" + str1.charAt(i) + str2.charAt(i);
			}
		}
		//return output
		return outputString;
	}

	
	
	
	public static void main(String[] args) {
		String input1 = "abcde";
		String input2 = "defgfggg";
		System.out.println(mergeTwoString(input1, input2));
		
	}
}
