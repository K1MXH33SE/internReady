import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to InternReady!");
        System.out.println("Using interReady will get you interview ready in no time!");
        System.out.println("Lets start!\n");

        System.out.println("Choose your category category:");
        System.out.println("Behavioural");
        System.out.println("Technical");
        System.out.println("Leadership");
        System.out.println("Exit");

        List<String> options = List.of("behavioural", "technical", "leadership", "exit");

        
        Scanner userInput = new Scanner(System.in);

        System.out.print("Type your category: ");

        String category = userInput.nextLine();
        category = category.trim().toLowerCase();

        if (!options.contains(category)) {
            System.out.println("please check your spelling");
            userInput.close();
            return;
        }

        if (category.equals("behavioural")) {
            System.out.println("Tell me about a time you solved a difficult problem.\n");
            System.out.println("Type your answer: ");

            String behaveInput = userInput.nextLine();
        } 
        
        else if (category.equals("technical")) {
            System.out.println("Explain one Java concept you understand well.\n");
            System.out.println("Type your answer: ");
            String techInput = userInput.nextLine();
            
        } 
        
        else if (category.equals("leadership")) {
            System.out.println("Tell me about a time you supported someone else.\n");
            System.out.println("Type your answer: ");
            String leadInput = userInput.nextLine();
        } 
        
        else if (category.equals("exit")) {
            System.out.println("Exited.");
        }

        userInput.close();

    }

}
