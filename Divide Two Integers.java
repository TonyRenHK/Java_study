import java.io.*;
import java.util.*;

/*
case 1: 
Input:0 1
Output:2
Expected: 0


*/
class Solution {
  
  public static int divide(int dividend, int divisor) {
    int returnNumber = 0;
    if( dividend>Integer.MAX_VALUE || divisor == 0 ){
      return 1;
    }
    
    Boolean IsNegative = false;
    if( ( dividend < 0 && divisor>0)|| (dividend>0 && divisor<0 ) ){
      IsNegative = true;     
    }
    
    
    Long CurrentNumber = Math.abs( (long) dividend);
    Long Factor = Math.abs( (long) divisor);
    
    if(CurrentNumber<Factor){
      //returnNumber = 1;
    }
    
    while(CurrentNumber >= Factor){
       CurrentNumber = CurrentNumber-Factor;  
       returnNumber++;
    }
      
    
    if(IsNegative){
      returnNumber = 0-returnNumber;
    }
    return returnNumber;
  }
  
  public static void main(String[] args) {
    
    System.out.println( divide(-2147483648,-1) );
    //System.out.println("*▶▶▶▶" + Integer.MAX_VALUE);
    
  }
}
