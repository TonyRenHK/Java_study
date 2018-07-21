import java.io.*;
import java.util.ArrayList;
import java.util.*;
import java.lang.*;

/*
 string study 
*/
public class Solution {
   
  public static void main(String[] args) {
      try {
        
        String str="wiuhjkhjkhjkhkj";
        System.out.println("total length : "+str.length() );
        for(int i =0; i<str.length(); i++){
          int posChar = str.charAt(i) - 'a';
          System.out.println(str.charAt(i)  +"@"+ posChar ); 
        }
        
        System.out.println("*▶☆✡ ✦ ✧ ✩ ✪ ✫ ✬ ✭ ✮ ✯ ✰ ⁂"  );

        
      } catch (Exception e) {

      }
  }
  
  
  
}


