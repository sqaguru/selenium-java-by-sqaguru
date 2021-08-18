package sqaguru.java.basics.tests;

public class VariablesTypes {

	public static void main(String[] args) {
		String studentName="Santosh";
		int studentId=20;
		char studentKey='s';
		float average=2.3f;
		boolean hasPassed=true;
		System.out.println("studentName: "+studentName);
		System.out.println("studentKey: "+studentKey);
		System.out.println("average: "+average);
		System.out.println("studentId: "+studentId);
		System.out.println("hasPassed: "+hasPassed);
		
		//conversion of variables
		
		int intAverage=(int)average;
		System.out.println("average: "+intAverage);

	}

}
