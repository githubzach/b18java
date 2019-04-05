package thisMemo;

public class ThisMemo5 {
	//constructor
	ThisMemo5(){  
		this(5); //call itself again
		System.out.println("hello a");  
		}
	ThisMemo5(int x){  
		System.out.println(x);  
		} 
	
	public static void main(String[] args) {
		ThisMemo5 a = new ThisMemo5();  
	}

}
