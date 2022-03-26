package interviews;

import org.testng.annotations.Test;

public class InterviewTest extends Base {
	@Test
	public void tc1() {
		System.out.println("Hello from tc1");
	}

	@Test
	static public void tc2() {
		System.out.println("tc2: public static or static public - both are CORRECT");
	}

	@Test
	public void tc2_localVariablesDefaultValuesTest() {
		int intN;
		float floatF;
		char charC;
		String stringS;
		System.out.println("local variables must be initialized before use");
		// System.out.println("intN: " + intN);
		// System.out.println("floatF: " + floatF);
		// System.out.println("charC: " + charC);
		// System.out.println("stringS: " + stringS);

	}

	@Test(description = "case1: numbers are counted and then concatinated, case2: string concatinated and so on")
	public void tc3_stringConcatenationTest() {
		log(10 + 20 + "sqaguru");
		log("sqaguru" + 10 + 20);
	}

	@Test
	public void tc4_stringConcatenationTest2() {
		log(10 * 20 + "sqaguru");
		log("sqaguru" + 10 * 20);
	}

	SqaGuru sqaGuru;

	@Test(description = "Instance object initial default value is always NULL")
	public void tc5_InstanceObject() {

		System.out.println(sqaGuru);
	}

	public static void main(String[] args) {
		System.out.println("hello from non-static main");
	}

	@Test(description = "inheritance super test")
	public void tc6_inheritanceTest() {
		Dog dog = new Dog("breedA");
		Dog dog2 = new Dog("breedB");
		dog.barking();
		log(dog.breed);
		log(dog2.breed);
	}

	@Test
	public void printFibonocciSeriesTest() {
		int num = 20;
		int number1=0;
		int number2=1;
		int fibonocciNumber=number1+number2;
		for(int i=0;i<20;i++) {
			
		}
	}
}
