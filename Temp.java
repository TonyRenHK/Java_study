import java.io.*;
import java.util.ArrayList;
import java.util.*;
import java.lang.*;

/*
 Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807.
*/
public class Solution {
  
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    
    
    ListNode temp1 = new ListNode(2);
    return temp1;    
  }

  public static void printNode(ListNode l1){
    System.out.println(l1.val);
    ListNode p= ListNode.next;
    
    while(p!=null ){
      System.out.println("no null");
      printNode(p);
    }
  
  }
  
  public static void main(String[] args) {
      try {
        
        System.out.println("✪✪✪✪✪✪✪✪✪✪✪✪✪✪✪✪✪✪✪"  );
        ListNode temp1 = new ListNode(2);
        ListNode temp12 = new ListNode(4);
        ListNode temp13 = new ListNode(3);
        temp12.next = temp12;
        temp1.next = temp13;
        System.out.println(temp13.next);
        printNode(temp1);
        
        
        ListNode temp2 = new ListNode(5);
        ListNode temp22 = new ListNode(6);
        ListNode temp23 = new ListNode(4);
        temp22.next = temp23;
        temp2.next = temp22;
        
        System.out.println("*▶☆✡ ✦ ✧ ✩ ✪ ✫ ✬ ✭ ✮ ✯ ✰ ⁂"  );

        
      } catch (Exception e) {

      }
  }
  
  
  
}

class ListNode {
    //Definition for singly-linked list.
    public int val;
    public ListNode next;
    public ListNode(int x) { 
      val = x; 
    }
}

  
  
  
  
  
  
  
  
  
  
  
  
  
  
import java.io.*;
import java.util.*;
//279. Perfect Squares

/*class Solution {
  public int numSquares(int n) {
    int result =0;
    int currentNum = 0;
    Set<Integer> factorSet = new HashSet<Integer>();
    
    while((currentNum * currentNum )<=n){
      currentNum++;
      
    }
    return result;
    
  }
  
  
  public static void main(String[] args) { 
    System.out.println( "*▶▶▶▶");
    
  }
  
}*/


class Solution{
  
  public static int fib(int n) {

      if (n < 0) {
          throw new IllegalArgumentException(
              "Index was negative. No such thing as a negative index in a series.");
      }

      // base cases
      if (n == 0 || n == 1) {
          return n;
      }

      System.out.printf("computing fib(%d)\n", n);
      return fib(n - 1) + fib(n - 2);
  }
  
  
  public static int numSquares(int n) {
    System.out.println( "********");
    int [] dp = new int[n+1];
    dp[0]=0;
    for(int i=1;i<=n;i++){//System.out.println(i);

      int min=Integer.MAX_VALUE;
      for(int j=1;j<=Math.sqrt(i);j++){
        System.out.println(" min : "+min + " i: " + i + " j : " +j);
        min = Math.min(min,dp[i-(j*j)]+1);
      }
      dp[i]=min;
    }
    
    System.out.println( "********");
    return dp[n];
  }
  
  public static void main(String[] args){
    System.out.println( Math.sqrt(1) );
    //System.out.println( numSquares(15) ); 
  }
 
}





