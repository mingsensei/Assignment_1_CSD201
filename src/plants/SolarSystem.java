/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package plants;

/**
 *
 * @author macos
 */
public class SolarSystem {
    public class SolarSystemBST {
    public static void main(String[] args) {
        Plant earth = new Plant("Earth",1.000,1.99,1.00,1.00);
        Plant venus = new Plant("Venus",0.949,0.81,0.72,0.62);
        Plant mercury = new Plant("Mercury",0.383,0.06,0.39,0.24);
        Plant mars = new Plant("Mars",0.532,0.11,1.52,1.88);
        Plant saturn = new Plant ("Saturn",9.449,95.16,9.54,29.45);
        Plant uranus = new Plant("Uranus",4.007,14.54,19.19,84.02);
        Plant jupiter = new Plant("Jupiter",11.209,317.83,5.20,11.86);
        Plant neptune = new Plant("Neptune",3.883,17.15,30.07,164.79);
        // Dùng BST để xử lý theo khối lượng từ bé đến lớn
        System.out.println("Use BST: ");
        BST tree = new BST();
        tree.insert(mercury);
        tree.insert(venus);
        tree.insert(earth);
        tree.insert(mars);
        tree.insert(jupiter);
        tree.insert(saturn);
        tree.insert(uranus);
        tree.insert(neptune);
        System.out.println("Hành tinh theo thứ tự khối lượng:");
        tree.inorder(tree.root);
        
        //Dùng array để xử lý theo đường kính từ bé đến lớn
        System.out.println("Use array: ");
        Array array = new Array(10);
        array.insertHead(mercury);
        array.insertLast(mars);
        array.insertHead(earth);
        array.insertLast(venus);
        array.insertHead(saturn);
        array.insertLast(jupiter);
        array.insertHead(uranus);
        array.insertLast(neptune);
        //truoc khi sap xep 
        System.out.println("Before sort:");
        array.displayArray();
        //sau khi sap xep 
        System.out.println("After sort:");
        array.printByDiameter();
        
        //Dùng linkedlist xử lý theo AU
        System.out.println("Use linkedlist: ");
        LinkedList list = new LinkedList();
        list.insertHead(uranus);
        list.insertHead(mercury);
        list.insertHead(earth);
        list.insertHead(venus);
        list.insertHead(saturn);
        list.insertHead(jupiter);
        list.insertHead(neptune);
        list.insertHead(mars);
        //truoc khi sap xep 
        System.out.println("Before sort:");
        list.displayList();
        //sau khi sap xep 
        System.out.println("After sort:");
        list.printBySemiMajor();
        
        //Dùng Stack để xử lý
        System.out.println("Use linkedlist: ");
        Stack stack = new Stack();
        stack.push(uranus);
        stack.push(earth);
        stack.push(mars);
        stack.push(jupiter);
        stack.push(venus);
        stack.push(saturn);
        stack.push(neptune);
        stack.push(mercury);
        
        System.out.println("Danh sach cac hanh tinh dung Stack: ");
        stack.display();
        System.out.println("Hanh tinh o vtri top: ");
        stack.peek();
        System.out.println("Pop stack : "+ stack.pop().toString());
        System.out.println("Hanh tinh con lai: ");
        stack.display();
  

        }

    }
}
