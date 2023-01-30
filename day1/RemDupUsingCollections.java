package week4.day1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class RemDupUsingCollections {
	public static void main(String[] args) 
	{
	String str="We learn java basics as part of java sessions in java week1";
	//int count=0;
	//String temp="";
	String[] str1=str.split(" ");
	Set<String> set=new LinkedHashSet<String>();
	for (int i = 0; i < str1.length; i++) 
	{
		if(!set.add(str1[i]))
		{
		set.remove(str1[i]);
		//temp=str1[i];
		//count++;
		}
	}
	//if(count>1) 
	//{
	System.out.println(set);
    //}
	}
}
	