package thisMemo;

public class ThisMemo3 {
	
	//methods
	void m(){System.out.println("hello m");}  
	void n(){
		System.out.println("hello n");  
		//m();//same as this.m()  
		this.m();
	}
	
	
	public static void main(String[] args) {
		ThisMemo3 a = new ThisMemo3();  
		a.n();  
	}
}
