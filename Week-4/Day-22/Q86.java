import java.util.Scanner;

public class Q86 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence: ");
        String sentence = sc.nextLine();

        // Shuruat aur aakhiri ke faltu spaces hatane ke liye
        String trimmed = sentence.trim();

        // Agar string khali hai toh words 0 honge
        if (trimmed.isEmpty()) {
            System.out.println("Total words: 0");
            sc.close();
            return;
        }

        int wordCount = 1; // Agar khali nahi hai toh minimum 1 word toh hoga hi

        for (int i = 0; i < trimmed.length(); i++) {
            // Agar current character space hai aur uske agla character space nahi hai, toh ek naya word shuru hua
            if (trimmed.charAt(i) == ' ' && trimmed.charAt(i + 1) != ' ') {
                wordCount++;
            }
        }

        System.out.println("Total words: " + wordCount);
        sc.close();
    }
}