package Collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class example5_LinkedHashset 
{
	public static void main(String[] args)
	{
		LinkedHashSet lhs=new LinkedHashSet();
		
		lhs.add("rahul");
		lhs.add(101);
		lhs.add(65.5f);
		lhs.add('A');
		lhs.add('A');
		lhs.add(null);
		lhs.add(null);
		System.out.println(lhs);
		System.out.println(lhs.size());
		System.out.println(lhs.isEmpty());
		lhs.remove(lhs);
		System.out.println(lhs);
		System.out.println("---print data using Iterator---");
		Iterator itr = lhs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("---print dada using for each loop---");
		for(Object s1:lhs)
		{
			System.out.println(s1);
		}
		System.out.println("--------");
		lhs.clear();
		{
			System.out.println(lhs.size());
		}
		
	}

}
