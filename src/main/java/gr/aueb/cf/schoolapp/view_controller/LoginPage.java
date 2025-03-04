package gr.aueb.cf.schoolapp.view_controller;

import gr.aueb.cf.schoolapp.Main;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class LoginPage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField username;
	private JPasswordField password;


	/**
	 * Create the frame.
	 */
	public LoginPage() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(LoginPage.class.getResource("/images/eduv2.png")));
		setTitle("Αυθεντικοποίηση Χρήστη");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 603, 425);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Σύνδεση");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(211, 57, 132, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Παρακαλώ εισάγετε τους κωδικούς σας για να συνδεθείτε");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(75, 93, 405, 34);
		contentPane.add(lblNewLabel_1);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(128, 128, 255));
		separator.setBounds(42, 125, 427, 2);
		contentPane.add(separator);
		
		JLabel lblNewLabel_2 = new JLabel("Χρήστης:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(146, 137, 122, 27);
		contentPane.add(lblNewLabel_2);
		
		username = new JTextField();
		username.setBounds(146, 162, 197, 27);
		contentPane.add(username);
		username.setColumns(10);
		
		JLabel lblNewLabel_2_1 = new JLabel("Κωδικός:");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2_1.setBounds(146, 202, 122, 27);
		contentPane.add(lblNewLabel_2_1);
		
		password = new JPasswordField();
		password.setBounds(146, 229, 197, 27);
		contentPane.add(password);
		
		JButton btnConnect = new JButton("Σύνδεση");
		btnConnect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if ((username.getText().matches("[aA]dmin")) && (Arrays.equals(password.getPassword(), "12345".toCharArray()))) {
					Main.getLoginPage().setVisible(false);
					Main.getDashboard().setVisible(true);
				} else {
					JOptionPane.showMessageDialog(null, "Λάθος username ή password", "Αδυναμία Σύνδεσης", JOptionPane.ERROR_MESSAGE);
					username.setText("");
					password.setText("");
				}
			}
		});
		btnConnect.setForeground(new Color(255, 255, 255));
		btnConnect.setBackground(new Color(0, 0, 247));
		btnConnect.setBounds(146, 295, 197, 34);
		contentPane.add(btnConnect);
		
	}
}
