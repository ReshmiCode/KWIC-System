import java.util.ArrayList;
import java.util.List;

public class Controller {
    List<URL> inputLines;
    LineStorage input;
    CircularShift circularShift;
    AlphabeticShift alphaShift;
    List<String> alphaSortedLines;
    public static final String WITH_DELIMITER = "((?<=%1$s)|(?=%1$s))";

    public Controller() {
        input = new LineStorage();
        inputLines = input.getInput();
        // System.out.println("Your input was: " + inputLines);
        generateAlphaLines();
    }

    public void generateAlphaLines() {
        circularShift = new CircularShift(input.getDesc());
        List<String> circularlyShiftedLines = circularShift.circularShift();
        alphaShift = new AlphabeticShift(circularlyShiftedLines);
        alphaSortedLines = alphaShift.alphabetize();
    }

    // hows your&day-google|german|france&hello
    public List<URL> search(String input) {
        List<URL> results = new ArrayList<>();
        String [] params = input.split(String.format(WITH_DELIMITER, "&") + "|" + String.format(WITH_DELIMITER, "|"));
        for(int i = 0; i < inputLines.size(); i++) {
            
        }
        return results;
    }
}