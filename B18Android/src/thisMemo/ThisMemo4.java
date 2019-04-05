package thisMemo;

public class ThisMemo4 {
	
	//Constructor
	ThisMemo4(){System.out.println("hello a");} 
	ThisMemo4(int x){  
		this();  //refer to ThisMemo4();
		System.out.println(x);  
	}
	
	
	public static void main(String[] args) {
		ThisMemo4 a = new ThisMemo4(10);  
	}
}
