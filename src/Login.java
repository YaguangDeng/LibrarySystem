package librarySystem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame {

public static void main(String[] args) {
Login frameTabel = new Login();
}
JButton blogin = new JButton("Login");
JPanel panel = new JPanel();
JTextField txuser = new JTextField(15);
JPasswordField pass = new JPasswordField(15);

Login(){
super("LIBRARY");
setSize(870,760);
setLocation(500,200);
panel.setLayout (null);


txuser.setBounds(70,30,150,20);
pass.setBounds(70,65,150,20);
blogin.setBounds(110,100,80,20);

panel.add(blogin);
panel.add(txuser);
panel.add(pass);

getContentPane().add(panel);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);
actionlogin();
}

public void actionlogin(){
blogin.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent ae) {
String puname = txuser.getText();
String ppaswd = pass.getText();
if((puname.equals("user1") && ppaswd.equals("asd"))||((puname.equals("user2") && ppaswd.equals("1234")))){
newframe regFace =new newframe();
regFace.setVisible(true);
dispose();
}else if(puname.equals("admin") && ppaswd.equals("12345")){
newframe1 regFace =new newframe1();
regFace.setVisible(true);
dispose();
}else {
JOptionPane.showMessageDialog(null,"Wrong Password / Username");
txuser.setText("");
pass.setText("");
txuser.requestFocus();
}

}
});
}
}