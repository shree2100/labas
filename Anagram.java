package April13_inner;

import java.util.Arrays;

//anagram  str - race  Str2 --care
public class Anagram {

	void checkAnagram(String a,String b)
	{// string class has toLowercase and to Uppercase builtin method 
		a=a.toLowerCase();
		b=b.toLowerCase();
		//here we will compare string length if is it not same means not anagram 
		if(a.length()==b.length())
		{
			//toCharArray -predefined method of String class to convert string to array 
			char c1[]= a.toCharArray();
			char c2[]= b.toCharArray();
			
			//sort is predefined method  in java.util.Arrays class 
			Arrays.sort(c1);
			Arrays.sort(c2);
			//equals will return either true or false 
			boolean result= Arrays.equals(c1, c2);
			
			if(result)
				System.out.println("strings are anagram");
			else
				System.out.println("Strings not anagram");
		}
		else
		{
			System.out.println("strings are not anagram different length");
		}
	}
	public static void main(String[] args) 
	{
		String x="eaee";
		String y="Care";
		Anagram  e= new Anagram();
		e.checkAnagram(x, y);

	}

}
