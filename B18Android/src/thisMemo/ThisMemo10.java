package thisMemo;

public class ThisMemo10 {  
	//method:print reference
	void m(){  
		System.out.println(this);//prints same reference ID  
	}  
		
	
	public static void main(String args[]){  
		ThisMemo10 obj=new ThisMemo10();  
		System.out.println(obj);//prints the reference ID  
		obj.m();  
	}  
}  