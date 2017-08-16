package chapter2_LinkedLists;

import java.util.LinkedList;
import java.util.Iterator;

public class Problem1 {
	
	public static LinkedList makeUniqueNodes(LinkedList<Integer> ll)
	{
		Iterator<Integer> i = ll.iterator();
		Iterator<Integer> j = i;
		while(i.hasNext())
		{
			j = i;
			j.next();
			while(j.hasNext())
			{
				
			}
		}
		
		return ll;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
