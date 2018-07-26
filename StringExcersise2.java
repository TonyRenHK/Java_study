import java.io.*;
import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

class Solution {
  
  public static void main(String[] args) {
    
    /*
    char[] alphabet = new char[] {'a','b','v'};
    System.out.println("alphabet length : " + alphabet.length );    
    //StringExcersise.possibleStrings(3, alphabet,"");
    */
    
    
    //int[] indices = new int[3];
    /*
    for(int index : indices){
      System.out.println("index : " + index );
    }
    */
    
    System.out.println("***************");
    
    ArrayList<String> singleAddress = new ArrayList<String>();
    singleAddress.add("a");
    singleAddress.add("b");
    singleAddress.add("c");
    StringExcersise.generateCombinations(3,singleAddress);
    
    
  }
}

class StringExcersise {
  
  public static void generateCombinations(int arraySize, ArrayList<String> possibleValues){
    int carry;
    int[] indices = new int[arraySize];
    do{
        for(int index : indices){
          System.out.print(possibleValues.get(index) + " "+ index);
        }
            
        System.out.println("||");

        carry = 1;
        for(int i = indices.length - 1; i >= 0; i--){
            if(carry == 0)
                break;

            indices[i] += carry;
            carry = 0;

            if(indices[i] == possibleValues.size()){
              carry = 1;
              indices[i] = 0;
              System.out.println( " enter ");
              
            }
        }
    }
    while(carry != 1); 
    // Call this method iteratively until a carry is left over
  }
  
  
  
  
  
    public static void possibleStrings(int maxLength, char[] alphabet, String curr) {
      //maxLength = 3
 
      if(curr.length() == maxLength) {
          System.out.println("**Print : " +curr);

      } else {
          for(int i = 0; i < alphabet.length; i++) {
            String oldCurr = curr;
            curr += alphabet[i];
            
            System.out.println("curr : " +curr);
            
            possibleStrings(maxLength,alphabet,curr);
            curr = oldCurr;
          }
      }
    }
}
