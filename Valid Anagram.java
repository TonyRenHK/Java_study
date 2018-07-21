import java.io.*;
import java.util.ArrayList;
import java.util.*;
import java.lang.*;

/*
 242. Valid Anagram
 https://leetcode.com/problems/valid-anagram/description/
*/
public class Solution {
  
  public static boolean isAnagram(String s, String t) {
     if (s.length() != t.length()) {
        return false;
    }
    char[] str1 = s.toCharArray();
    char[] str2 = t.toCharArray();
    Arrays.sort(str1);
    Arrays.sort(str2);
    System.out.println("str1:" + String.valueOf(str1)  );
    System.out.println("str2:" + String.valueOf(str2)  );
    return Arrays.equals(str1, str2);
  }
  
  public static void main(String[] args) {
      try {
        System.out.println(isAnagram("anagram","nagaram") );
        System.out.println("*▶☆✡ ✦ ✧ ✩ ✪ ✫ ✬ ✭ ✮ ✯ ✰ ⁂"  );

        
      } catch (Exception e) {

      }
  }
  
  
  
}


