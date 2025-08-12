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
      for(int i=0;i<strs.length;i++){
        char[] ch = strs[i].toCharArray();
        Arrays.sort(ch);
        String unsorted = new String(ch);
        if(map.containsKey(unsorted)){
          List<String> temp = map.get(unsorted);
          temp.add(strs[i]);
          map.put(new String(ch), temp);
        }
        else {
          map.put(unsorted,new ArrayList<>(Arrays.asList(strs[i])));
        }
      }
      List<List<String>> anagrams = new ArrayList<>();
      for(var entry : map.entrySet()){
        anagrams.add(entry.getValue());
        // System.out.println(entry.getKey() + ", " + entry.getValue());
      }
      return anagrams;
    }
    public List<List<String>> groupAnagramsPractice(String[] str){
      HashMap<String,List<String>> map = new HashMap<>();
      for(int i=0; i<str.length; i++){
        char[] ch = str[i].toCharArray();
        Arrays.sort(ch);
        String unSortedStr = new String(ch);
        if(map.containsKey(unSortedStr)){
          List<String> listOfAnagrams = map.get(unSortedStr);
          listOfAnagrams.add(str[i]);
          map.put(unSortedStr,listOfAnagrams);
        }
        else{
          map.put(unSortedStr,new ArrayList<>(Arrays.asList(str[i])));
        }
      }
      List<List<String>> listOfLists = new ArrayList<>();
      for(var entry : map.entrySet()){
        entry.getValue().sort((a,b) -> a.toLowerCase().compareTo(b.toLowerCase()));
        listOfLists.add(entry.getValue());
      }
      listOfLists.sort(Comparator.comparingInt(List::size));
      return listOfLists;
    }
}
public class AnagramDemo{
  public static void main(String[] args){
    Solution sol = new Solution();
    String[] str = {"eat","tea","tan","ate","nat","bat"};
    System.out.println(sol.groupAnagramsPractice(str));
  }
}
