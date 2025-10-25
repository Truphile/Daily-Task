import java.util.ArrayList;

public class wordsSplit {



public static ArrayList<String> splitWordsAndAddToArray(String words) {
        ArrayList<String> newWord = new ArrayList<>();
        String singleWord = "";
        
        for (int check = 0; check < words.length(); check++) {
            char currentChar = words.charAt(check);
            
            if (currentChar == ' ') {
                if (!singleWord.isEmpty()) {
                    newWord.add(singleWord);
                }
                singleWord = "";
            } else {
                singleWord += currentChar;
            }
        }
        
      
        if (!singleWord.isEmpty()) {
            newWord.add(singleWord);
        }
        
        return newWord;
    }


public static void main(String[] args) {
        String words = "i love programming";
        ArrayList<String> newWordList = splitWordsAndAddToArray(words);
        
        System.out.println(newWordList);
    }
}