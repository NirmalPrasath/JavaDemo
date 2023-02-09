package thisdemo;

public class SuperChild extends SuperParenClass {
	String colour="RED";
	SuperChild()
	{
		super();
		System.out.println("Chiled M2");
		
	}
	
	public void cClass()
	{
		
		System.out.println("CC");
		System.out.println(this.colour);
		System.out.println(super.colour);
		System.out.println(colour);
		super.m1();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperChild se=new SuperChild();	
		se.cClass();
	}

}
