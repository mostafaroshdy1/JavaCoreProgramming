class Wordcounter2 {
    public static void main(String args[]) {
        if (args.length != 2) {
            System.out.println("The app needs 2 arguments");
            return;
        }

        String sentence = args[0];
        String word = args[1];
        int startIndex = 0;
        int count = 0;

        while (startIndex != -1) {
            startIndex = sentence.indexOf(word, startIndex);
            if (startIndex != -1) {
                count++;
                startIndex += word.length() + 1;
            }
        }
        System.out.println("Occurrences of the word '" + word + "': " + count);
    }
}

