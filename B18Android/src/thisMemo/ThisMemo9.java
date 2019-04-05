package thisMemo;

public class ThisMemo9 {
	//method
	ThisMemo9 getA(){  
		return this;  
		}  
	
	//method
	void msg(){System.out.println("Hello java");}  
		}  


class Test1{
			
	public static void main(String args[]){  
		new ThisMemo9().getA().msg();  
	}  
}  