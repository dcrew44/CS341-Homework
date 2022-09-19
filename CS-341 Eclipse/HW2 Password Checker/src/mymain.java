import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.DropMode;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.UIManager;

/**
 * 
 * @author Hayden Barolette
 * @version 1.0
 *
 */
public class mymain {

	private JFrame frame;
	private JTextField inputField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mymain window = new mymain();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public mymain() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextArea txtrAppDescription = new JTextArea();
		txtrAppDescription.setEditable(false);
		txtrAppDescription.setFont(UIManager.getFont("Label.font"));
		txtrAppDescription.setWrapStyleWord(true);
		txtrAppDescription.setLineWrap(true);
		txtrAppDescription.setText("This is an app for calculating the strength of a password. Please input a password of a length no less than 8 characters, and no greater than 12.");
		txtrAppDescription.setBounds(71, 11, 308, 56);
		frame.getContentPane().add(txtrAppDescription);
		
		inputField = new JTextField();
		inputField.setBounds(92, 80, 109, 20);
		frame.getContentPane().add(inputField);
		inputField.setColumns(10);
		
		JLabel lblinputLabel = new JLabel("Password:");
		lblinputLabel.setBounds(10, 83, 72, 14);
		frame.getContentPane().add(lblinputLabel);
		
		JTextPane outputPane = new JTextPane();
		outputPane.setEditable(false);
		outputPane.setBounds(92, 169, 297, 56);
		frame.getContentPane().add(outputPane);
		
		JLabel lblOutputLabel = new JLabel("Output:");
		lblOutputLabel.setBounds(10, 169, 58, 14);
		frame.getContentPane().add(lblOutputLabel);
		
		JButton btnCheckPassword = new JButton("Check");
		
		btnCheckPassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Password password = new Password(inputField.getText());
				outputPane.setText((password.isValid()? password.strengthCheck():password.invalidpassword()));
			}
		});
		btnCheckPassword.setBounds(166, 111, 89, 23);
		frame.getContentPane().add(btnCheckPassword);
		
		
	}
}
