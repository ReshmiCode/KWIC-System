import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LineStorage {
    List<URL> inputs;
    Scanner sc;

    public LineStorage() {
        sc = new Scanner(System.in);
    }

    public List<URL> getInput() {
        inputs = new ArrayList<>();
        FileReader reader = new FileReader("input.txt");
		Scanner inputFile = new Scanner(reader);
		while (inputFile.hasNextLine()) {
			String line = inputFile.nextLine();
            String [] parts = line.split("\t");
            inputs.add(new URL(parts[0], parts[1]));
		}
		inputFile.close();
        return inputs;
    }

    public List<String> getDesc() {
        List<String> desc = new ArrayList<>();
        for(int i = 0; i < inputs.size(); i++) {
            desc.add(inputs.get(i).getDesc());
        }
        return desc;
    }
}
