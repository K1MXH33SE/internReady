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

        List<String> tech = List.of(
                "analysed",
                "debugged",
                "tested",
                "verified",
                "implemented",
                "improved",
                "optimised",
                "documented",
                "reviewed",
                "refactored",
                "validated",
                "troubleshooted",
                "root cause",
                "edge cases");


        List<String> behave = List.of(
             // Behavioural
                "communicated",
                "listened",
                "collaborated",
                "adapted",
                "prioritised",
                "calm",
                "ownership",
                "followed up",
                "supported",
                "clarified",
                "resolved",
                "reflected"
        );

        List<String> leader = List.of(

                            // Leadership
                "led",
                "guided",
                "organised",
                "delegated",
                "motivated",
                "encouraged",
                "took initiative",
                "coordinated",
                "facilitated",
                "set expectations",
                "created structure",
                "mentored",
                "empowered",
                "accountability",

        
                "initiative",
                "communication",
                "teamwork",
                "problem-solving",
                "adaptability",
                "resilience",
                "attention to detail",
                "customer-focused",
                "solution-focused",
                "learning mindset"

        );


        int score = 0;

        Scanner userInput = new Scanner(System.in);

        System.out.print("Type your category: ");

        String category = userInput.nextLine();
        category = category.trim().toLowerCase();

        if (!options.contains(category)) {
            System.out.println("please check your spelling");
            userInput.close();
            return;
        }

        //behavioural segment

        if (category.equals("behavioural")) {
            System.out.println("Tell me about a time you solved a difficult problem.\n");
            System.out.println("Type your answer: ");

            String behaveInput = userInput.nextLine();
            behaveInput = behaveInput.toLowerCase();
            int wordCount = behaveInput.trim().split("\\s+").length;

            if(wordCount < 20){
                score -= 1;
            }

            for(String i : behave){
                if(behaveInput.contains(i)){
                    score += 1;
                }
            }

            System.out.println("Word count: " + wordCount);
            System.out.println("Score: " + score);
            userInput.close();
            return;
        }

        //techincal segment

        else if (category.equals("technical")) {
            System.out.println("Explain one Java concept you understand well.\n");
            System.out.println("Type your answer: ");


            String techInput = userInput.nextLine();
            techInput = techInput.toLowerCase();
            int wordCount = techInput.trim().split("\\s+").length;

            if(wordCount < 20){
                score -= 1;
            }

            for(String i : tech){
                if(techInput.contains(i)){
                    score += 1;
                }
            }
            System.out.println("Score: " + score);
            userInput.close();
            return;
        }

        //leadership seg
        else if (category.equals("leadership")) {
            System.out.println("Tell me about a time you supported someone else.\n");
            System.out.println("Type your answer: ");

            String leadInput = userInput.nextLine();
            leadInput = leadInput.toLowerCase();
            int wordCount = leadInput.trim().split("\\s+").length;

            if(wordCount < 20){
                score -= 1;
            }

            for(String i : leader){
                if(leadInput.contains(i)){
                    score += 1;
                }
            }
            System.out.println("Score: " + score);
            userInput.close();
            return;
        }

        else if (category.equals("exit")) {
            System.out.println("Exited.");
        }

        userInput.close();

    }

}
