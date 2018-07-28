import java.io.*;
import java.util.*;

 
class Solution {
   
   //779. K-th Symbol in Grammar https://leetcode.com/problems/k-th-symbol-in-grammar/description/
  //https://www.cnblogs.com/grandyang/p/9027098.html
  public static int kthGrammar2(int N, int K) {
    if(N ==  1) return  0;
    if(K % 2 == 0) return (kthGrammar2(N - 1, K / 2) == 0) ? 1 : 0;
    else   return (kthGrammar2(N - 1, (K+1) / 2) == 0) ? 0 : 1; 
  }
  
  public static int kthGrammar(int N, int K) {
    if(N==1) return 0;
    
    int ans=kthGrammar(N-1,(K+1)/2);
    
    if(ans==0){
        if(K%2==1) return 0;
        else return 1;
    }else{
        if(K%2==1) return 1;
        else return 0;
    }
  }
  
  
  public static void main(String[] args) {
    
    System.out.println(kthGrammar(4,5) );
    
    System.out.println("****** end ******"  );
    
  }
  
  
}
