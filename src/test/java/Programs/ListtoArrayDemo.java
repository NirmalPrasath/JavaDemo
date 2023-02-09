package Programs;

import java.util.ArrayList;
import java.util.Arrays;

import org.testng.annotations.Test;

public class ListtoArrayDemo {
	
@Test
	public void listtoArray()
	{
ArrayList<Integer> alist41=new ArrayList<>();
		
		alist41.add(1000);
		alist41.add(5000);
		alist41.add(15000);
		
		System.out.println(alist41.size());
	Object[] obj=alist41.toArray();
	
	//System.out.println("List to Obj Array : "+ Arrays.toString(obj));
	
	 for(Object b:obj)
		{
			System.out.println("List to Obj Array using for loop : "+b);
		}
	
	
	 Integer[] arr = new Integer[alist41.size()];
     arr = alist41.toArray(arr);
     
     System.out.println("List to Array arr fff : "+Arrays.toString(arr));
     
     Integer[] arr1 = new Integer[alist41.size()];
    
    
    for(int i=0;i<arr1.length;i++)
     {
    	 arr1[i]=alist41.get(i);
     }
     
    System.out.println("List to Array using for loop : "+Arrays.toString(arr1));
    
    int kk[]= {2,5,6};
    System.out.println(Arrays.toString(kk));
     
     
	}

@Test
public void stringArrayListtoStringArray()
{
	ArrayList<String> al=new ArrayList<String>();
	
	al.add("Ten");
	al.add("Five");
	al.add("Ten");
	
	String[]s=new String[al.size()];
	for(int i=0;i<s.length;i++)
	{
		s[i]=al.get(i);
	}
	System.out.println(Arrays.toString(s));
	
	
}

}
