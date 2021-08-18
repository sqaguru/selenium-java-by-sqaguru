package sqaguru.need.to.work;

import java.util.function.Function;

public class FunctionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Function<String, String> myFunction = new Function<String, String>() {

			public String apply(String inputString) {
				System.out.println("inputString: " + inputString);

				return "Hello from apply()";
			}
		};

		String myNewString = myFunction.apply("Hello to apply()");

		System.out.println("myNewString: " + myNewString);
	}

}
