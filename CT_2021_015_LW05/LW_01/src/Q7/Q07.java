package Q7;
import java.util.Scanner;
public class Q07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String sentence = scanner.nextLine();

        System.out.println("Enter the word to be replaced:");
        String wordToReplace = scanner.nextLine();

        System.out.println("Enter the replacement word:");
        String replacementWord = scanner.nextLine();

        String modifiedSentence = replaceWords(sentence, wordToReplace, replacementWord);
        System.out.println("Modified sentence: " + modifiedSentence);

        scanner.close();
    }

    public static String replaceWords(String sentence, String wordToReplace, String replacementWord) {
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            // Remove punctuation if needed for cleaner matching
            if (words[i].equalsIgnoreCase(wordToReplace)) {
                words[i] = replacementWord;
            }
        }
        return String.join(" ", words);
    }
}