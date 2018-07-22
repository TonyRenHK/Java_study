 import java.io.*;
import java.util.*;

public class Solution {
  
  
  public ListNode addTwoNumbers(ListNode ListNode1, ListNode ListNode2) {
    int ListNodeAmt1=ListNode1.val;
    int muti1=1;
    ListNode nextNode= ListNode1.next;
    while(nextNode!=null){
      muti1=muti1*10;
      ListNodeAmt1=  ListNodeAmt1+ muti1*nextNode.val;
      //System.out.println(nextNode.val);
      nextNode= nextNode.next;
    }
    
    int ListNodeAmt2=ListNode2.val;
    int muti2=1;
    ListNode nextNode2= ListNode2.next;
    while(nextNode2!=null){
      muti2=muti2*10;
      ListNodeAmt2=  ListNodeAmt2+ muti2*nextNode2.val;
      nextNode2= nextNode2.next;
    }
    
    
    //System.out.println(ListNodeAmt1);
    //System.out.println(ListNodeAmt2);
    List<ListNode> ListNodeArray = new ArrayList<ListNode> ();
    
    int totalAmount = ListNodeAmt1+ListNodeAmt2;
    System.out.println(totalAmount);
    String numberAsString = Integer.toString(totalAmount);
    
    ListNode ReturnNode = new ListNode(Integer.parseInt( Character.toString(numberAsString.charAt(numberAsString.length()-1)) ));
    ListNodeArray.add(ReturnNode);
    /*
    for(int i =numberAsString.length()-2; i>=0;i-- ){
      //System.out.println( numberAsString.charAt(i) );
      int result = Integer.parseInt( Character.toString(numberAsString.charAt(i)) );  
      System.out.println( result );
      
    }*/
    
    int i =numberAsString.length()-2;
      
    while(i>=0){
      
      int result = Integer.parseInt( Character.toString(numberAsString.charAt(i)) );
      ListNode temp = new ListNode(result);
      ListNodeArray.add(temp);
       
      //System.out.println( result );
      i--;
    }
    
    
    for(int j=1; j< ListNodeArray.size();j++){
      System.out.println(ListNodeArray.get(j).val);
      ListNodeArray.get(j-1).next = ListNodeArray.get(j);
    }
    
    return ReturnNode;    
  }
  
  
  
  public void printNode(ListNode l1){
    //System.out.println(l1.val   );
    //ListNode p= new ListNode(ListNode.next.val);
    ListNode p= l1.next;
    
    if(p!=null ){
      //System.out.println("$$ :"+l1.val   );
      //System.out.println("no null");
      printNode(p);
    }
  
  }
  
  
  public static void main(String[] args) {
    Solution newSolution = new Solution();
    
    System.out.println("✪✪✪✪✪✪✪✪✪✪✪✪✪✪✪✪✪✪✪"  );
    int number = 708;
    //String numberAsString = Integer.toString(number);
    //System.out.println(numberAsString.length());
    
    ListNode temp1 = new ListNode(2);
    
    ListNode temp12 = new ListNode(4);
    temp1.next = temp12;
    
    ListNode temp13 = new ListNode(3);
    temp12.next = temp13;
    
    
    
    
    
    //newSolution.printNode(temp1);
    
    
    ListNode temp2 = new ListNode(5);
    ListNode temp22 = new ListNode(6);
    ListNode temp23 = new ListNode(4);
    temp22.next = temp23;
    temp2.next = temp22;
    //newSolution.printNode(temp2);
    
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
  /*
  public void SetNext(ListNode input_next){
    this.next =input_next;
  }
  public int returnListNode(){
    return this.next.val;
  }*/
}
