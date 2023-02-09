package StaticDemo;

public class Callnonstatic {
	
	static int n=10;
	int m=100;
	
	public void nonStatic()
	{
		System.out.println(n);
		callStatic();
	}
	
	public static void callStatic()
	{
		//System.out.println(m);
		Callnonstatic nnn=new Callnonstatic();
		//nnn.nonStatic();
		
		System.out.println(nnn.m);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Callnonstatic nn=new Callnonstatic();
		nn.nonStatic();
		callStatic();
	}

}
