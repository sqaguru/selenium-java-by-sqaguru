package interviews.reversestringbysqaguru;

public class MyLinkedLinkTest {

	public static void main(String[] args) {
		MyLinkedList list = new MyLinkedList();

		list.addNode(1);
		list.addNode(2);
		list.addNode(3);

		list.displayList();

		list.reverseList(list.head);
	}

}
