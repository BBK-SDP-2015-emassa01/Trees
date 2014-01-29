/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Esha
 */

/*this is the one the nice Greek guy helped me with! Copy the work from here to 
*the sorted list linked and modify the Contains Verbose methods and ToString methods.
*/
public class TreeIntSet implements IntSet{
    
    int value;
    TreeIntSet right ;
    TreeIntSet left;
    
    TreeIntSet(int value){
        this.value = value;
        this.right = null;
        this.left = null;
        System.out.println("Added "+value+" to set.");  
    }
    
    public void add(int x){
        if (x>value) {
            if (this.right == null){
            this.right = new TreeIntSet(x);

        }
            else if (value == x){
            System.out.println("Already in set.");
          } else {
            this.right.add(x);
        }
        }
       
        else {
            if (this.left == null){
            this.left = new TreeIntSet(x);  
        }
            else if (value == x){
            System.out.println("Already in set.");
            } else {
            this.left.add(x);
        }
        }
    }
    
    public boolean contains(int x){

        if (this.value == x) return true;
            
        if (x< this.value) {
            if (this.left!=null){
            if(this.left.contains(x)==true){
            //System.out.println("Found: " + x);
            return true;
            }}
        } else {
            if (this.right!=null){
            if(this.right.contains(x)== true){
            //System.out.println("Found: " + x);
            return true;
            }}
        }return false;
    }
    
    public boolean containsG(int x){

        if (this.value == x){
         System.out.println("Found: " + x);
          return true;
        }
            if (this.left!=null){
            if(this.left.contains(x)==true){
            return true;
            }
            if (this.right!=null){
            if(this.right.contains(x)== true){
            return true;
            }}
        }return false;
    }
    
    
    public boolean containsL(int x){
        if (this.left == null){
            System.out.println("Currently not in your set.");
            return false;
        } if (this.value == x) {
            System.out.println("Found: " + x);
            return true;
        } else {
            return this.left.containsL(x);
    }
    }
    
    
    public boolean containsR(int x){
        if (this.right == null){
            System.out.println("Currently not in your set.");
            return false;
        } if (this.value == x) {
            System.out.println("Found: " + x);
            return true;
        } else {
            return this.right.containsR(x);
    }
    }
    
    public void containsVerbose(int x){
            if ((this.right == null)&&(this.left == null)){
            System.out.println("Currently not in your set.");
            } else {
            System.out.println("Checked value on tree, it is: "+ this.value );
                    this.right.containsVerbose(x);
                    this.left.containsVerbose(x);
    }
    }
    
    String contents = "";
    public void ToString(){
        if ((this.right!=null)|| (this.left!=null)){
        contents = contents + " " +this.value ;
        if( this.right != null) {
            contents = contents + " " + this.right.value;
        }
        if( this.left != null) {
            contents = contents + " " +this.left.value; 
        }
        this.left.ToString();
        this.right.ToString();
        }
        System.out.print(contents);
                }
        
        
    /* if (this.right == null){ 
           System.out.print(this.value+ ",");
       } else if( this.right != null) {
           //System.out.print(this.value+ ",");
           this.right.ToString();
       }
       if(this.left == null){
           System.out.print(this.value + ",");
       } else if (this.left != null){
           //System.out.print(this.value + ",");
           this.left.ToString();
       }
    }*/
    
}

