import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String [] args) {
        JFrame frame = new JFrame("Cyberminer");
        frame.setContentPane(new Cyberminer().contentPane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
