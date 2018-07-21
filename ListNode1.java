import java.io.*;
import java.util.*;

/*
https://leetcode.com/problems/add-two-numbers/solution/
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

public class Solution {
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    
    
    ListNode temp1 = new ListNode(2);
    return temp1;    
  }
  
  public void printNode(ListNode l1){
    System.out.println(l1.val   );
    //ListNode p= new ListNode(ListNode.next.val);
    ListNode p= l1.next;
    
    if(p!=null ){
      System.out.println("$$ :"+l1.val   );
      System.out.println("no null");
      printNode(p);
    }
  
  }
  
  
  public static void main(String[] args) {
    Solution newSolution = new Solution();
    
    System.out.println("✪✪✪✪✪✪✪✪✪✪✪✪✪✪✪✪✪✪✪"  );
    
    ListNode temp1 = new ListNode(2);
    ListNode temp12 = new ListNode(3);
    ListNode temp13 = new ListNode(4);
    temp12.next = temp13;
    temp1.next = temp12;
    
    
    newSolution.printNode(temp1);
    
    System.out.println("✪✪✪✪✪✪✪✪✪✪✪✪✪✪✪✪✪✪✪"  );
  }
  
}


//new object 
class ListNode {
  int val;
  public ListNode next ;
  
  public ListNode(int x) { 
    val = x; 
  }
  /*
  public void SetNext(ListNode input_next){
    this.next =input_next;
  }
  public int returnListNode(){
    return this.next.val;
  }*/
}
