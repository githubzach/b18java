//A Java class which is a fully encapsulated class.  
package encapsulationDemo;  

public class A{  
	//private data member  
	private String name;  
	//getter method for name  
	public String getName(){  
		return name;  
	}  
	//setter method for name  
	private void setName(String name){  
		this.name=name;
	}  
	
	public static void main(String[] args) {
		A a = new A();
		a.getName();
	}
}  