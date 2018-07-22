import java.io.*;
import java.util.*;

public class Solution {
  /*
  
  Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807.
  */
  
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode dummyHead = new ListNode(0);
    ListNode p = l1, q = l2, curr = dummyHead;
    int carry = 0;
    while (p != null || q != null) {
      int x = (p != null) ? p.val : 0;
      int y = (q != null) ? q.val : 0;
      System.out.println("x:" +x + "y:" + y  + "carry: "+ carry);
      
      int sum = carry + x + y;
      carry = sum / 10;
      System.out.println("sum:" +sum );

      curr.next = new ListNode(sum % 10);
      curr = curr.next;
      if (p != null) p = p.next;
      if (q != null) q = q.next;
    }
    if (carry > 0) {
        curr.next = new ListNode(carry);
    }
    return dummyHead.next;
  }
  
  
  
  public static void main(String[] args) {
    Solution newSolution = new Solution();
    
    System.out.println("✪✪✪✪✪✪✪✪✪✪✪✪✪✪✪✪✪✪✪"  );
    ListNode temp1 = new ListNode(2);
    ListNode temp12 = new ListNode(4);
    temp1.next = temp12;
    ListNode temp13 = new ListNode(3);
    temp12.next = temp13;
    
    ListNode temp2 = new ListNode(5);
    ListNode temp22 = new ListNode(6);
    ListNode temp23 = new ListNode(4);
    temp22.next = temp23;
    temp2.next = temp22;
    
    ListNode temp3 = newSolution.addTwoNumbers(temp1,temp2);
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
}
