package mock;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class sample55 
{
	public static void main(String[] args)
	{
		LinkedList l1=new LinkedList();
		l1.add("amola");
		l1.add(101);
		l1.add("null");
		l1.add("null");
		l1.set(2, 500);
		System.out.println(l1);
		System.out.println(l1.size());
		System.out.println("---print by iterator method---");
		Iterator ltr = l1.iterator();
		while(ltr.hasNext())
		System.out.println(ltr.next());
		System.out.println("---------");
		ListIterator itr = l1.listIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("----------");
		for(int i=0;i<=l1.size()-1;i++)
		{
			System.out.println(l1.get(i));
		}
		
		
		
	}

}
