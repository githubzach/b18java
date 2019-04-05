package thisMemo;
//4) this: to pass as an argument in the method
public class ThisMemo7 {
	//constructor
	void m(ThisMemo7 obj){ System.out.println("method is invoked"); }  
	void p(){  m(this);   }  

	public static void main(String[] args) {
		ThisMemo7 s1 = new ThisMemo7();  
		s1.p();
	}
}
