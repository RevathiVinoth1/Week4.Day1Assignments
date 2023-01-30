package week4.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseInList 
{
	public static void main(String[] args) {
		//String[] str= {"Red","Green","Blue","Yellow","Brown"};
		//System.out.print("The Colours Names Are:" +str);
		List<String>rev=Arrays.asList("Red","Green","Blue","Yellow","Brown");
		System.out.println("The Colours Names Are: " +rev);
		Collections.reverse(rev);
		System.out.print("The Colours Names Are in Reverse: " +rev);
	}
	

}
