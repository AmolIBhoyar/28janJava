package Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class example3_LinkList
{
	public static void main(String[] args) 
	{
		LinkedList l1=new LinkedList();
		l1.add("mahesh");
		l1.add(105);
		l1.add(75.5f);
		l1.add('B');
		l1.add("mahesh");
		l1.add("null");
		l1.add("null");
		System.out.println(l1);
		System.out.println(l1.size());
		System.out.println(l1.isEmpty());
		System.out.println(l1.get(1));
		
		//update or modify
		l1.set(5, "kalpesh");
		System.out.println(l1);
		
		//add info in between linkedlist
		l1.add(4, "abc");
		System.out.println(l1);
		
		//remove info in between linkedlist
		l1.remove(4);
		System.out.println(l1);
		
		System.out.println("---print data using iterator");
		Iterator itr = l1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("---print data using listitertor");
		ListIterator ltr = l1.listIterator();
		while(ltr.hasNext())
		{
			System.out.println(ltr.next());
		}
		System.out.println("---print data using for loop");
		for(int i=0;i<=l1.size()-1;i++)
		{
			System.out.println(l1.get(i));
		}
			System.out.println("---print data using for each loop---");
			for(Object s:l1)
			{
				System.out.println(s);
			}
			l1.clear();
			System.out.println(l1.size());
		
	}

}
