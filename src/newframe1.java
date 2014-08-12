
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class newframe1 extends JFrame {

public static void main(String[] args) {
newframe1 frameTabel = new newframe1();
}
String[] bookStrings = {"Adventure","Art","Biography","Children","Fiction","Fantasy","Horror","History","Music","Science" };
JLabel welcome = new JLabel("Welcome admin");
JButton bl = new JButton ("Books List");
JButton cl = new JButton ("Customers List ");
JComboBox cat = new JComboBox(bookStrings);
JPanel panel = new JPanel();

newframe1(){
super("ADMIN");
setSize(870,760);
setLocation(500,200);
panel.setLayout (null);


cl.setBounds(350,120,140,20);
bl.setBounds(350,160,140,20);
welcome.setBounds(365,50,150,60);
cat.setBounds(350, 210, 140, 20);

panel.add(welcome);
panel.add(bl);
panel.add(cl);
panel.add(cat);

getContentPane().add(panel);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);
}

}
