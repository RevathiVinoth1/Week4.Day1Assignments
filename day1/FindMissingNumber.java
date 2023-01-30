package week4.day1;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class FindMissingNumber {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,7,6,8};
		Set<Integer> set=new TreeSet<Integer>();
		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}
			System.out.println("The Numbers in Set are: " +set);
			Set<Integer> set2=new LinkedHashSet<Integer>();
			for (int i = 0; i < arr.length; i++) {
				if(!set.contains(i))
				{
					set2.add(i);
			}
			
		}
				System.out.println("The Missing Numbers in Set are: " +set2);
	}

}
