package thisMemo;

//ThisMemo:
//constructor without key world.
//it will confuse constructor
//so constructor just create that without initializing it.

public class ThisMemo {
	//instance variables 
	int rollNo;
	String name;
	float fee;
	
	//constructor
	ThisMemo(int rollNo, String name, float fee) {
			rollNo = rollNo;
			name = name;
			fee = fee;
		}
	
	public void display(){System.out.println(rollNo+" "+name+" "+fee);}  
	
	
	public static void main(String[] args) {
//		System.out.println("hello world!");
		ThisMemo s1 = new ThisMemo(111,"ankit",5000f);  
		ThisMemo s2 = new ThisMemo(112,"sumit",6000f);  
		s1.display();  
		s2.display(); 
	}
}
