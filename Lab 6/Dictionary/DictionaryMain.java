import java.util.Map;
import java.util.PriorityQueue;

public class DictionaryMain {
    public static void main(String[] args) {
        Dictionary dictionary1 = new Dictionary();

        dictionary1.addWord("Apple");
        dictionary1.addWord("banana");
        dictionary1.addWord("book");
        dictionary1.addWord("pen");
        dictionary1.addWord("pencil");
        dictionary1.addWord("Astronaut");
        dictionary1.addWord("Apple");
        dictionary1.addWord("Apple");
        dictionary1.printDictionary();
        System.out.println("________________________");
        dictionary1.printAllWordsForLetter('a');

    }
}

