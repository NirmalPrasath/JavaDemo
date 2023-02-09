package Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import org.testng.annotations.Test;

import net.bytebuddy.dynamic.scaffold.MethodGraph.Linked;

public class ListDemo2 {
	
	@Test(enabled=true)
	public void ArraytoList()
	{
	String[] s= {"Nir", "Pra", "Rohi", "Aku"};
	
	ArrayList<String> al=new ArrayList<String>();
	
	for(String ss:s)
	{
		al.add(ss);
	}
	System.out.println(al);
	ArrayList<String> al1=new ArrayList<String> (Arrays.asList(s));
	
	LinkedList<String> ll=new LinkedList<String>(Arrays.asList(s));
	
	System.out.println("Array List using Arrays.asList()"+al1);
	
	System.out.println("Linked List using Arrays.asList()"+ll);
	
	List<String> kl=Arrays.asList(s);
	System.out.println("List<String> using Arrays.asList()"+kl);
	}
	
	
	@Test
	public void ArrayListtoLL()
	{
		ArrayList<Integer> alist=new ArrayList<>();
		
		alist.add(300);
		alist.add(500);
		alist.add(100);
		
		LinkedList<Integer> llist=new LinkedList<>(alist);
		
		System.out.println(llist);
		
		ArrayList<Integer> alist2=new ArrayList<>(llist);
		
		System.out.println(alist2);
	}
	
	
	@Test
	public void settoList()
	{
	Set<String> set1=new HashSet<String>();
	
	set1.add("Nir");
	set1.add("Pra");
	set1.add("Rohith");
	set1.add("Raj");
	
	ArrayList<String> alist3=new ArrayList<String>(set1);
	System.out.println(alist3);
	
	
	LinkedList<String> llist3=new LinkedList<String>(set1);
	System.out.println(llist3);
	}
	
	@Test
	public void ListtoSet()
	{
		
ArrayList<Integer> alist4=new ArrayList<>();
		
		alist4.add(1000);
		alist4.add(5000);
		alist4.add(15000);
		
		Set<Integer> set2=new HashSet<Integer>(alist4);
		
		System.out.println(set2);
	}
	
	@Test(description="List to Array")
	public void listtoArray()
	{
ArrayList<Integer> alist41=new ArrayList<>();
		
		alist41.add(1000);
		alist41.add(5000);
		alist41.add(15000);
		
		
	Object[] obj=alist41.toArray();
	
	System.out.println("List to Array : "+ Arrays.toString(obj));
	
	for(Object b:obj)
	{
		System.out.println("List to Array using for loop : "+b);
	}
	}
	
	@Test
	public void arrayToSet()
	{
		String[] str= {"Mon", "Tue","Web", "Sun" };
		
		System.out.println(Arrays.toString(str));
		
		for(String st:str)
		{
			System.out.println(st);
		}
		
		for(int i=0;i<str.length;i++)
		{
			System.out.println(str[i] + " ");
		}
		
		Set<String> setStr=new HashSet<String>(Arrays.asList(str));
		
		System.out.println("Set "+setStr);
		
Set<String> setStr1=new HashSet<String>();
for(String sss:str)
{
		setStr1.add(sss);
}	
System.out.println("Set String For "+setStr1);
		int[] a= {22, 55, 44, 11, 99 };
		
		Set<Integer> setInt=Arrays.stream(a).boxed().collect(Collectors.toSet());
		System.out.println("Set "+setInt);
		
		List<Integer> arraInt=Arrays.stream(a).boxed().collect(Collectors.toList());
		System.out.println("Array1  "+arraInt);
		
		ArrayList<Integer> arraInt2=Arrays.stream(a).boxed().collect(Collectors.toCollection(ArrayList::new));
		System.out.println("Array2  "+arraInt2);
		
		ArrayList<Integer> arraInt3=(ArrayList<Integer>) Arrays.stream(a).boxed().collect(Collectors.toList());
		System.out.println("Array3  "+arraInt3);
		
		Set<Integer> setInt1=new HashSet<>();
		
		for(Integer j:a)
		{
			setInt1.add(j);
		}
		System.out.println("Set using fot" + setInt1);
		
		HashSet<String> hasSet=new HashSet<String>(Arrays.asList(str));
		System.out.println(hasSet);
		
		HashSet<Integer> hashSetInt=Arrays.stream(a).boxed().collect(Collectors.toCollection(HashSet::new));
		System.out.println("Set "+hashSetInt);
	}
}
