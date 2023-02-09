package thisdemo;

public class ThisDemo {

	int n=10;
	public void m1()
	{
		
	System.out.println("M1 method");
	}
	
	public  void m2()
	{
		System.out.println(n);
		System.out.println("M2 Method");
		this.m1();
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisDemo th=new ThisDemo();
		th.m2();
		
	}

}
