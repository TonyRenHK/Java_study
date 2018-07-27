import java.io.*;
import java.util.*;
import java.math.BigInteger;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 * 7. Reverse Integer
 * If you need more classes, simply define them inline.
 */

class Solution {
  
  public static  int reverse(int x) { 
    boolean IsNegative = false;
    if(x<0){
      IsNegative=true;
    }
    x=Math.abs(x);
    
    String NumStr= String.valueOf(x);
    String OutputStr ="";
    
    
    
    for(int i = NumStr.length()-1; i>=0; i--){
      
      OutputStr+= NumStr.charAt(i) ;
    }
    System.out.println(OutputStr);
    
     try {
       if(IsNegative){
         return 0-Integer.parseInt(OutputStr);
       }else{
         return Integer.parseInt(OutputStr);
       }
     }catch(NumberFormatException e) {
      return 0;
    }
    
  }
  
  public static int strToInt( String str ){
    int i = 0;
    int num = 0;
    boolean isNeg = false;

    //Check for negative sign; if it's there, set the isNeg flag
    if (str.charAt(0) == '-') {
        isNeg = true;
        i = 1;
    }

    //Process each character of the string;
    while( i < str.length()) {
      num *= 10;
      char currentChar = str.charAt(i++);
      num += currentChar - '0';
      System.out.println( currentChar+  " num : "+ num);
      //Minus the ASCII code of '0' to get the value of the charAt(i++).
    }

    if (isNeg)
        num = -num;
    return num;
  }
  
  
  
  public static void main(String[] args) {
    //change string to int
    String number = "98765432123";//"9646324351";
    int result = strToInt(number);      
    //System.out.println(" Final Result : "+ result);
    
    
    
    System.out.println("*▶▶▶▶" + reverse(1534236469) );
    
  }
}
