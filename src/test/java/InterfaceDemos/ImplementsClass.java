package InterfaceDemos;

import org.openxmlformats.schemas.spreadsheetml.x2006.main.STSortBy;

public class ImplementsClass implements MultipleInterface1  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MultipleInterface1 mm=new ImplementsClass();
		
		mm.m3q();
		
		int kkk=MultipleInterface1.m2(10);
		System.out.println("M2=" + kkk);
		
	mm.m1();
	
	MultipleInterface1.bbb();

	}

	@Override
	public void m1() {
		System.out.println("Provide Implementation for Interface method");
		
	}
	
	

}
