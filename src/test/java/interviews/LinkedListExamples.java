package interviews;

public class LinkedListExamples {
	Node head; // head of list

	/* method to create a simple linked list with 3 nodes */
	public static void main(String[] args) {
		/* Start with the empty list. */
		LinkedListExamples list = new LinkedListExamples();

		list.head = new Node(100);
		Node second = new Node(200);
		Node third = new Node(300);

		list.head.next = second; // Link first node with the second node
		second.next = third; // Link first node with the second node
		list.display();
	}

	/* This function prints contents of the linked list starting from head */
	public void display() {
		Node n = head;
		while (n != null) {
			System.out.print(n.data + " \n");
			n = n.next;
		}
	}
}
