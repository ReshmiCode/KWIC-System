import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String [] args) {
        LineStorage input = new LineStorage();
        List<String> inputLines = input.getInput();
        System.out.println("Your input was: " + inputLines);

        CircularShift circularShift = new CircularShift(inputLines);
        List<String> circularlyShiftedLines = circularShift.circularShift();
        System.out.println("Circularly shifted lines lines are: " + circularlyShiftedLines);


        AlphabeticShift alphaShift = new AlphabeticShift(circularlyShiftedLines);
        List<String> alphaSortedLines = alphaShift.alphabetize();
        System.out.println("Final lines are: " + alphaSortedLines);


    }
}
