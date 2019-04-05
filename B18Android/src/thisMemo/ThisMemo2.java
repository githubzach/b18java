package thisMemo;

public class ThisMemo2 {
	//instance variable
	int rollno;  
	String name;  
	float fee;  
	
	//constructor with using this
	ThisMemo2(int r,String n,float f){  
		rollno=r;  
		name=n;  
		fee=f;  
		} 
	
	//method
	void display(){System.out.println(rollno+" "+name+" "+fee);}
	
	
	
	public static void main(String[] args) {
		ThisMemo2 s1=new ThisMemo2(111,"ankit",5000f);  
		ThisMemo2 s2=new ThisMemo2(112,"sumit",6000f);  
		s1.display();  
		s2.display();  
	}
}
