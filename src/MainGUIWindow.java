import javax.swing.*;

public class MainGUIWindow extends JFrame {
    private JPanel mainPanel;
    private JTextField textField1;
    private JButton sendButton;
    private JTextArea myTextArea;
    private JButton clickMeForAButton;

    public MainGUIWindow() {
        createUIComponents();
    }

    private void createUIComponents() {
        setContentPane(mainPanel);
        setTitle("My GUI!");
        setSize(900, 750);
        setLocation(400,225);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
