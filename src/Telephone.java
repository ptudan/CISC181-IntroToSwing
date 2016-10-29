import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Telephone extends JFrame {
	public Telephone(){
		initUI();
	}
	
	private final void initUI(){
        JPanel panel = new JPanel();  
        //panel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        add(panel);
        panel.add(Box.createVerticalGlue());
        
        JPanel textZone = new JPanel();
        JLabel text = new JLabel("");
        text.setPreferredSize(new Dimension(480, 20));
        textZone.add(text);
        panel.add(textZone);
        
        JPanel numberZone = new JPanel();
        numberZone.setLayout(new GridLayout(4, 3, 5, 5));
        
        ImageIcon oneI = new ImageIcon("onep.png");
        JButton oneB = new JButton(oneI);
        oneB.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent event){
        		text.setText(text.getText()+"1");
        	}
        });
        numberZone.add(oneB);
        
        ImageIcon twoI = new ImageIcon("twop.png");
        JButton twoB = new JButton(twoI);
        twoB.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent event){
        		text.setText(text.getText()+"2");
        	}
        });
        numberZone.add(twoB);
        
        ImageIcon threeI = new ImageIcon("threep.png");
        JButton threeB = new JButton(threeI);
        threeB.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent event){
        		text.setText(text.getText()+"3");
        	}
        });
        numberZone.add(threeB);
  
        ImageIcon fourI = new ImageIcon("fourp.png");
        JButton fourB = new JButton(fourI);
        fourB.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent event){
        		text.setText(text.getText()+"4");
        	}
        });
        numberZone.add(fourB);
        
        ImageIcon fiveI = new ImageIcon("fivep.png");
        JButton fiveB = new JButton(fiveI);
        fiveB.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent event){
        		text.setText(text.getText()+"5");
        	}
        });
        numberZone.add(fiveB);
        
        ImageIcon sixI = new ImageIcon("sixp.png");
        JButton sixB = new JButton(sixI);
        sixB.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent event){
        		text.setText(text.getText()+"6");
        	}
        });
        numberZone.add(sixB);
        
        ImageIcon sevenI = new ImageIcon("sevenp.png");
        JButton sevenB = new JButton(sevenI);
        sevenB.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent event){
        		text.setText(text.getText()+"7");
        	}
        });
        numberZone.add(sevenB);
        
        ImageIcon eightI = new ImageIcon("eightp.png");
        JButton eightB = new JButton(eightI);
        eightB.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent event){
        		text.setText(text.getText()+"8");
        	}
        });
        numberZone.add(eightB);
        
        ImageIcon nineI = new ImageIcon("ninep.png");
        JButton nineB = new JButton(nineI);
        nineB.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent event){
        		text.setText(text.getText()+"9");
        	}
        });
        numberZone.add(nineB);
        
        JLabel empty = new JLabel();
        numberZone.add(empty);
        
        ImageIcon zeroI = new ImageIcon("zerop.png");
        JButton zeroB = new JButton(zeroI);
        zeroB.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent event){
        		text.setText(text.getText()+"0");
        	}
        });
        numberZone.add(zeroB);
        
        JButton dash = new JButton("Submit");
        Font f = new Font("Arial",Font.BOLD, 20);
        dash.setFont(f);
        dash.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent event){
        		boolean isNums = false;
        		String txt = text.getText();
        		char[] chars = {'0','1','2','3','4','5','6','7','8','9'};
        		for(char c : chars){
        			if(txt.charAt(0)==c){
        				isNums = true;
        			}
        			
        		}
        		if(isNums){
        		Wordlist iLoveCopyPasting = new Wordlist("mostcommonwords.txt");
        		String temp = iLoveCopyPasting.nToW(text.getText());
        		temp += ", Click submit again to reset";
        		text.setText(temp);
        		}
        		else{
        			text.setText("");
        		}
        	}
        });
        numberZone.add(dash);
        
        panel.add(numberZone);
        setTitle("Telephone");
        setSize(500, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
	}
	
    public static void main(String[] args) {  
        Telephone t = new Telephone();  
        t.setVisible(true);  
    }  
}
