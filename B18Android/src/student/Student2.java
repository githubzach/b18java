package student;
class Student4{  
	int id;  
	String name;  
}  
class Student2{  
	public static void main(String args[]){  
  //Creating objects  
		Student4 s1=new Student4();  
		Student4 s2=new Student4();  
  //Initializing objects  
		s1.id=101;  
		s1.name="Sonoo";  
		s2.id=102;  
		s2.name="Amit";  
  //Printing data  
		System.out.println(s1.id+" "+s1.name);  
		System.out.println(s2.id+" "+s2.name);  
	}  
}  