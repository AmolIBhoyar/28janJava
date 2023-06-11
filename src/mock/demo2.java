package mock;

import java.util.Iterator;
import java.util.Vector;

public class demo2 
{
	public static void main(String[] args)
	{
		Vector s=new Vector();
		s.add("basha");
		s.add("balya");
		s.add("null");
		s.set(2, "bandya");
		System.out.println(s);
		System.out.println("------");
		Iterator itr = s.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("size :"+s.size());
		
	}

}
