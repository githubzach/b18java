package inheritance;

class A{  
	int id = 001;
	void eat(){System.out.println("eating...");}  
}  
class B extends A{  
void bark(){System.out.println("barking...");}  
}  




class TestInheritance{  
	public static void main(String args[]){  
		B d=new B();  
		d.bark();  
		d.eat();  
		d.id = 10;
		System.out.println(d.id);
}} 