import java.time.LocalTime;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class WPMProgram {

    static List<String> words = Arrays.asList(
            "run", "table", "create", "sun", "jump", "cloud", "think", "book", "laugh", "river",
            "machine", "beautiful", "code", "keyboard", "mouse", "screen", "window", "light", "dream",
            "quick", "slow", "bright", "shadow", "flower", "forest", "travel", "space", "planet", "storm",
            "electric", "future", "simple", "complex", "energy", "smile", "memory", "moment", "power",
            "voice", "color", "design", "pattern", "circle", "square", "binary", "digital", "analog", "network"
    );

    public static void main(String[] args) throws InterruptedException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Typing test is starting...");
        countdown();

        String testLine = generateTestLine(words, 20);
        System.out.println("\nType the following line:");
        System.out.println(testLine);

        double start = LocalTime.now().toNanoOfDay();
        String typedLine = scan.nextLine();
        double end = LocalTime.now().toNanoOfDay();
        double elapsedTime = end - start;
        double seconds = elapsedTime / 1_000_000_000.0;

        int numChars = typedLine.length();
        double wpm = ((double) numChars / 5) / (seconds / 60);
        double accuracy = calculateAccuracy(testLine, typedLine);
        int correctWords = countCorrectWords(testLine, typedLine);

        System.out.printf("Time: %.2f seconds%n", seconds);
        System.out.printf("Your WPM (Words Per Minute): %.2f%n", wpm);
        System.out.printf("Accuracy: %.2f%%%n", accuracy);
        System.out.println("Correctly typed words: " + correctWords + "/" + testLine.split(" ").length);

        if (wpm > 60) {
            System.out.println("Great job! You're typing like a pro! 🚀");
        } else if (wpm > 30) {
            System.out.println("Good speed! Keep practicing! 👍");
        } else {
            System.out.println("Don't worry, you'll get faster with practice! 💪");
        }

        scan.close();
    }

    public static void countdown() throws InterruptedException {
        for (int i = 3; i > 0; i--) {
            System.out.println(i);
            TimeUnit.SECONDS.sleep(1);
        }
    }

    public static String generateTestLine(List<String> wordList, int count) {
        Random rand = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(wordList.get(rand.nextInt(wordList.size()))).append(" ");
        }
        return sb.toString().trim();
    }

    public static double calculateAccuracy(String original, String typed) {
        int correctChars = 0;
        for (int i = 0; i < Math.min(original.length(), typed.length()); i++) {
            if (original.charAt(i) == typed.charAt(i)) {
                correctChars++;
            }
        }
        return ((double) correctChars / original.length()) * 100;
    }

    public static int countCorrectWords(String original, String typed) {
        String[] originalWords = original.trim().split("\\s+");
        String[] typedWords = typed.trim().split("\\s+");

        int correct = 0;
        for (int i = 0; i < Math.min(originalWords.length, typedWords.length); i++) {
            if (originalWords[i].equals(typedWords[i])) {
                correct++;
            }
        }
        return correct;
    }
}
