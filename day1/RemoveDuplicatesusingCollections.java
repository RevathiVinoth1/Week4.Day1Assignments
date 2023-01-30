package week4.day1;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesusingCollections {
	public static void main(String[] args) {
		String text="We learn basics as part of java sessions in java week1";
		String[] split=text.split(" ");
		Set<String> set=new LinkedHashSet<String>();
		for (String output : split) {
			set.add(output);
			
		}
		System.out.println(set);
}
}