package Collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class example2_Vector 
{
	public static void main(String[] args)
	{
		Vector v=new Vector();
		v.add("rahul");
		v.add(101);
		v.add(65.5f);
		v.add('A');
		v.add(101);
		v.add("null");
		v.add("null");
		System.out.println(v);
		System.out.println(v.size());
		System.out.println(v.isEmpty());
		System.out.println(v.get(0));
		//add info in between vctor -->right shift operation
		v.add(4, 500);
		System.out.println(v);
		//remove info in between vector -->left shift operation
		v.remove(4);
		System.out.println(v);
		System.out.println("---print data using iterator cursor---");
	    Iterator itr = v.iterator();
	    while(itr.hasNext())
	    {
	    	System.out.println(itr.next());
	    }
		System.out.println("---print data by listiterator---");
		ListIterator ltr = v.listIterator();
		while(ltr.hasNext())
		{
		System.out.println(ltr.next());
		}
		
		System.out.println("---print data using for loop---");
		for(int i=0;i<=v.size()-1;i++)
		{
			System.out.println(v.get(i));
		}
		System.out.println("---print data using for each loop---");
		for(Object s:v)
		{
			System.out.println(s);
		}
		System.out.println("---print data using for enumeration cursor---");
		Enumeration enu = v.elements();
		while(enu.hasMoreElements())
		{
			System.out.println(enu.nextElement());
		}
		System.out.println(v.size());
		v.clear();
		System.out.println(v.size());
	}

}
