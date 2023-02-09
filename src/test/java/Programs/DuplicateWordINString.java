package Programs;

import java.util.HashMap;
import java.util.Map;

public class DuplicateWordINString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Selenium Java Selenium Test Interview Java";
		
		String a[]=s.split("\\s");
		Map<String, Integer> map=new HashMap<String, Integer>();
		
		for(String sa:a)
		{
			if(!map.containsKey(sa))
			{
				map.put(sa,1);
			}
			else
			{
				map.put(sa, map.get(sa)+1);
			}
		}
		
		for(Map.Entry<String, Integer> entry:map.entrySet())
		{
			if(entry.getValue()>1)
			{
			System.out.println("Keys = " + entry.getKey() + " Count = " + entry.getValue());
			}
		}

	}

}
