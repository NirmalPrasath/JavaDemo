package Programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import net.bytebuddy.asm.Advice.Enter;

public class DuplicateinStringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Selenium Project Automation";
		
		//s=s.replace(" ", "");
		
		String ss[]=s.split("\\s");
		
		String j="";
	for(String qs:ss)
	{
		System.out.print(qs);
		
		j=j+qs;
		
	}
	System.out.println(j);
		char ch[]=s.toCharArray();
		Map<Character, Integer> map=new HashMap<Character, Integer>();
		
		for(char c:ch)
		{
			if(!map.containsKey(c))
			{
				
				map.put(c, 1);
			}
			else 
			{
				map.put(c, map.get(c)+1);
			}
		}
		
		for(Map.Entry<Character, Integer> m:map.entrySet())
		{
			if(m.getValue()==1)
			{
				System.out.println("Keys= " +m.getKey() + " Count =" + m.getValue());
				
				
			}
			
			//System.out.println("Keys= " +m.getKey() + " Count =" + m.getValue());
		}
		

	}

}
