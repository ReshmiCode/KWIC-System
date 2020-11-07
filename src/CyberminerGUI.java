import javax.swing.*;

public class CyberminerGUI extends JFrame {
    private JPanel mainPanel;
    private JTextField textField1;
    private JLabel lblTitle;
    private JLabel lblSearch;
    private JButton buttonSearch;
    private JList list1;
    Controller search;

    public CyberminerGUI() {
        super("Cyberminer");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
        search = new Controller();
    }

    public static void main(String [] args) {
        JFrame frame = new CyberminerGUI();
        frame.setVisible(true);
    }
}
