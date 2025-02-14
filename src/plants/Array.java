/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package plants;

import java.util.Arrays;
/**
 *
 * @author macos
 */
public class Array {
    Plant plants[];
    int capacity = 5;
    int length = 0;
    public Array(){
        this(5);
    }
    
    public Array(int capacity){
        this.capacity = capacity;
        Plant plants[] = new Plant[capacity];
        this.plants = plants;
    }
    
    public void insertLast(Plant plant){
        if(!checkFull()){
            upSize();
        }
        plants[length] = plant;
        length++;
    }
    
    public void insertHead(Plant plant){
        if(!checkFull()){
            upSize();
        }
        for(int i =length;i>0;i--){
            plants[i]=plants[i-1];
        }
        plants[0] = plant;
        length++;
    }
    
    public void displayArray(){
        for(int i =0 ;i<capacity;i++){
            if(plants[i] == null){
                System.out.println("Vi tri thu "+(i+1)+" trong.");
                continue;
            }
            System.out.println(plants[i].toString());
        }
    }
    
    public void upSize(){
        capacity +=5;
        Plant[] temp = Arrays.copyOf(plants,capacity-1);
        this.plants = new Plant[capacity];
        this.plants = Arrays.copyOf(temp,capacity);
    }
    
    public void addAtIndex(int index, Plant plant){
  
        if(index>= capacity){
            capacity = index;
            upSize();
        }else{
            upSize();
        }
        for(int i = length;i>index;i--){
            plants[i]= plants[i-1];   
        }
        plants[index] = plant;
        length++;
    }
    
    public void deleteHead(){
        for(int i =0;i<length;i++){
            plants[i] = plants[i+1];
        }
    }
    
    public void deleteTail(){
        plants[plants.length-1]=null;
        length--;
    }
    public boolean checkFull(){
        if(capacity == length){
            return false;
        }else{
            return true;
        }
    }
    public void printByDiameter() {
        Arrays.sort(plants, 0, length, (p1, p2) -> {
        if (p1 == null || p2 == null) return 0;
            return Double.compare(p1.getEqDiameter(), p2.getEqDiameter());
        });
        displayArray();
}
}
