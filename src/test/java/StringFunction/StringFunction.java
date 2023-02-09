package StringFunction;

public class StringFunction {
	
	public static void main(String[] args)
	{
		String s1="Nirmal";
		String s2="Prasath";
		
		String s3="Nirmal";
		
		System.out.println(s1.concat(s2));
		
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.contains(s2));
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		
		System.out.println(s2.length());
		
		System.out.println(s2.startsWith("Nir"));
		System.out.println(s3.endsWith("mal"));
		
		System.out.println(s1.toLowerCase());
		System.out.println(s2.toUpperCase());
		
		System.out.println(s2.indexOf('a'));
		System.out.println(s2.lastIndexOf('a'));
		
		
		String m="Nirmal Prasath Selenium";
		
		//Split
		String a[]= m.split("\\s");
		for(String aa:a)
		{
			System.out.println(aa);
			
			if(aa.equals("Selenium"))
			{
				System.out.println(aa);
			}
		}
		
		//toCharArray
		
		String dd="Iam win soon";
		char[] ch=dd.toCharArray();
		
		for(char chh: ch)
		{
			System.out.println(chh);
		}
		
		for(int i=0;i<ch.length;i++)
		{
			System.out.println(ch[i]);
		}
		
		
		
		//valueOf
		int value=30;  
		String sv=String.valueOf(value);  
		System.out.println(sv+10);//concatenating string with 10  
		
		
		String str = new String("hello javatpoint how r u");  
	      char[] ch1 = new char[10];  
	      try{  
	         str.getChars(6, 16, ch1,0);  
	         System.out.println(ch1);  
	      }catch(Exception ex){System.out.println(ex);}  
	
		
		
		byte[]b=str.getBytes();
		
		for(byte nn: b)
		{
			System.out.println(nn);
		}
		
		
		
		
	}

}
