package OverridingDemoPak;

public class OverloadingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OverloadingDemo overLd=new OverloadingDemo();
		
		overLd.m1(new Object());
		
		overLd.m1("STRING Args");
		
		overLd.m1(new StringBuffer());
		
		//overLd.m1(null);
	}
	
	
	public void m1(Object ob)
	{
		System.out.println("Object Arguments");
	}
	
	public void m1(String str)
	{
		System.out.println("String Arguments");
	}
	
	public void m1(StringBuffer sb)
	{
		System.out.println("StringBuffer Arguments");
	}

}
