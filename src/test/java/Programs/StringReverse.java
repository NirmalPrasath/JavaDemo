package Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Selenium Automation";
		
		char ch[]=s.toCharArray();
		
		for(int i=ch.length-1;i>=0;i--)
		{
			System.out.print(ch[i]);
		}
		
		String aa[]=s.split("\\s");
		
		for(int i=aa.length-1;i>=0;i--)
		{
			System.out.println(aa[i]);
		}
		
		StringBuffer sb=new StringBuffer(s);
		
		System.out.println(sb.reverse());
		
		
		List<String> st=new ArrayList<String>(Arrays.asList(aa));
		Collections.reverse(st);
		System.out.println(st);

	}

}
