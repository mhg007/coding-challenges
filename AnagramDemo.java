import java.util.*;
class Solution {
    public List<List<String>> groupAnagrams(String[] str) {
        List<String> unSortedStr = new ArrayList<>();
        for(int i=0;i<str.length;i++){
          char[] ch = str[i].toCharArray();
          Arrays.sort(ch);
          unSortedStr.add(new String(ch));
        }
        List<List<String>> newList = new ArrayList<>();
        for(int i = 0; i < str.length-1; i++){
          for(int j = 1; j < str.length; j++){
            if(str[i].equals(str[j])){

            }
          }
        }
        return newList;
    }
    public List<List<String>> groupAnagram(String[] strs){
      HashMap<String,List<String>> map = new HashMap<>();
      
      return null;
    }
}
public class AnagramDemo{
  public static void main(String[] args){
    Solution sol = new Solution();
    String[] str = {"eat","tea","tan","ate","nat","bat"};
    // sol.groupAnagrams(str);
  }
}
