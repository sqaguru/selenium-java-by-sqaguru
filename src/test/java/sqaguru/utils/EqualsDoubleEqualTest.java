package sqaguru.utils;

import org.testng.annotations.Test;

/*@Created By sqaguru*/
public class EqualsDoubleEqualTest {
	@Test
	public void equalsDoubleEqualsTest() {
		String s1 = "hello";// s1 = address1 - memory1
		String s2 = "hello";// s2 = address2 - memory1

		System.out.println(s1 == s2);// true - same memory
		System.out.println(s1.equals(s2));// true - same content

		String o1 = new String("welcome");// memory1
		String o2 = new String("welcome");// memory2

		System.out.println(o1 == o2);// false - different memories
		System.out.println(o1.equals(o2));// true - same content
	}
}
