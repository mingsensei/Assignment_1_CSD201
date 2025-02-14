/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package plants;

/**
 *
 * @author macos
 */
public class BST {
    class Node {
        Plant plant;  
        Node left, right;

         public Node(Plant plant) {
            this.plant = plant;
            left = right = null;
        }
    }
    Node root;

    void insert( Plant plant) {
        root = insertRec(root, plant);
    }

    Node insertRec(Node root, Plant plant) {
        if (root == null) {
            root = new Node(plant);
            return root;
        }
        if (plant.getMass() < root.plant.getMass()) root.left = insertRec(root.left, plant);
        else root.right = insertRec(root.right, plant);
        return root;
    }

    void inorder(Node current) {
        if (current != null) {
            inorder(current.left);
            System.out.println(current.plant.toString());
            inorder(current.right);
        }
    }
}

