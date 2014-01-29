/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Esha
 */
public class IntegerTreeNode {
static int count = 0;
static int Lcount = 0;
static int Rcount = 0;
    int value;
IntegerTreeNode left;
IntegerTreeNode right;


public IntegerTreeNode(int value){
    this.value = value;    
}

public void add(int newNumber) {
if (newNumber > this.value) {
    if (right == null) {
    right = new IntegerTreeNode(newNumber);
    } else {
        right.add(newNumber);
    }
} else {
    if (left == null) {
        left = new IntegerTreeNode(newNumber);
    } else {
        left.add(newNumber);
    }
}
}

public boolean contains(int n) {
    if (n == this.value) {
        return true;
    } else if (n > this.value) {
        if (right == null) {
            return false;
        } else {
            return right.contains(n);
        }
    } else {
        if (left == null) {
            return false;
        } else {
            return left.contains(n);
        }
    }
}

public int getMax(){
if (right==null) {
    return this.value;
} else 
return right.getMax();

}

    
public int getMin(){
    if (left== null) {
    return this.value;
    } else
        return left.getMin();
    }


public String ToStringLeft(){
    
    

   if (this.left ==null) {
        String a = this.value + "L[]";
        return a;
   } else {
    String a =" ";
    a = a + "L[" +this.left.value + "]";
    System.out.print(a);
    return this.left.ToStringLeft();  
}
}
   
public String ToStringRight(){
   if (this.right ==null) {
        String b = "R[]";
        return b;
   } else {   
        String b = "";
        b = b+  "R[" + this.right.value + "]";
        System.out.print(b);
        return this.right.ToStringRight();
   }
   //System.out.print("]" );
}

public void ToString(){
    System.out.print("[" + this.value);
    this.ToStringLeft();
    this.ToStringRight();
    System.out.print("]");
}

public void ToStringAll(){
    
   if ((this.left ==null) && (this.right ==null)){
        String a = "L[] R[]";
        System.out.print(a);
   } else if ((this.left ==null) &&(this.right !=null)){
           String a = " L[]R[" + this.right.value + "] ";
           System.out.print(a);
            right.ToStringAll();
       } else if ((this.right ==null) &&(this.left !=null)) {
           String a = " L[" + this.left.value + "R[]";
           System.out.print(a);
            left.ToStringAll();
       }
       else if ((this.right !=null) &&(this.left !=null)) {
           String a = " L[" + this.left.value + "R["+ this.right.value +"] ";
           System.out.print(a);
           right.ToStringAll();
           left.ToStringAll();
           
       }
   }

public void totalString(){
    System.out.print("["+ this.value);
    this.ToStringAll();
    System.out.print("]");
    
}

public void count(){
    System.out.println(count-1);
}

public void printOut(){
    if (this.left ==null){ 
        Rcount ++;
        System.out.print(" L[]");
    } else {
    System.out.print(" L [" + this.left.value);
    this.left.printOut();
    System.out.print("]");
    }
    if (this.right ==null){
        Lcount++;
        System.out.print(" R[]");
    } else {
    System.out.print(" [R"+ this.right.value);
    this.right.printOut();
    System.out.print("]");
    }
    if (Lcount>=Rcount){
        count = Lcount;
        } else {
        count = Rcount;
    }
}
    

public void capturePrint(){
    System.out.print("["+ this.value);
    this.printOut();
    System.out.print("]");
}

}



