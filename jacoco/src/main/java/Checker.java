/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zanders andra acc
 */
public class Checker{
    
    ///////////
    //methods//
    public boolean isPalindrome(String input){
    
        if(input == null){
        throw new IllegalArgumentException("argument can't be null");
        }
        
        if(input.equals(reverse(input))){
            return true;
        }
        else{
            return false;
        }
    }
    
    private String reverse(String input){
        String reverse = "";
        
       for(int i = input.length() - 1; i >= 0; i--){
           reverse += input.charAt(i);
       }
       return reverse;
    }
    
}
