import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String [] args) {
        LineStorage input = new LineStorage();
        List<String> inputLines = input.getInput();
        System.out.println("Your input was: " + inputLines);

        AlphabeticShift alphaShift = new AlphabeticShift(inputLines);
        List<String> alphaSortedLines = alphaShift.alphabetize();
        System.out.println("Final lines are: " + alphaSortedLines);
    }
}
