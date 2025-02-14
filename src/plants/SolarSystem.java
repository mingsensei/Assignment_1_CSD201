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
        BST tree = new BST();
        tree.insert(mercury);
        tree.insert(venus);
        tree.insert(earth);
        tree.insert(mars);
        tree.insert(jupiter);
        tree.insert(saturn);
        tree.insert(uranus);


        System.out.println("Hành tinh theo thứ tự khối lượng:");
        tree.inorder(tree.root);
    }

}

}
