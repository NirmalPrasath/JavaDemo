package OverridingDemoPak;

public class OverridingChild extends OverridingParentDemo {
	
	public void marriage()
	{
		//overridden
		//overriding
		System.out.println("Two");
			
	}
	
	private void m1()
	{
		System.out.println("Private Method Chile");
	}
	
	/* --------Cannot override the final method from OverridingParentDemo------
	public final void parentClass()
	{
		System.out.println("Parent Class Final Method");
	}
*/
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OverridingParentDemo p=new OverridingParentDemo();
		p.marriage();
		
		OverridingChild c=new OverridingChild();
		c.marriage();
		
		OverridingParentDemo parentReference=new OverridingChild(); //Runtime Polymorphism, Dynamic Polymorphism, Late Binding
		parentReference.marriage();
		
		
		OverridingChild privateMethod=new OverridingChild();
		privateMethod.m1();
		
		
	}

}
