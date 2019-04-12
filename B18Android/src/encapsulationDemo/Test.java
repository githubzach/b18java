//A Java class to test the encapsulated class.  
package encapsulationDemo;

class B{  
	public static void main(String[] args){  
		//creating instance of the encapsulated class  
//		A s = new A(); 
		A s = new A();
//		setting value in the name member  
		s.setName("vijay");  
		//getting value of the name member  
		System.out.println(s.getName());  
	}  
}  