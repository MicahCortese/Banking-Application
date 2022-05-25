import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class bankApp implements ActionListener {

	//Variables
	private int balance = 0;
	private int intput;
	private JLabel label1;
	private JLabel label2;
	private JLabel label3;
	private JFrame frame;
	private JPanel panel;
	private JTextField field;
	
	public bankApp(){					
		
			frame = new JFrame();
			frame.setSize(350, 200);
			
			//Current Balance Button
			JButton button1 = new JButton("Current Balance");
			button1.addActionListener(
					new ActionListener() {
						public void actionPerformed(ActionEvent event) {
							label2.setText("Current Balance: $" + balance);
						}
					}
			);
			
			//Deposit Button
			JButton button2 = new JButton("Deposit Funds");
			button2.addActionListener(
					new ActionListener() {
						public void actionPerformed(ActionEvent event) {
							intput = Integer.parseInt(field.getText()); 
							balance = balance + intput;
							label2.setText("Deposit Complete! +$" + intput);							
						}
					}
			);
			
			//Withdraw Button
			JButton button3 = new JButton("Withdraw Funds");
			button3.addActionListener(
					new ActionListener() {
						public void actionPerformed(ActionEvent event) {
							intput = Integer.parseInt(field.getText());
							balance = balance - intput;
							label2.setText("Withdraw Complete! -$" + intput);
						}
					}
			);
			
			//Exit Program Button
			JButton button4 = new JButton("Exit Online Banking"); 
			button4.addActionListener(
					new ActionListener() {
						public void actionPerformed(ActionEvent event) {
							System.exit(0);
						}
					}
			);
					

			// Labels
			label1 = new JLabel("Welcome to Online Banking");
			label2 = new JLabel("");
			label3 = new JLabel("Enter an amount:");
			label1.setBounds(10, 20, 80, 25);
			label2.setBounds(10, 20, 80, 25);
			label3.setBounds(10, 20, 80, 25);
			
			// Fields
			field = new JTextField(); //Integer Text Field
	        field.setBounds(100, 20, 165, 25);
	        
	        // Panels
			panel = new JPanel(); //Panel Details			
			panel.setBorder(BorderFactory.createEmptyBorder(60, 60, 60, 60));
			panel.setLayout(new GridLayout(0, 1));
			panel.add(label1);
			panel.add(label2);
			panel.add(button1);
			panel.add(button2);		
			panel.add(button3);
			panel.add(button4);
			panel.add(label3);
			panel.add(field);
			
			// Frames
			frame.add(panel, BorderLayout.CENTER); //Creates frame
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setTitle("Online Banking");
			frame.pack();
			frame.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		
		new bankApp();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}

}

