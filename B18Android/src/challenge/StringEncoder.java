package challenge;

public class StringEncoder {
	public static String encodeVowels(String str) {
		str = str.replace("a", "1");
		str = str.replace("e", "2");
		str = str.replace("i", "3");
		str = str.replace("o", "4");
		str = str.replace("u", "5");
		return str;
	}
	
	public static String encodeYs(String str) {
		str = str.replace(" ", "y");
		return str;
	}
	
	// B, C, D, F, G, H, J, K, L, M, N, P, Q, R, S, T, V, X, Z, W 
	public static String encodeConsonants(String str) {
		str = str.replace("b", "a");
		str = str.replace("c", "b");
		str = str.replace("d", "c");
		str = str.replace("e", "d");
		str = str.replace("f", "g");
		str = str.replace("g", "f");
		str = str.replace("h", "g");
		str = str.replace("j", "i");
		str = str.replace("k", "j");
		str = str.replace("l", "k");
		str = str.replace("m", "l");
		str = str.replace("n", "m");
		str = str.replace("p", "o");
		str = str.replace("q", "p");
		str = str.replace("r", "q");
		str = str.replace("s", "r");
		str = str.replace("t", "s");
		str = str.replace("v", "u");
		str = str.replace("x", "w");
		str = str.replace("z", "y");
		str = str.replace("w", "v");
		return str;
	}
	
	public static String encoderNumbers(String str) {
		str = str.replace("12", "21");
		str = str.replace("1234", "4321");
		return str;
	}

	public static String encoderPunc(String str) {
		char [] punctuation = {'.' , ',' , ';' , ':', '?' , '!' , '"' , '\'' , ')' , '('};
        int i;

        for (i = 0; i < punctuation.length;i++){
            for(int j = 0; j < str.length(); j++){
                if(str.charAt(j) == punctuation[i]){
                    str = str.replace(""+punctuation[i], "");
                }    
            }
        }
		return str;
	}
	
	public static int reverseNum(int num) {
		
		int rev = 0;
		while(num!=0) {
			rev = rev * 10 + num % 10;
			num /= 10;
		}
		return rev;
	}
	
	
	public static void main(String[] args) {
		String in = "Hello World!";
		String in2 = "Why haven't you finished the exercise yet?\" said Nate";
		in = in.toLowerCase();
		//Expect Output:g2kk4yv4qkc
		in = encodeVowels(in);
		in = encodeYs(in);
		in = encodeConsonants(in);
		in = encoderNumbers(in);
		in = encoderPunc(in);
		System.out.println(in);
		
		in2 = encodeVowels(in2);
		in2 = encodeYs(in2);
		in2 = encodeConsonants(in2);
		in2 = encoderNumbers(in2);
		in2 = encoderPunc(in2);
		System.out.println(in2);
		
		//reverse number:
//		int a = 579;
//		int rv = reverseNum(a);
//		System.out.println(rv);
	}
}
