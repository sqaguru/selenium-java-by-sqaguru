package tapaswini;
import java.util.*;


public class ReverseOrder {

	public static void main(String[] args) {
		
		int i;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number and get its decremental order : ");
		int n = s.nextInt();
		System.out.println("Decremental order for entered number is ");
		for(i=n; i>=0 ; i--)
		{
			System.out.println(i);
		}
		

	}

}
