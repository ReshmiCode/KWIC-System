import java.util.Collections;
import java.util.List;

public class AlphabeticShift {
    List<String> lines;

    public AlphabeticShift(List<String> lines) {
        this.lines = lines;
    }

    public List<String> alphabetize() {
        Collections.sort(lines);
        return lines;
    }
}
