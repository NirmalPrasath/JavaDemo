package Programs;

public class NumberRevers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=105;
		
		String s=String.valueOf(n);
		
		char ch[]=s.toCharArray();
		
		for(int i=ch.length-1;i>=0;i--)
		{
			System.out.print(ch[i]);
		}
		
		int num=454;
		int reveres=0;
		int tem=num;
		
		while(num!=0)
		{
			int remainder=num%10;
			
			reveres=reveres*10+remainder;
			
			num=num/10;
		}
		
		//System.out.println(reveres);
		
		if(tem==reveres)
		{
			System.out.println("Palindrom =" + tem);
		}
		else
		{
			System.out.println("Not Palindrom" + tem);
		}

	}

}
