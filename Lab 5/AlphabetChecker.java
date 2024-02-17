public class AlphabetChecker {
    public static void main(String args[]) {
        Alphabet test0 = (str) -> {
            for (int i = 0; i < str.length(); i++) {
                if (!Character.isLetter(str.charAt(i))) {
                    return false;
                }
            }
            return true; 
        };

        if (test0.isAlphabet(args[0])) {
            System.out.println("The string is Alphabet");
        } else {
            System.out.println("The string is NOT Alphabet");
        }
    }
}

