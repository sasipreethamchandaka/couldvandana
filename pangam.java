import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PangramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        boolean isPangram = isPangram(sentence);
        
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean isPangram(String sentence) {
        
        sentence = sentence.replaceAll(" ", "").toLowerCase();
        
        Set<Character> charSet = new HashSet<>();
        
        for (char c : sentence.toCharArray()) {
            if (Character.isLetter(c)) {
                charSet.add(c);
            }
        }
        
        return charSet.size() == 26;
    }
}
