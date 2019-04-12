package exceptionDemo;


public class ExceptionDemo1{  
	  public static void main(String args[]){  
	   try{  
	      //code that may raise exception  
	      int data=100/0;  
	   }catch(ArithmeticException e){System.out.println("this is my own error line\n" + e);}  
	   
	   
	   //rest code of the program   
	   System.out.println("rest of the code...");  
	  }  
	} 