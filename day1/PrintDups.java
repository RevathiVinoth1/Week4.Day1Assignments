package week4.day1;

import java.util.Set;
import java.util.TreeSet;

public class PrintDups {

	public static void main(String[] args) {
		int[] num= {14,12,13,11,15,14,18,16,17,19,18,17,20};
		Set<Integer> numset=new TreeSet<Integer>();
		Set<Integer> print=new TreeSet<Integer>();
		for (Integer output : num) {
			if(!numset.add(output)) {
				print.add(output);
			}
		}
		System.out.println("The Duplicates are: "+print);		
	}

}
