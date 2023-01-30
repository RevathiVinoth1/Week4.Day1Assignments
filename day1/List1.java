package week4.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class List1 
{
	public static void main(String[] args) 
	{
		String[] str= {"Adam","Ben","Zara","Adam", "Charlie", "James", "Ben"};
		List<String>lst = new ArrayList<String>();
		for (int i = 0; i < str.length; i++) 
		{
	         lst.add(str[i]);
	         Collections.sort(lst);
	    }
		System.out.println("The Duplicates in the List Are:" );
	    for (int j = 0; j < str.length-1; j++) 
	    {
	         if (lst.get(j)==lst.get(j+1))
	         {
	            System.out.println(lst.get(j));
	                
	         }
	            
	    }
	    
	}
}
