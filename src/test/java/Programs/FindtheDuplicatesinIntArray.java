package Programs;

public class FindtheDuplicatesinIntArray {

	public static void main(String[] args) {
		int n[]= {10, 3, 22, 10, 20,22};
		
		String s[]= {"Nirmal", "Java", "Ball", "Nirmal"};
		
	for(int i=0;i<n.length;i++)
	{
		for(int j=i+1;j<n.length;j++)
		{
			if(n[i]==n[j])
			{
				System.out.println("Duplicate =" + n[i]);
			}
			
			
		}
	}
	
	for(int i=0;i<s.length;i++)
	{
		for(int j=i+1;j<s.length;j++)
		{
			if(s[i].equals(s[j]))
			{
				System.out.println("Duplicate =" + s[i]);
			}
			
			
		}
	}
	}

}
