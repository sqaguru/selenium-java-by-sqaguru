package sqaguru.java.collections.tests;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

public class CollectionTest {
	@Test
	public void ArrayTest() {
		int[] numbers = { 1, 2, 3, 4, 5 };
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		System.out.println(numbers[3]);
		System.out.println(numbers[4]);
		numbers[4] = 55;
		System.out.println(numbers[4]);
		System.out.println("length of numbers integer array: " + numbers.length);

		int[] numbers2 = { 1, 2, 3, 4, 55 };
		if (numbers == numbers) {
			System.out.println("numbers & numbers2 match");
		} else {
			System.out.println("numbers & numbers2 do not match");
		}

		numbers[5] = 20;// error - size is fixed for an array
		System.out.println(numbers[5]);
	}

	@Test
	public void ListTest() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		System.out.println(list.get(4));
		
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(1);
		list2.add(2);
		list2.add(3);
		list2.add(4);
		list2.add(5);
		if (list == list2) {
			System.out.println("list & list2 match");
		} else {
			System.out.println("list & list2 do not match");
		}
		
		list.add(6);// size can be extended anytime
		System.out.println(list.get(5));
		list.add(5, 55);

		System.out.println("size of list elements" + list.size());// count of elements

		list.clear();// no method exists as such clear
	}
}
