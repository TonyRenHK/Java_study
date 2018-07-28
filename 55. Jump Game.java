import java.io.*;
import java.util.*;

// /55. Jump Game

class Solution {
   
    // * 贪心寻找上界！！！！还有这题是不寻找路线的！！！
    
  public static boolean canJump(int[] nums) {
    int reach=0;
    int i=0;
    while(i<nums.length && i<=reach){
      reach=Math.max(reach,i+nums[i]);
      System.out.println("reach : " + reach + " || " +  i+" ** "+nums[i] );
      i++;
    }
    return reach>=nums.length-1;
  }
  
  
  public static void main(String[] args) {
    int[] nums = {3,2,1,0,4};//{2,3,1,1,4};
    
    
    System.out.println( canJump(nums) );
    System.out.println("****** end ******"  );
    
  }
  
  
}
