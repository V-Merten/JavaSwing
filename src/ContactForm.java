
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ContactForm extends JFrame {
    JTextField nameField, emailField;
    JRadioButton male, female;
    JCheckBox check;

    public ContactForm(){
        super("Contact form");
        super.setBounds(200, 100, 250, 230);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = super.getContentPane();
        container.setLayout(new GridLayout(5,2,2,10));

        JLabel name = new JLabel("Enter you're name:");
        nameField = new JTextField("", 1);
        JLabel email = new JLabel("Enter you're email:");
        emailField = new JTextField("@", 1);

        container.add(name);
        container.add(nameField);
        container.add(email);
        container.add(emailField);

        male = new JRadioButton("Male");
        female = new JRadioButton("Female");
        check = new JCheckBox("Agree?", false);
        JButton sendButton = new JButton("Send");

        male.setSelected(true);
        container.add(male);
        container.add(female);

        ButtonGroup group = new ButtonGroup();
        group.add(male);
        group.add(female);

        container.add(check);
        container.add(sendButton);

        sendButton.addActionListener(new ButtonEventManager());

    }

    class ButtonEventManager implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            String name = nameField.getText();
            String email = nameField.getText();

            String isMale = "Male";
            if (!male.isSelected())
                isMale = "Female";

            boolean checkBox = check.isSelected();

            JOptionPane.showMessageDialog(null,
                    "You're name: " + name + "\nYou're email: " + email + "\nYou're sex: " + isMale + "\nAre you agree?" + checkBox
                    ,"Hi " + name, JOptionPane.PLAIN_MESSAGE);


        }
    }

}