package thisdemo;

public class ThisDemo2 {

	
	int n;
	int m;
	String s;
	
	ThisDemo2(int n, int m)
	{
		this.n=n;
		this.m=m;
		
	}
	
	ThisDemo2()
	{
		this(10, 10);
	}
	
	ThisDemo2(int n, int m, String s)
	{
		this.n=n;
		this.m=m;
		this.s=s;
		
	}
	
	
	

	public void dispaly()
	{
		System.out.println("n= " +n + " " + "m= " +m + s);
	}
	
	public void show()
	{
		
		
		this.dispaly();
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisDemo2 objref=new ThisDemo2();
		objref.dispaly();
		
		ThisDemo2 objref1=new ThisDemo2(20, 20, "Nirmal");
		objref1.show();
	}

}
