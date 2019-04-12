package encapsulationDemo;


class B{  
	public static void main(String[] args){  
		//creating instance of the encapsulated class  
		A a = new A();  
		//setting value in the name member  
		a.setID(007);  
		//getting value of the name member  
		System.out.println(a.getID());  
	}  
} 