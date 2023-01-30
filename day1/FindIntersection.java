package week4.day1;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
		int[] arr1= {3,2,11,4,6,7};
		int[] arr2= {1,2,8,4,9,7};
		
		List<Integer>arr1List=new ArrayList<Integer>();
		for(int i=0;i<arr1.length;i++) {
			arr1List.add(arr1[i]);
		}
		System.out.println("The Common Numbers are Presenting in Both Arrays are: " );
		List<Integer>arr2List=new ArrayList<Integer>();
		for(int i=0;i<arr2.length;i++) {
			arr2List.add(arr2[i]);
			if(arr1List.get(i).equals(arr2List.get(i))) {
				System.out.println(arr1List.get(i));
				}
			}
	}

}
