import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextPane;

public class mymain {

	private JFrame frame;
	private JTextField a;
	private JTextField b;
	private JTextField c;
	private JTextField d;

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
		
		a = new JTextField();
		a.setBounds(10, 64, 86, 20);
		frame.getContentPane().add(a);
		a.setColumns(10);
		
		b = new JTextField();
		b.setColumns(10);
		b.setBounds(338, 64, 86, 20);
		frame.getContentPane().add(b);
		
		c = new JTextField();
		c.setColumns(10);
		c.setBounds(126, 64, 86, 20);
		frame.getContentPane().add(c);
		
		d = new JTextField();
		d.setColumns(10);
		d.setBounds(233, 64, 86, 20);
		frame.getContentPane().add(d);
		
		JButton btnScrabble = new JButton("Scrabble");
		btnScrabble.setBounds(166, 120, 89, 23);
		frame.getContentPane().add(btnScrabble);
		
		JTextPane Output = new JTextPane();
		Output.setBounds(30, 169, 372, 63);
		frame.getContentPane().add(Output);
		
		btnScrabble.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tile t1 = new Tile(a.getText().charAt(0));
				Tile t2 = new Tile(b.getText().charAt(0));
				Tile t3 = new Tile(c.getText().charAt(0));
				Tile t4 = new Tile(d.getText().charAt(0));
				Tile[] ta = {t1, t2, t3, t4};
				TileArray tiles = new TileArray(ta);
				Output.setText(tiles.scrabble(tiles, 0, tiles.length()-1));
			}
		});
	}
	
}
