import java.awt.GridLayout;

import javax.swing.*;

public class GridLayoutExample extends JFrame {  
    String[] buttons={"Cls", "Bck", "", "Close", "7", "8", "9", "/", "4",  
            "5", "6", "*", "1", "2", "3", "-", "0", ".", "=", "+"};  
               // Note this is a field.  Yep, we can have fields  
    public GridLayoutExample() {  
        initUI();  
    }
    public final void initUI() {  
        JPanel panel = new JPanel();  
        panel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));  
            // setting a border empty, and 5 from the top, left, bottom, and right  
        panel.setLayout(new GridLayout(5, 4, 5, 5));  
            // number of rows, columns, horizontal, and vertical gap.    
            //** see below for more info  
        for (int i = 0; i < buttons.length; i++) {  
            if (i == 2)  
                panel.add(new JLabel(buttons[i]));  // making a label   
                       //** difference between label and button explained below  
            else  
                panel.add(new JButton(buttons[i]));  
        }  
        add(panel);  
        setTitle("GridLayout");  
        setSize(350, 300);  
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        setLocationRelativeTo(null);  
    }  
    public static void main(String[] args) {  
           GridLayoutExample ex = new GridLayoutExample();  
           ex.setVisible(true);  
    }  

}  