package polymorphism;

class A{  
	  void run(){System.out.println("Vehicle is running");}  
	}  
	//Creating a child class  
	

class B extends A{  
	 void run(){System.out.println("this is my own implementation,B is running");
	 
	 }
	  public static void main(String args[]){  
	  //creating an instance of child class   
	  B obj = new B();  
	  //calling the method with child class instance  
	  obj.run();  
	  }  
	}