package TechnichalTraining;
import javax.swing.*;
import java.awt.event.*;

public class Stu {
    JFrame jf;
    JTextField f1, f3, f4, f5;
    JLabel l1, l2, l3, l4, l5, l6;
    JRadioButton r1, r2;
    JPasswordField p;
    JButton b;
    ButtonGroup bg;

    public Stu() {
        jf = new JFrame("Student Management System");
        jf.setSize(400, 400);
        jf.setLayout(null);

        l1 = new JLabel("UserID:");
        l1.setBounds(50, 30, 100, 20);
        jf.add(l1);

        f1 = new JTextField();
        f1.setBounds(150, 30, 150, 20);
        jf.add(f1);

        l2 = new JLabel("Password:");
        l2.setBounds(50, 60, 100, 20);
        jf.add(l2);

        p = new JPasswordField();
        p.setBounds(150, 60, 150, 20);
        jf.add(p);

        l3 = new JLabel("Name:");
        l3.setBounds(50, 90, 100, 20);
        jf.add(l3);

        f3 = new JTextField();
        f3.setBounds(150, 90, 150, 20);
        jf.add(f3);

        l4 = new JLabel("Gender:");
        l4.setBounds(50, 120, 100, 20);
        jf.add(l4);

        r1 = new JRadioButton("Male");
        r1.setBounds(150, 120, 70, 20);
        jf.add(r1);

        r2 = new JRadioButton("Female");
        r2.setBounds(230, 120, 80, 20);
        jf.add(r2);

        bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);

        l5 = new JLabel("Email ID:");
        l5.setBounds(50, 150, 100, 20);
        jf.add(l5);

        f4 = new JTextField();
        f4.setBounds(150, 150, 150, 20);
        jf.add(f4);

        l6 = new JLabel("Phone:");
        l6.setBounds(50, 180, 100, 20);
        jf.add(l6);

        f5 = new JTextField();
        f5.setBounds(150, 180, 150, 20);
        jf.add(f5);

        b = new JButton("Show Data");
        b.setBounds(150, 220, 120, 30);
        jf.add(b);

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String userID = f1.getText();
                String password = new String(p.getPassword());
                String name = f3.getText();
                String gender = r1.isSelected() ? "Male" : r2.isSelected() ? "Female" : "Not Selected";
                String email = f4.getText();
                String phone = f5.getText();
                
                String message = "UserID: " + userID + "\nPassword: " + password + "\nName: " + name +
                        "\nGender: " + gender + "\nEmail ID: " + email + "\nPhone: " + phone;
                
                JOptionPane.showMessageDialog(jf, message, "User Information", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
    }

    public static void main(String args[]) {
        new Stu();
    }
}
