package sqaguru.java.basics.tests;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.testng.annotations.Test;

public class CollectionsTest {
	@Test
	public void arrayAsListTest() {
		System.out.println("ArrayList");
		String[] names = { "Rama", "Shyam", "Raja" };
		List<String> namesCollections = Arrays.asList(names);
		System.out.println(namesCollections.get(0));
		System.out.println(namesCollections.get(1));
		System.out.println(namesCollections.get(2));
	}

	@Test
	public void printMaxLengthWordOfAnArray() {
		String[] subjects = { "Math", "Science", "English", "Politics", "Hindi" };
		Set set=new TreeSet();
		for(String subject:subjects) {
			set.add(subject);
		}
		System.out.println(Collections.max(set));
		System.out.println(Collections.min(set));
	}
	
	@Test
	public void printIntArrayTest() {
		
		double d=100.04;
		
		int[] arr=new int[] {1,2,3};
		System.out.println(arr[1]);
		System.out.println("length: "+arr.length);
		
		int[] arr2= {};
		System.out.println("arr2.size() "+arr2.length);
	}
	
	
}
