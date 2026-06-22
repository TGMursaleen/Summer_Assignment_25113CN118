import java.util.Scanner;

public class Q104 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Define questions, options, and correct answers
        String[] questions = {
            "Which data type is used to create a variable that should store text in Java?",
            "Which method can be used to find the length of a string in Java?",
            "How do you insert comments in Java code?"
        };
        
        String[][] options = {
            {"1. myString", "2. String", "3. txt", "4. string"},
            {"1. getSize()", "2. length()", "3. len()", "4. getLength()"},
            {"1. # Comment", "2. /* Comment", "3. // Comment", "4. -- Comment"}
        };
        
        int[] correctAnswers = {2, 2, 3}; // Corresponding option numbers
        int score = 0;
        
        System.out.println("=== WELCOME TO THE QUIZ APPLICATION ===");
        System.out.println("Please answer the following multiple-choice questions:\n");
        
        // Loop through each question
        for (int i = 0; i < questions.length; i++) {
            System.out.println("Question " + (i + 1) + ": " + questions[i]);
            
            // Print options for the current question
            for (String option : options[i]) {
                System.out.println(option);
            }
            
            int userChoice = 0;
            boolean validInput = false;
            
            // Input validation loop
            while (!validInput) {
                System.out.print("Your answer (1-4): ");
                if (sc.hasNextInt()) {
                    userChoice = sc.nextInt();
                    if (userChoice >= 1 && userChoice <= 4) {
                        validInput = true;
                    } else {
                        System.out.println("Invalid choice! Please select a number between 1 and 4.");
                    }
                } else {
                    System.out.println("Invalid input! Please enter a valid integer.");
                    sc.next(); // Clear invalid input
                }
            }
            
            // Check answer
            if (userChoice == correctAnswers[i]) {
                System.out.println("Result: Correct Answer!\n");
                score++;
            } else {
                System.out.println("Result: Wrong Answer! The correct option was: " + correctAnswers[i] + "\n");
            }
        }
        
        // Final Score Evaluation
        System.out.println("=== QUIZ COMPLETED ===");
        System.out.println("Your Final Score: " + score + " out of " + questions.length);
        
        double percentage = ((double) score / questions.length) * 100;
        System.out.println("Percentage: " + percentage + "%");
        
        if (percentage >= 70) {
            System.out.println("Performance Evaluation: Excellent!");
        } else if (percentage >= 40) {
            System.out.println("Performance Evaluation: Good effort, keep practicing!");
        } else {
            System.out.println("Performance Evaluation: Needs Improvement.");
        }
        
        sc.close();
    }
}