package Programs;

public class RemoveChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="Selenium & Java";
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(!(s.charAt(i)=='&'))
			{
				System.out.print(s.charAt(i));
			}
			
			if(s.charAt(i)=='e')
			{
			count++;
			}
		}
		System.out.println("e Count = " +count);
		
		String ar[]=s.split("\\s");
		
		for(String a:ar)
		{
			System.out.print(a);
		}
		
		System.out.println("\n" +s.replace("&", ""));
		
		for(int i=0;i<s.length();i++)
		{
			if(i%2!=0)
			{
				System.out.println(s.charAt(i));
			}
		}
		
		System.out.println("Last Char =" + s.charAt(s.length()-1));
		
		System.out.println("First Char =" + s.charAt(0));
	}

}
