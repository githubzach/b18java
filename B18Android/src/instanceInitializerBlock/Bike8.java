package instanceInitializerBlock;

public class Bike8 {  
	//instance variable
    int speed;  
      
    //constructor
    Bike8(){System.out.println("constructor is invoked");}  
   
    //instance initializer block
    {System.out.println("instance initializer block invoked");}  
       
    
    
    public static void main(String args[]){  
    	//new two objects
    	Bike8 b1=new Bike8();  
    	Bike8 b2=new Bike8();  
    }      
}  