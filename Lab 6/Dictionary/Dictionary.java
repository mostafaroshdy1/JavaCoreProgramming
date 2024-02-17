import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Dictionary {
    private Map<Character, PriorityQueue<String>> dictionary;

    public Dictionary() {
        dictionary = new HashMap<>();
        for (char c = 'a'; c <= 'z'; c++) {
            dictionary.put(c, new PriorityQueue<>());
        }
    }

    public Map<Character, PriorityQueue<String>> getDictionary() {
        return dictionary;
    }
    public void printDictionary() {
     for (char character = 'a'; character <= 'z'; character++) {
         PriorityQueue<String> priorityQueue = dictionary.get(character);
          if (priorityQueue != null) {
              System.out.print(character + ": ");
              for (String element : priorityQueue) {
                  System.out.print(element + " ");
              }
              System.out.println();
          }
      }
    }

    public boolean addWord(String word){
       if (!dictionary.get(word.toLowerCase().charAt(0)).contains(word.toLowerCase())) {
            dictionary.get(word.toLowerCase().charAt(0)).offer(word.toLowerCase());
            return true;
        }
        return false;
    }
    
    public void printAllWordsForLetter(Character c){
            System.out.println(dictionary.get(c));
          
    }
}

