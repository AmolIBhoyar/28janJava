package Collection;

import java.util.ArrayList;
import java.util.HashSet;

public class example4_Hashset2 
{
	public static void main(String[] args)
	{
		ArrayList a1=new ArrayList();
		a1.add("rahul");
		a1.add(101);
		a1.add(65.5f);
		a1.add('A');
		a1.add(101);
		a1.add(101);
		a1.add(null);
		a1.add(null);
		System.out.println(a1);
		HashSet hs=new HashSet(a1);
		System.out.println(hs);
		
	}

}
