import java.util.Scanner;

public class Q95 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence: ");
        String sentence = sc.nextLine();

        // Spaces ke basis par words ko alag alag array mein store karna
        String[] words = sentence.split("\\s+");
        
        String longestWord = "";

        for (int i = 0; i < words.length; i++) {
            // Agar current word ki length ab tak ke longest word se badi hai
            if (words[i].length() > longestWord.length()) {
                longestWord = words[i];
            }
        }

        System.out.println("Longest word: " + longestWord);
        System.out.println("Length: " + longestWord.length());

        sc.close();
    }
}