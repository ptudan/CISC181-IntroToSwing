import java.awt.Dimension;

import javax.swing.*;

public class FlowLayoutExample extends JFrame {  

    public FlowLayoutExample() {
        initUI();  
    } 
    public final void initUI() {  
        JPanel panel = new JPanel();  
         // The implicit layout manager of a JPanel is FlowLayout  
        JTextArea area = new JTextArea("text area");  // creates a text area  
        area.setPreferredSize(new Dimension(150, 20)); //dimensions: 150x20  
        JButton button = new JButton("button1");  
        panel.add(button);  
        JButton button2 = new JButton("button2");  
        panel.add(button2);  //add everything to the panel  
        panel.add(area);  
        add(panel);  // add the panel to the JFrame  
        pack();//Makes the window fit around the components you put inside it  
        setTitle("FlowLayout Example");  
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );  
        setLocationRelativeTo(null );  //places the window in the middle of the screen  
    }  
    public static void main(String[] args) {  
                FlowLayoutExample ex = new FlowLayoutExample();  
                ex.setVisible(true);  
    }  

}