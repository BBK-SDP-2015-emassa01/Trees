/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Esha
 */
public class treeRun {
    
    public static void main(String[] args){
    
    IntegerTreeNode myTree = new IntegerTreeNode(6);
    
    myTree.add(5);
    myTree.add(9);
    myTree.add(3);
    myTree.add(8);
    myTree.add(11);
    myTree.add(12);
    myTree.add(13);
    myTree.add(14);
    myTree.add(15);
    myTree.add(20);
    myTree.add(40);
    myTree.add(53);
    myTree.add(64);
    myTree.add(75);
    
    int n = 5;
    System.out.println("checked if contains " + n + " "+ myTree.contains(n));
    
     n = 8;
    System.out.println("checked if contains " + n +" "+  myTree.contains(n));
    
     n = 57;
    System.out.println("checked if contains " + n + " "+ myTree.contains(n));
    
     n = 90;
    System.out.println("checked if contains " + n + " "+ myTree.contains(n));
    
    System.out.println("checked min value: "+" "+ myTree.getMin());
    
    System.out.println("checked max value: "+" "+ myTree.getMax());
    
    //myTree.totalString();
    //System.out.println("\n");
    //myTree.ToStringAll();
    myTree.capturePrint();
    System.out.println("\n");
   myTree.count();
    }
   
     
}
