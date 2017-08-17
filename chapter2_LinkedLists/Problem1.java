package chapter2_LinkedLists;

import java.util.LinkedList;
import java.util.Iterator;
import java.util.List;
import java.util.Collection;
import java.util.Collections;;

public class Problem1 {
	
	public static List<String> makeUniqueNodes(List<String> ll)
	{
		for(int i = 0;i<ll.size();i++)
		{
			for(int j = i+1;j<ll.size();j++)
			{
				if(ll.get(j) == ll.get(i))
					ll.remove(j);
			}
		}
		
		return ll;
	}

	public static List<String> makeUniqueNodesSort(List<String> ll)
	{
		Collections.sort(ll);
		for(int i = 0;i<ll.size();i++)
		{
			while(i+1<ll.size() && ll.get(i) == ll.get(i+1))
					ll.remove(i+1);
		}
		
		return ll;
	}

	public static List makeUniqueNodes_Iterator(List<Integer> ll)
	{
//		Iterator<Integer> i = ll.iterator();
//		Iterator<Integer> j = i;
//		while(i.hasNext())
//		{
//			j = i;
//			j.next();
//			while(j.hasNext())
//			{
//				
//			}
//		}
		
		return ll;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> ll = new LinkedList<String>();
		ll.add("d");
		ll.add("cd");
		ll.add("bcd");
		ll.add("abcd");
		ll.add("abcd");
		
		for(int i = 0;i<ll.size();i++)
		{
			System.out.println(ll.get(i));
		}
		System.out.println("");
		
		for(String s : ll)
		{
			System.out.println(s);
		}
		System.out.println("");
				
		Iterator<String> ii = ll.iterator();
		while(ii.hasNext())
		{
			System.out.println(ii.next());
		}
		System.out.println("");

//		ll = makeUniqueNodesSort(ll);
		ll = makeUniqueNodes(ll);
//		Collections.sort(ll);
		for(int i = 0;i<ll.size();i++)
		{
			System.out.println(ll.get(i));
		}
		System.out.println("");
	}

}
