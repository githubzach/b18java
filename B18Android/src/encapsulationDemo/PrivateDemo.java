package encapsulationDemo;

class A{
	private int data = 40;
	private void msg() {System.out.println("hello java");}	
}


public class Simple{
	public static void main(String[] args) {
		A objA = new A();
		//System.out.println(objA.data);
		//obj.msg();
	}
}