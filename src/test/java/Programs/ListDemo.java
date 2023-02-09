package Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		al.add(100);
		al.add(400);
		al.add(500);
		al.add(800);
		al.add(200);
		System.out.println(al);
		
		int n[]= {10, 1, 30, 50, 15, 33, 1, 100};
		
		for(int j=0;j<n.length;j++)
		{
			System.out.print(n[j] + " ");
		}
		
		//System.out.println("Int Array " + Arrays.toString(n));
		
		
		
	ArrayList<Integer> allis=new ArrayList<Integer>();
		
	for(int i:n)
	{
		allis.add(i);
	}
	
	System.out.println(allis);
	
	ArrayList<Integer> al2=Arrays.stream(n)
            .boxed()
            .collect(Collectors.toCollection(ArrayList::new));
	
	System.out.println("Array List" + al2);
	
	LinkedList<Integer> lii=Arrays.stream(n).boxed().collect(Collectors.toCollection(LinkedList::new));
	System.out.println("Linked List" + lii);
	
	LinkedList<Integer> lii1=new LinkedList<Integer>();
	
	for(int k:n)
	{
		lii1.add(k);
	}
	System.out.println("LL For "+lii1);
	}
	
	
	
	
	

}
