import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Java Swing Application");
        JPanel panel = new JPanel();
        panel.setLayout( new BoxLayout(panel, BoxLayout.Y_AXIS));

        JLabel label = new JLabel("Lập trình Java Swing");
        label.setFont(new Font ("Arial", Font.BOLD,16));
        label.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));
        panel.add(label);


        JPanel panelName = new JPanel();
        panelName.setLayout( new BoxLayout(panelName, BoxLayout.X_AXIS));
        panelName.setBorder(BorderFactory.createEmptyBorder(50,50,0,0));
        panelName.setMaximumSize(new Dimension(400,100));
        JLabel labelName = new JLabel("Tên đăng nhâp:");
        labelName.setFont(new Font ("Arial", Font.BOLD,12));
        labelName.setPreferredSize(new Dimension(100,70));
        labelName.setMinimumSize(new Dimension(100,70));
        panelName.add(labelName);
        JTextField textFieldName = new JTextField(30);
        String textName = textFieldName.getText();
        panelName.add(textFieldName);
        panel.add(panelName);


        JPanel panelPass = new JPanel();
        panelPass.setLayout(new BoxLayout(panelPass, BoxLayout.X_AXIS));
        panelPass.setBorder(BorderFactory.createEmptyBorder(10,50,0,0));
        panelPass.setMaximumSize(new Dimension(400,60));
        JLabel labelPass = new JLabel("Mật khẩu:");
        labelPass.setFont(new Font ("Arial", Font.BOLD,12));
        labelPass.setMinimumSize(new Dimension(100,70));
        labelPass.setPreferredSize(new Dimension(100,70));
        panelPass.add(labelPass);
        JPasswordField textFieldPass = new JPasswordField();
//        String textPass = textFieldPass.getText();
        panelPass.add(textFieldPass);
        panel.add(panelPass);



        JPanel panelButton = new JPanel();
        panelButton.setLayout(new BoxLayout(panelButton, BoxLayout.X_AXIS));
        panelButton.setMaximumSize(new Dimension(400,100));
        JButton button = new JButton("Đăng nhập");
        button.setBorder(BorderFactory.createEmptyBorder(0,320,0,0));
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Thông tin đăng nhập:\nTên đăng nhập: "+textFieldName.getText()+"\nMật khẩu: "+String.valueOf(textFieldPass.getPassword()));
            }
        });
        panelButton.add(button);
        panel.add(panelButton);


        frame.add(panel);
        frame.setSize(500,350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}