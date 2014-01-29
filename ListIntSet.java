/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Esha
 */
public class ListIntSet implements IntSet {
    
    int value;
    ListIntSet nextVal ;
    
    ListIntSet(int value){
        this.value = value;
        this.nextVal = null;
    }
    
    public void add(int x){
            if (this.nextVal == null){
                this.nextVal = new ListIntSet(x);
                this.value = x;
                System.out.println("Added "+ x +"in set."); 
            } else if (this.nextVal.value ==x){
                System.out.println("Already in set."); 
            }
             else this.nextVal.add(x);
            }

    
    public void add (ListIntSet location){
        if (this.nextVal == null){
            this.nextVal = location;
            System.out.println("Added "+ location +"to set.");  
        }
        else {
            this.nextVal.add(location);
        }
    }
    
    public boolean contains(int x){
        if (this.nextVal == null){
            System.out.println(x + " is currently not in your set.");
            return false;
        } if (this.value ==x){
            System.out.println(x + " is already in your set.");
            return true;
        }
        else {
            return nextVal.contains(x);
    }
    }
    
    public void containsVerbose(int x){
            if (this.nextVal == null){
            System.out.println(x + " is currently not in your set.");
            } else {
            System.out.println("Checked value in list, it is: "+ this.value );
                    this.nextVal.containsVerbose(x);
    }
    }
    
    public void ToString(){
       if (this.nextVal == null){ 
           System.out.println(this.value+ ".");
       } else if( this.nextVal != null) {
           System.out.print(this.value+ ",");
           this.nextVal.ToString();
       }
    }
    
}
