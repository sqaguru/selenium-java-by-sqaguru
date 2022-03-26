package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test12 {
	public static void main(String[] args) {
		int dailywage = 4;
		int number_of_days = 5;
		int salary = number_of_days++ * --dailywage * dailywage++ * number_of_days--;
		salary = -dailywage;
		System.out.println(dailywage);
		System.out.println(number_of_days);
		System.out.println(salary);
	}
}
