package thisMemo;

public class ThisMemo6 {
	//instance variables
	int rollno;  
	String name,course;  
	float fee;
	
	//Constructor with "this"
	ThisMemo6(int rollno,String name,String course){  
		this.rollno=rollno;  
		this.name=name;  
		this.course=course;
	}
	//Constructor with this() method
	ThisMemo6(int rollno,String name,String course,float fee){  
		this(rollno,name,course);//reusing constructor  
		this.fee=fee;  
	} 
	
	//method
	void display(){System.out.println(rollno+" "+name+" "+course+" "+fee);}
	
	public static void main(String[] args) {
		ThisMemo6 s1=new ThisMemo6(111,"ankit","java");  //call first 
		ThisMemo6 s2=new ThisMemo6(112,"sumit","java",6000f); //call second
		s1.display();  
		s2.display();
	}
	
}



