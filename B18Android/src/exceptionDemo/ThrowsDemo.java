package exceptionDemo;


import java.io.IOException;  
class ThrowsDemo{  
  void m()throws IOException{  
    throw new IOException("device error");//checked exception  
  }  
  void n()throws IOException{  
    m();  
  }  
  void p(){  
   try{  
    n();  
   }catch(Exception e){System.out.println("exception handled");}  
  } 
  
  //stack
  public static void main(String args[]){  
	  ThrowsDemo obj=new ThrowsDemo();  
	  obj.p();//Exception should be handled in the bottom side of the program.  
	  System.out.println("normal flow...");  
  }  
} 
