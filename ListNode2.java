import java.io.*;
import java.util.*;


/*
21. Merge Two Sorted Lists
Input: 1->2->4, 1->3->4
Output: 1->1->2->3->4->4
*/
class Solution {
  
  
  public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    ListNode temp1 = new ListNode(1);
    return temp1;
  }
  
  
  public static void printNode(ListNode l1){
    //System.out.println(l1.val);
    ListNode p= l1.next;
    
    if(p!=null ){
      System.out.println("$$ :"+l1.val   );
      printNode(p);
    }
  
  }
  
  
  
  
  public static ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
    if (l1 == null) return l2;
    if (l2 == null) return l1;

    ListNode head = new ListNode(0);
    ListNode curr = head;
    while (l1 != null && l2 != null) {
        if (l1.val <= l2.val) {
            curr.next = l1;
            l1 = l1.next;
        } else {
            curr.next = l2;
            l2 = l2.next;
        }
        curr = curr.next;
    }
    curr.next = l1 == null ? l2 : l1;
    return head.next;
  }
  
  
  
  public static void printNode2(ListNode l1){
    //System.out.println(l1.val);
    ListNode p= l1.next;
    
    
    while(p!=null){
      System.out.println("GG: :"+p.val   );
      p= p.next;
    }
  
  }
  
  
  
  public static void main(String[] args) {
    ListNode temp1 = new ListNode(1);
    ListNode temp12 = new ListNode(3);
    ListNode temp13 = new ListNode(4);
    temp12.next = temp13;
    temp1.next = temp12;
    
    ListNode temp2 = new ListNode(1);
    ListNode temp22 = new ListNode(3);
    ListNode temp23 = new ListNode(4);
    temp22.next = temp23;
    temp2.next = temp22;
    
    
    
    //ListNode temp3 = mergeTwoLists(temp1,temp2);
    //ListNode temp4 = mergeTwoLists2(temp1,temp2);
    
    printNode2(temp1);
    
    System.out.println("*▶▶▶▶" + Integer.MAX_VALUE);
    
  }
  
}


class ListNode {
  int val;
  ListNode next;
  ListNode(int x) { 
    val = x;
  }
}
