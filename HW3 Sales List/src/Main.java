import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JEditorPane;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollBar;
import javax.swing.JSpinner;
import javax.swing.JScrollPane;

public class Main {

	private JFrame frame;
	private JTextField itemName;
	private JTextField itemPrice;
	private JTextField itemQuantity;
	private JLabel lblCost;
	private JLabel lblQuantity;
	private JTextField totalPrice;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
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
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 341);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextPane txtpnSalesList = new JTextPane();
		txtpnSalesList.setBackground(new Color(192, 192, 192));
		txtpnSalesList.setContentType("text/html");
		txtpnSalesList.setEditable(false);
		txtpnSalesList.setText("<h2><center>Sales List</center></h2>");

		txtpnSalesList.setBounds(0, 0, 434, 40);
		frame.getContentPane().add(txtpnSalesList);
		
		itemName = new JTextField();
		itemName.setBounds(111, 69, 248, 20);
		frame.getContentPane().add(itemName);
		itemName.setColumns(10);
		
		itemPrice = new JTextField();
		itemPrice.setColumns(10);
		itemPrice.setBounds(111, 100, 126, 20);
		frame.getContentPane().add(itemPrice);
		
		itemQuantity = new JTextField();
		itemQuantity.setColumns(10);
		itemQuantity.setBounds(111, 131, 126, 20);
		frame.getContentPane().add(itemQuantity);
		
		JLabel lblItem = new JLabel("Item:");
		lblItem.setBounds(42, 72, 46, 14);
		frame.getContentPane().add(lblItem);
		
		lblCost = new JLabel("Cost: $");
		lblCost.setBounds(42, 103, 46, 14);
		frame.getContentPane().add(lblCost);
		
		lblQuantity = new JLabel("Quantity:");
		lblQuantity.setBounds(42, 134, 59, 14);
		frame.getContentPane().add(lblQuantity);
		
		JButton btnAddToList = new JButton("Add Item to Sales List");
		btnAddToList.setBounds(52, 162, 248, 20);
		frame.getContentPane().add(btnAddToList);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(42, 196, 333, 64);
		frame.getContentPane().add(scrollPane);
		
		JTextArea textAreaOutput = new JTextArea();
		textAreaOutput.setEditable(false);
		scrollPane.setViewportView(textAreaOutput);
		
		totalPrice = new JTextField();
		totalPrice.setEditable(false);
		totalPrice.setBounds(133, 268, 86, 20);
		frame.getContentPane().add(totalPrice);
		totalPrice.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Total Sales:");
		lblNewLabel.setBounds(42, 271, 81, 14);
		frame.getContentPane().add(lblNewLabel);
		
		SalesSlip list = new SalesSlip(); 
		
		btnAddToList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = itemName.getText();
				double price = Double.parseDouble(itemPrice.getText());
				if (price >= 100 ) {
					textAreaOutput.setText("Items price must be less than $100");
					return;
				}

				int quantity = Integer.parseInt(itemQuantity.getText());
				itemName.setText("");
				itemPrice.setText("");
				itemQuantity.setText("");
				list.add(name, price, quantity);
				
				textAreaOutput.setText(list.toString());
				totalPrice.setText(list.salesString());
			}
		});
	}
	
}
