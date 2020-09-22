import java.util.ArrayList;
import java.util.List;

public class CircularShift {

    List<String> lines;
    public static String DELIMITER = " ";

    public CircularShift(List<String> lines) {
        this.lines = lines;
    }

    public List<String> circularShift() {
        List<String> circularList = new ArrayList<>();

        for (int inputlength = 0; inputlength < lines.size(); inputlength++ ) {
            String[] words = lines.get(inputlength).split(DELIMITER);
            circularList.add(lines.get(inputlength));

            for (int i = 1; i < words.length; i++) {
                circularList.add(getShiftedLine(i, words));
            }
        }
        return circularList;
    }

    private String getShiftedLine(int index, String[] words) {
        StringBuilder builder = new StringBuilder();
        for (int i = index; i < words.length; i++) {
            builder.append(words[i]);
            builder.append(DELIMITER);
        }
        for (int i = 0; i < index; i++) {
            builder.append(words[i]);
            builder.append(DELIMITER);
        }
        if (builder.length() > 0) {
            builder.deleteCharAt(builder.length() - 1);
        }
        return builder.toString();
    }

}

