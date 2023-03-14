import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TaskForm {
    private JPanel rootPanel;

    public TaskForm() {
        generateStringButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String finish = "Finished text: \nSurname, Name and Second Name: " + textFieldNSS.getText() + "\nAge: " + textFieldAge.getText() + "\nPhone number: " + textFieldPnobeNumber.getText();
                textArea1.setText(finish);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("TaskForm");
        frame.setContentPane(new TaskForm().rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private JTextField textFieldNSS;
    private JTextField textFieldPnobeNumber;
    private JTextField textFieldAge;
    private JLabel LabelNSS;
    private JLabel LabelAge;
    private JLabel LabelPhoneNumber;
    private JButton generateStringButton;
    private JTextArea textArea1;
}
