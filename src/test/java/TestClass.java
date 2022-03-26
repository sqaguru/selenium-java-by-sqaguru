import java.util.HashMap;
import java.util.Map;

public class TestClass {
	public static void main(String args[]) {
		/*
		 * final String str1 = "social"; final String str2 = "media"; String string3 =
		 * str1 + str2; System.out.println();
		 */

		Map<Integer, String> map = new HashMap<Integer, String>();

		map.put(null, null);

		System.out.println(map.get(null));

	}
}
