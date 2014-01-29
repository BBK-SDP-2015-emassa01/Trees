/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Esha
 */
public interface IntSet {
    
    void add(int x);
//adds a new int to the set; if it is there already, nothing happens.
    
    boolean contains(int x);
//returns true if the number is in the set, false otherwise.

    void containsVerbose(int x);
//returns the same values as the former method, but for every element that is checked prints
//its value on screen.
    
    void ToString();
    //returns a string with the values of the elements in the set separated by commas.

}
