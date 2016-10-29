import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class QuitButtonExample extends JFrame {
	// must extend JFrame
	public QuitButtonExample() {
	initUI();
	// we do this so that all the UI stuff is together
	}
	private void initUI() {
	JPanel panel = new JPanel();
	//create a JPanel –panels hold things
	getContentPane().add(panel);
	// add the panel to the JFrame
	panel.setLayout
	(null);
	//** see below
	JButton quitButton = new JButton("Quit");
	//create a button with the word quit on it
	quitButton.setBounds(50, 60, 80, 30);
	//** see below
	ActionListener x = new ActionListener(){
	@Override
	public void actionPerformed(ActionEvent event) {
	System.
	exit(0);
	}
	}
	;
	quitButton.addActionListener
	(
	x
	)
	;
	panel.add(quitButton);
	// add the button to the panel widget (object)
	setTitle("Quit button");
	setSize(
	300, 200);
	setLocationRelativeTo(null);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
	QuitButtonExample ex = new QuitButtonExample();
	ex.setVisible(true);
	}
}
