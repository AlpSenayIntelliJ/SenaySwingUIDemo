import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MainGUIWindow extends JFrame implements ActionListener, KeyListener {
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
        setLocation(500,50);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        sendButton.addActionListener(this);
        clickMeForAButton.addActionListener(this);
        textField1.addKeyListener(this);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source instanceof JButton) {
            JButton button = (JButton) source;
            String text = button.getText();

            if (text.equals("Send")) {
                myTextArea.append("send button clicked! ");
            } else {
                myTextArea.append("bottom button clicked! ");
            }
        }
    }

    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    public void keyReleased(KeyEvent e) {

    }
}
