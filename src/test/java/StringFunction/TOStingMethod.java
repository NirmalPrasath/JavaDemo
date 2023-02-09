package StringFunction;

public class TOStingMethod {
	
	int id;
	String name;
	
	public TOStingMethod(int id, String name)
	{
		this.id=id;
		this.name=name;
	}
	
	public String toString() {
		return id + " " + name;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TOStingMethod r1=new TOStingMethod(100, "Nir");
		System.out.println(r1);

	}

}
