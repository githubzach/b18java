package instanceInitializerBlock;

public class Bike7 {  
	//instance variable
    int speed;  
      
    //constructor called with 
    Bike7(){System.out.println("speed is "+ speed);}  
   
    //instance initializer block
    {speed = 100;}  
    //instance initializer block
       
    
    public static void main(String args[]){  
    	//new two objects.
    	Bike7 b1=new Bike7();  
    	Bike7 b2=new Bike7();  
    }      
}  
