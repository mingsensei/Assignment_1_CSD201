package plants;


class Node {
    Plant plant;
    Node next;

    public Node(Plant plant) {
        this.plant = plant;
        this.next = null;
    }
}

public class Stack {
    private Node top; 

    public Stack() {
        this.top = null;
    }

    public void push(Plant plant) {
        Node newNode = new Node(plant);
        newNode.next = top;
        top = newNode;
    }

    public Plant pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty!!");
            return null;
        }
        Plant removedPlant = top.plant;
        top = top.next;
        return removedPlant;
    }


    public Plant peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return null;
        }
        return top.plant;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return;
        }
        Node current = top;
        while (current != null) {
            System.out.println(current.plant.toString());
            current = current.next;
        }
    }

}
