import java.awt.Font;

import javax.swing.*;

public class AbsoluteExample extends JFrame {  

    public AbsoluteExample() {  

        initUI();  

    }  

    public final void initUI() {  //final means we can’t override this function  

        setLayout(null);  // means we’re positioning absolutely  

  

        JButton ok = new JButton("OK");  

        ok.setBounds(0, 50, 120, 80);   

        // The parameters are the x and y location and then the width and the   

        // height of the button    

        JButton close = new JButton("Close");  

        close.setBounds(150, 50, 120, 80);  

  

        add(ok);  // add the ok button to the JFrame  

        add(close);  // add the close button to the JFrame
        Font f = new Font("Arial",Font.BOLD, 26);
        ok.setFont(f);
        close.setFont(f);

        setTitle("Absolute positioning");  

        setSize(300, 250);  

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  

        setLocationRelativeTo(null);  

    }  

    public static void main(String[] args) {  

        AbsoluteExample ex = new AbsoluteExample();  

        ex.setVisible(true);  

    }       }  