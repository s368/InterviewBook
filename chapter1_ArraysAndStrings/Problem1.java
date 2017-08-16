package chapter1_ArraysAndStrings;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Arrays;;

public class Problem1 {
	
	public static boolean uniqueCharsString(String s)
	{
		HashMap<Character,Boolean> hm = new HashMap<Character,Boolean>();
		
		for(Character c : s.toCharArray())
		{
			if(hm.get(c) == null)
				hm.put(c, true);
			else
				return false;
		}
		
		return true;
	}

	public static boolean uniqueCharsStringDirect(String s)
	{
		for(int i = 0;i<s.length();i++)
		{
			for(int j = i+1;j<s.length();j++)
			{
				if(s.charAt(i) == s.charAt(j))
					return false;
			}
		}
		
		return true;
	}
	
	public static boolean uniqueCharsStringSort(String s)
	{
		char[] ca = s.toCharArray();
		Arrays.sort(ca);
		
		for(int i = 0;i<ca.length - 1;i++)
		{
			if(ca[i] == ca[i+1])
				return false;
		}
		
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean result;
		
		result = uniqueCharsString("anekdotanekdot");
		System.out.println("uniqueCharsString: " + result);;

		result = uniqueCharsStringDirect("anekdot");
		System.out.println("uniqueCharsStringDirect: " + result);;

		result = uniqueCharsStringSort("anekdotanekdot");
		System.out.println("uniqueCharsStringSort: " + result);;
}

}
