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

  
  
  
  
  
  
  
  
  
  
  
  
  
  
