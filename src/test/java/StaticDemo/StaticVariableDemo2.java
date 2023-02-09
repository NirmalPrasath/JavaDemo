package StaticDemo;

public class StaticVariableDemo2 {
	
	
	int n=100;
	static String s="One";
	int count =0;
	 int a=40;//non static  
	static int cube(int x){  
		  return x*x*x;  
		  }  
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticVariableDemo2 t1=new StaticVariableDemo2();
		t1.n=999;
		t1.s="Ten";
		
		StaticVariableDemo2 t2=new StaticVariableDemo2();
		t2.n=666;
		t2.s="SIX";	
		
		System.out.println(t2.n+" "+t2.s );
		
		//666 SIX
		
		int result=t1.cube(5);  
		  System.out.println(result);  
		  
		  //System.out.println(a);
				
		}

}
