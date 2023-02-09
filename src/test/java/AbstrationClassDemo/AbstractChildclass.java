package AbstrationClassDemo;

public class AbstractChildclass extends AbstrationDemp1{
	


	public static void main(String[] args) {
		AbstrationDemp1 p=new AbstractChildclass();
		
		AbstractChildclass p2=new AbstractChildclass();
		p.m1();
		p.m2();
		p2.m3();
		
		
	}

	@Override
	public void m1() {
		System.out.println("OveRIDE pAREN Abstraction class");
		
	}
	
	public void m3()
	{
		System.out.println("M3");
	}

	@Override
	public void m4() {
		// TODO Auto-generated method stub
		
	}

}
