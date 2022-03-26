package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test11 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();

		int i = 0;

		list.add("Test1");

		list.add("Test2");

		for (String s : list) {
			list.add("Test" + i);
			i++;
			System.out.println(list);
		}

	}
}
