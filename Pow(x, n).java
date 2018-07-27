import java.io.*;
import java.util.*;
//50. Pow(x, n)

class Solution {
  
  public static double myPow(double x, int n) {
    if(x==0){
      return 0;
    }
    if(n==0){
      return 1;
    }
    if(n<0){
      x = 1/x;
      n =0-n;
    }
    
    double result =x;
    for(int i = 0; i<(n-1) ;i++){
      result = result*x;
    }
    return result;
  }
  
  public static void main(String[] args) { 
    System.out.println("*▶▶▶▶" + myPow(2,-2) );
    
  }
  
}

