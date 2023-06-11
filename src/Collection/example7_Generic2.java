package Collection;

import java.util.ArrayList;

public class example7_Generic2
{
	public static void main(String[] args)
	{
		ArrayList<String>a1=new ArrayList<String>();
		a1.add("mahesh");
		a1.add("ramesh");
		a1.add("suresh");
		//a1.add(101);
		for(String s1:a1)
		{
			System.out.println(s1);
		}
		
	}

}
