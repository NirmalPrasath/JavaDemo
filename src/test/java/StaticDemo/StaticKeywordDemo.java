package StaticDemo;

public class StaticKeywordDemo {
	
	int id;
	String name;
	static String collegeName="NNS";
	
	
	public void display(int id, String name)
	{
		System.out.println(id + " " + name + " " + collegeName );
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticKeywordDemo stu=new StaticKeywordDemo();
		stu.display(101, "Nir");
		StaticKeywordDemo stu1=new StaticKeywordDemo();
		stu1.display(102, "Wood");
	}

	

}
