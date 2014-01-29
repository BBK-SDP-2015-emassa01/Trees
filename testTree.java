/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Esha
 */
public class testTree {
    
    public static void main(String[] args){
        
/*        
//LIST
        System.out.println("LIST");
        
        ListIntSet newListLeaf1 = new ListIntSet(5);
        
        ListIntSet newListLeaf2 = new ListIntSet(2);
        newListLeaf1.add(newListLeaf2);
        ListIntSet newListLeaf3 = new ListIntSet(3);
        newListLeaf1.add(newListLeaf3);
        ListIntSet newListLeaf4 = new ListIntSet(4);
        newListLeaf1.add(newListLeaf4);
        ListIntSet newListLeaf5 = new ListIntSet(6);
        newListLeaf1.add(newListLeaf5);
        
        newListLeaf1.contains(7);
        newListLeaf1.containsVerbose(7);

        newListLeaf1.ToString();
        
        */
        
        //TREE
        
        System.out.println("\n\nTREE");
        TreeIntSet newTreeLeaf2 = new TreeIntSet(6);

        newTreeLeaf2.add(7);
        newTreeLeaf2.add(12);
        newTreeLeaf2.add(14);
        newTreeLeaf2.add(5);
        newTreeLeaf2.add(13);
        
        int num2find = 12;
        if (newTreeLeaf2.contains(num2find)){
           System.out.println("Found " + num2find);  
        }
       
        
        newTreeLeaf2.ToString();
    }
}
