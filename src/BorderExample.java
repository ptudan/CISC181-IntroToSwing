import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Insets;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class BorderExample extends JFrame {  
    public BorderExample() {  
        initUI();  
    }  
    public final void initUI() {  
        JPanel panel = new JPanel(new BorderLayout());  // here we’re using  
            // the BorderLayout, which lets us put a panel inside a panel  
        JPanel top = new JPanel();  // we’re creating a second panel  
        top.setBackground(Color.gray);  // setting the background color  
        top.setPreferredSize(new Dimension(250, 150));  
        panel.add(top);   //adding the top panel to the first panel  
        panel.setBorder(new EmptyBorder(new Insets(20, 20, 20, 20)));  
            // creating an invisible border 20 pixels wide  
        add(panel);  // adding the panel to the frame  
        pack();  // making the window fit around the elements in the window  
        setTitle("Border Example");  
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        setLocationRelativeTo(null);  
    }  
    public static void main(String[] args) {  
                BorderExample ex = new BorderExample();  
                ex.setVisible(true);  
    }  
}  