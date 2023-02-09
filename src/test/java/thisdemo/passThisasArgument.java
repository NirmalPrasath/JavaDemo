package thisdemo;

public class passThisasArgument {
	
	void m(passThisasArgument pp){  
		  System.out.println("method is invoked");  
		  }  
		  void p(){  
		  m(this);  
		  }  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		passThisasArgument  s1 = new passThisasArgument();  
		s1.p();  
	}

}
