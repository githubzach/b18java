package student;

public class Student1{
	//instance variables
	int rollNo;
	String name;
	int age;
	int score;
	
	
	//static variable  
    static String college ="ITS";

	//constructor0:
		public Student1() {
			super();
		}
		
	//constructor1:rollNo,name
	public Student1(int r, String n) {
		super();
		this.rollNo = r;
		this.name = n;
	}

	//constructor2:rollNo,name,age
	public Student1(int r,String n, int a) {
		super();
		this.rollNo = r;
		this.name = n;
		this.age = a;
	}

	
	//constructor3:rollNo,name,age,score
	public Student1(int r,String n, int a, int s) {
		super();
		this.rollNo = r;
		this.name = n;
		this.age = a;
		this.score = s;
	}
	
	
	static int calculateAverage(int a,int b,int c) {
		return (a + b + c) / 3;
	}
	
	
	//insertRecord()
	public void insertRecord(int r,String n){
		rollNo = r;
		name = n;
		int a = 10;
		int b = 20;
		int c = a + b;
		
	}


	public void displayRecord(){
		System.out.println("name = " + name + "\nid = " + rollNo + "\nCollege name: " + college);
	}

	public static void main(String[] args){
		Student1 s1 = new Student1();
		s1.insertRecord(007, "bond");
		s1.displayRecord();
		calculateAverage(10, 20, 30);
		
	}

}