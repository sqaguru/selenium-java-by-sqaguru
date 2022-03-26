package test;

import java.util.Arrays;
import java.util.List;

public class Test5 {
	public static void main(String[] args) {
		List<String> s1=Arrays.asList("One","Two","Three","Four");
		
		s1.add("Five");
		System.out.println(s1);
	}
}
