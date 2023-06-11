package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class example4_HashSet1 
{
	public static void main(String[] args)
	{
		HashSet hs=new HashSet();
		hs.add("rahul");
		hs.add(101);
		hs.add(65.5f);
		hs.add('A');
		hs.add(null);
		hs.add(null);
		System.out.println(hs);
		System.out.println(hs.size());
		System.out.println(hs.isEmpty());
		hs.remove(101);
		System.out.println(hs);
		System.out.println("---print data using iterator cursor---");
		Iterator itr = hs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("---print data using for each loop---");
		for(Object s1:hs)
		{
			System.out.println(s1);
		}
		System.out.println("---------");
		hs.clear();
		System.out.println(hs.size());
		
	}

}
