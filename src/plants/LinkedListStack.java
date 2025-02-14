package plants;

class Node {
	Plant plant;
	Node next;

	public Node(Plant plant) {
		this.plant = plant;
		this.next = null;
	}
}

public class LinkedListStack {
	private Node top;

	public LinkedListStack() {
		this.top = null;
	}

	public void push(Plant plant) {
		Node newNode = new Node(plant);
		newNode.next = top;
		top = newNode;
	}

	public Plant pop() {
		if (isEmpty()) {
			System.out.println("Stack is empty");
			return null;
		}
		Plant poppedPlant = top.plant;
		top = top.next;
		return poppedPlant;
	}

	public Plant peek() {
		if (isEmpty()) {
			System.out.println("Stack is empty");
			return null;
		}
		return top.plant;
	}

	public boolean isEmpty() {
		return top == null;
	}

	public void displayStack() {
		Node current = top;
		while (current != null) {
			System.out.println(current.plant);
			current = current.next;
		}
	}
}