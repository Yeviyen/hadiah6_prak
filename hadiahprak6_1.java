package hadiahprak6_1;

import javax.swing.*;
 import java.awt.event.*;
public abstract class hadiahprak6_1 implements ActionListener{


private static void createAndShowGUI() {
JFrame frame = new JFrame ("I am a JFrame"); frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ; 
frame.setBounds (20, 30, 300, 100);
 frame.getContentPane ().setLayout (null);
 JButton butt=new JButton("click me");
  frame.getContentPane () .add (butt);
   butt.setBounds (20, 20, 200,20);

hadiahprak6_1 app = new hadiahprak6_1() {};
app.label = new JLabel("Clicks = 3");
 app. label.setBounds (20,40, 200, 20);
  frame.getContentPane () .add (app. label);

butt.addActionListener (app);
 frame.setVisible(true);
 }
 
public void actionPerformed (ActionEvent e)
{
clickCount--; 
label.setText ("Clicks = "+clickCount);
}
public static void main(String[] args) {
SwingUtilities.invokeLater(new Runnable() {
	 public void run() {
createAndShowGUI();
}
});
}
int clickCount=3;
 JLabel label;
 }