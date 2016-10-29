import javax.swing.*;
import java.awt.*;

public class TwoButtonsExample extends JFrame {  
    public TwoButtonsExample() {  
        initUI();  
    }  

    public final void initUI() {  
        JPanel basic = new JPanel();  
        basic.setLayout(new BoxLayout(basic, BoxLayout.Y_AXIS));  
           // means the components will be lined up vertically)  
        add(basic);  
        basic.add(Box.createVerticalGlue());  
           // makes the space between the boxes expandable  
  
        JPanel bottom = new JPanel();  
        bottom .setAlignmentX(1f);  // sets a right alignment  
        bottom.setLayout(new BoxLayout(bottom, BoxLayout.X_AXIS));  
           // horizontal layout  
  
        JButton ok = new JButton("OK");  
        JButton close = new JButton("Close");  
  
        bottom.add(ok);  
        bottom.add(Box.createRigidArea(new Dimension(5, 0)));  
           // adds rigid space to horizontal flow  
        bottom.add(close);  
        bottom.add(Box.createRigidArea(new Dimension(15, 0)));  
           // adds more horizontal space  
  
        basic.add(bottom);  
        basic .add(Box.createRigidArea(new Dimension(0, 15)));  
           // adds vertical space between bottom and actual bottom of JFrame  
  
        setTitle("Two Buttons");  
        setSize(300, 150);  
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        setLocationRelativeTo(null);  
    }  

    public static void main(String[] args) {  
        TwoButtonsExample ex = new TwoButtonsExample();  
        ex.setVisible(true);  
    }  

}  