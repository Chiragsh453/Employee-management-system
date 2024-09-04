
package employee.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Splash extends JFrame implements ActionListener{
     JButton clickhere;
Splash()
        
       
{
    setLayout(null);
    setTitle("Employee Management System");
    getContentPane().setBackground(Color.WHITE);
    
    JLabel heading =new JLabel("Employee Management System");
    heading.setBounds(150,20,1200,60);
    heading.setFont(new Font("serif",Font.PLAIN,55));
    heading.setForeground(Color.red);
    add(heading);
    
    ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/front.jpg"));
    Image i2=i1.getImage().getScaledInstance(1100, 600, Image.SCALE_DEFAULT);
    ImageIcon i3=new ImageIcon(i2);
    JLabel image =new JLabel(i3);
    image.setBounds(50, 100, 880, 500);
    add(image);
    
    clickhere =new JButton("Click here to Continue");
    clickhere.setBounds(250,400,300,40);
    clickhere.setBackground(Color.BLACK);
    clickhere.setForeground(Color.WHITE);
    clickhere.addActionListener(this);
    image.add(clickhere);
     

    setSize(1000,650);
    setVisible(true);
    setLocation(20,30);
    
    while(true)
    {
    heading.setVisible(false);
    try{
    Thread.sleep(500);
    }
    catch(Exception e){
    
    }
    
    heading.setVisible(true);
     try{
    Thread.sleep(500);
    }
    catch(Exception e){
    
    }
    }
}  
public void actionPerformed(ActionEvent ae)
{
setVisible(false);
new Login();
}
    
    public static void main(String[] args) {
       new Splash();       
    }
    
}
