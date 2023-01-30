package week4.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {

	public static void main(String[] args) 
	{
		int[] arr= {3,2,11,4,6,7};
		
		List<Integer> arr1=new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			arr1.add(arr[i]);
		}
		System.out.println("The Array List is: " +arr1);
		Collections.sort(arr1);
		System.out.println("The Second Largest Number in the Array List is: " +arr1.get(arr1.size()-2));
	}

}
