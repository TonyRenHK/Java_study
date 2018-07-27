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



import java.io.*;
import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

class Solution {
   /* arr[]  ---> Input Array
    data[] ---> Temporary array to store current combination
    start & end ---> Staring and Ending indexes in arr[]
    index  ---> Current index in data[]
    r ---> Size of a combination to be printed */
    static void combinationUtil(int arr[], int data[], int start,
                                int end, int index, int r){
      // r fixed == 3 
        //System.out.println("New combinationUtil  index: " + index + " start : "+ start );
      
        // Current combination is ready to be printed, print it
        if (index == r){ // index == 3
            for (int j=0; j<r; j++){
              //System.out.print(data[j]+" ");
            }
                
            //System.out.println("");
            return;
        }
      
        // end == 4 
        // replace index with all possible elements. The condition
        // "end-i+1 >= r-index" makes sure that including one element
        // at index will make a combination with remaining elements
        // at remaining positions
        for (int i=start; i<=end && end-i+1 >= r-index; i++)
        {
            data[index] = arr[i];
            System.out.println( " change index " + index + " as " + arr[i] );
            combinationUtil(arr, data, i+1, end, index+1, r);
        }
    }
 
  
    // The main function that prints all combinations of size r
    // in arr[] of size n. This function mainly uses combinationUtil()
    static void printCombination(int arr[], int n, int r){
        // A temporary array to store all combination one by one
        int data[]=new int[r]; // int data[]=new int[3];
 
        // Print all combination using temprary array 'data[]'
        combinationUtil(arr, data, 0, n-1, 0, r);
      //(int arr[], int data[], int start,  int end, int index, int r)
    }
  
  
  
  public static void main(String[] args) {
    int arr[] = {1, 2, 3, 4, 5};
    int r = 3;
    int n = arr.length;
    //printCombination(arr, n, r);
    
    ArrayList<String> list = new ArrayList<String>();
    list.add("A");
    list.add("B");
    list.add("C");
    list.add("D");
    list.add("E");
    list.add("F");
    list.add("G");
    list.add("H");

    int i[] = {1,3,5};

    Iterator<String> itr = list.iterator();
    int pos = 0;
    int index = 0;
    while( itr.hasNext() ){
        itr.next();
        if( pos >= i.length ){
            break;
        }
        if( i[pos] == index ){
            itr.remove();
            pos++;
        }

        index++;
    }
    
    
  }
}




