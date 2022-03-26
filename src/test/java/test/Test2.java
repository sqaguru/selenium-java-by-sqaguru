package test;

public class Test2 {
	boolean[] array = new boolean[3];

	int count = 0;

	void set(boolean[] arr, int x) {
		arr[x] = true;
		count++;
	}

	void fun() {
		if (array[0] && array[++count - 2] | array[count - 1]) {
			count++;
			System.out.println("count=" +count);
		}
	}

	public static void main(String[] args) {
		Test2 object = new Test2();
		object.set(object.array, 0);
		object.set(object.array, 1);
		object.fun();
	}
}
