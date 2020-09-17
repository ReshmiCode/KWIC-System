import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LineStorage {
    Scanner sc;
    public LineStorage() {
        sc = new Scanner(System.in);
    }

    public List<String> getInput() {
        System.out.println("Enter input lines one by one. When you're done enter a blank line to finish.");
        List<String> inputs = new ArrayList<String>();
        String userInput = sc.nextLine();
        while (!userInput.isEmpty()) {
            inputs.add(userInput);
            userInput = sc.nextLine();
        }
        return inputs;
    }
}
