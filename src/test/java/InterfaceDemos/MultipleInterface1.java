package InterfaceDemos;

public interface MultipleInterface1 {
	
	int n=10;
	public void m1();
	
	public static int m2(int x)
	{
		int nnn=x*x+n;
		return nnn;
	}
	
	default void m3q()
	{
		System.out.println("Defaylt");
	}
	
	static void bbb() {
		
		int nk=9;
		System.out.println("Statuic=" + nk);
	}

}
