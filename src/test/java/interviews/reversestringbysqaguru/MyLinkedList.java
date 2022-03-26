package interviews.reversestringbysqaguru;

public class MyLinkedList {
	Node head = null;
	Node tail = null;

	public void addNode(int data) {
		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
	}

	public void displayList() {
		Node currentNode = head;
		if (head == null) {
			System.out.println("list is empty");
		} else {
			while (currentNode != null) {
				System.out.println(currentNode.data);
				currentNode = currentNode.next;
			}
		}
	}

	public void reverseList(Node current) {
		if (head == null) {
			System.out.println("list is empty");
			return;
		}

		reverseList(current.next);
		System.out.println(current.data);

	}
}
