package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class examle1_ArrayList 
{
	public static void main(String[] args)
	{
		ArrayList a1=new ArrayList(8);
		 a1.add("rahul");
		 a1.add(101);
		 a1.add(65.5f);
		 a1.add('A');
		 a1.add(101);
		 a1.add(null);
		 a1.add(null);
		 
		 System.out.println(a1);
		 System.out.println(a1.size());   //7
		 System.out.println(a1.isEmpty());  //false
		 System.out.println(a1.get(0));   //rahul
		 
		 //add info in between arraylist-->right shift operation
		 a1.add(4, 500);
		 System.out.println(a1);
		 //remove info in between arraylist-->left shift operation
		 a1.remove(4);
		 System.out.println(a1);
		 
		 System.out.println("----Print data using Iterator cursor----");
		 Iterator itr = a1.iterator();
		 while(itr.hasNext())   //true
		 {
			System.out.println(itr.next()); 
		 }
		 System.out.println("----Print data using ListItrator cursor----");
		 ListIterator litr = a1.listIterator();
		 while(litr.hasNext())
		 {
			 System.out.println(litr.next());
		 }
		 System.out.println("----Print  data using for loop----");
		 for(int i=0;i<=a1.size()-1;i++)
		 {
			 System.out.println(a1.get(i));
		 }
		 System.out.println("----print data using for each loop----");
		 for(Object s1:a1)
		 {
			 System.out.println(s1);
		 }
		 

	}

}
