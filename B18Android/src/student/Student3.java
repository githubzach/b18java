package student;
class Student5{  
	int rollno;  
	String name;  
	void insertRecord(int r, String n){  
		rollno=r;  
		name=n;  
	}  
	void displayInformation(){
		System.out.println(rollno+" "+name);}  
	}  
class Student3{  
	
	public static void main(String args[]){  
		Student5 s1=new Student5();  
		Student5 s2=new Student5();  
		s1.insertRecord(111,"Karan");  
		s2.insertRecord(222,"Aryan");  
		s1.displayInformation();  
		s2.displayInformation();  
	}  
}  