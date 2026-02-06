
import java.util.ArrayList;
import java.util.List;

// leetcode -> leet, code
public class WordBreak {
    public static void main(String[] args) {
        List<String> list =  new ArrayList<>();
        list.add("apple");
        list.add("pen");
        System.out.println(breakWord("applepenapple", list));
    }
    public static boolean breakWord(String word, List<String> wordDict){
        int i=0;
        for (String wordDict1 : wordDict) {
            System.out.println(word.substring(i,wordDict1.length() + i));
            if(word.substring(i,wordDict1.length() + i).equals(wordDict1)){
                i += wordDict1.length();
            }
        }
        return i == word.length();
    }
}
