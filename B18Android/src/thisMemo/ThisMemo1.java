package thisMemo;

public class ThisMemo1 {
	//instance variable
	int rollno;  
	String name;  
	float fee;  
	
	//constructor with using this
	ThisMemo1(int rollno,String name,float fee){  
		this.rollno=rollno;  
		this.name=name;  
		this.fee=fee;  
		} 
	
	//method
	void display(){System.out.println(rollno+" "+name+" "+fee);}
	
	
	
	public static void main(String[] args) {
		ThisMemo1 s1=new ThisMemo1(111,"ankit",5000f);  
		ThisMemo1 s2=new ThisMemo1(112,"sumit",6000f);  
		s1.display();  
		s2.display();  
	}
}
