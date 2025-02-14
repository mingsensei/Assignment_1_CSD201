/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package plants;

/**
 *
 * @author macos
 */
public class LinkedList {
    class Node {
    Plant data;
    Node next;

    public Node(Plant data) {
        this.data = data;
        this.next = null;
    }
}
    private Node head;
    private int size;

    public LinkedList() {
        this.head = null;
        this.size = 0;
    }

    public void insertLast(Plant plant) {
        Node newNode = new Node(plant);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        size++;
    }

    public void insertHead(Plant plant) {
        Node newNode = new Node(plant);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void addAtIndex(int index, Plant plant) {
        if (index < 0 || index > size) {
            System.out.println("Invalid index");
            return;
        }

        if (index == 0) {
            insertHead(plant);
            return;
        }

        Node newNode = new Node(plant);
        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        size++;
    }

    public void deleteHead() {
        if (head != null) {
            head = head.next;
            size--;
        }
    }

    public void deleteTail() {
        if (head == null) return;

        if (head.next == null) {
            head = null;
        } else {
            Node temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
        }
        size--;
    }

    public void displayList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public void printBySemiMajor() {
        head = mergeSort(head);
        displayList();
    }

    private Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node middle = getMiddle(head);
        Node nextOfMiddle = middle.next;
        middle.next = null;

        Node left = mergeSort(head);
        Node right = mergeSort(nextOfMiddle);

        return sortedMerge(left, right);
    }

    private Node getMiddle(Node head) {
        if (head == null) return head;
        Node slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private Node sortedMerge(Node left, Node right) {
        if (left == null) return right;
        if (right == null) return left;

        Node result;
        if (left.data.getSemiMajorAxis()<= right.data.getSemiMajorAxis()) {
            result = left;
            result.next = sortedMerge(left.next, right);
    } else {
            result = right;
            result.next = sortedMerge(left, right.next);
        }
        return result;
    }
}

