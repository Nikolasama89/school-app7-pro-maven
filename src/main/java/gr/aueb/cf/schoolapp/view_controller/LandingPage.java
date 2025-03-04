package gr.aueb.cf.schoolapp.view_controller;

import gr.aueb.cf.schoolapp.Main;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LandingPage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;


	public LandingPage() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(LandingPage.class.getResource("/images/eduv2.png")));
		setTitle("Ποιότητα στην Εκπαίδευση");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 820, 479);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(255, 255, 255));
		contentPane.setBackground(new Color(240, 240, 240));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel header = new JPanel();
		header.setBackground(new Color(0, 52, 117));
		header.setBounds(0, 0, 778, 56);
		contentPane.add(header);
		header.setLayout(null);
		
		JLabel govImage = new JLabel("");
		govImage.setIcon(new ImageIcon(LandingPage.class.getResource("/images/gov_logo_small.png")));
		govImage.setBounds(10, -3, 158, 56);
		header.add(govImage);
		
		JLabel lblAuthRequired = new JLabel("Απαιτείται ταυτοποίηση");
		lblAuthRequired.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblAuthRequired.setBounds(37, 87, 405, 68);
		contentPane.add(lblAuthRequired);
		
		JLabel lblMustConnect = new JLabel("Για να προχωρήσετε πρέπει να συνδεθείτε");
		lblMustConnect.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblMustConnect.setBounds(37, 148, 290, 56);
		contentPane.add(lblMustConnect);
		
		JButton btnConnect = new JButton("Σύνδεση");
		btnConnect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.getLandingPage().setVisible(false);
				Main.getLoginPage().setVisible(true);
			}
		});
		btnConnect.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnConnect.setEnabled(false);
		btnConnect.setForeground(new Color(255, 255, 255));
		btnConnect.setBackground(new Color(0, 128, 0));
		btnConnect.setBounds(37, 274, 122, 56);
		contentPane.add(btnConnect);
		
		JCheckBox privacyCheckBox = new JCheckBox("Δηλώνω οτι αποδέχομαι τη");
		privacyCheckBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				 if (e.getStateChange() == ItemEvent.SELECTED) {
					 btnConnect.setEnabled(true);
				 } else {
					 btnConnect.setEnabled(false);
				 }
			}
		});
		privacyCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 12));
		privacyCheckBox.setBounds(37, 210, 192, 21);
		contentPane.add(privacyCheckBox);
		
		JLabel lblPrivacy = new JLabel("Δήλωση Ιδιωτικότητας");
		lblPrivacy.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPrivacy.setForeground(new Color(0, 52, 117));
		lblPrivacy.setBounds(282, 210, 172, 21);
		contentPane.add(lblPrivacy);
		
		JPanel footer = new JPanel();
		footer.setBounds(0, 353, 785, 79);
		contentPane.add(footer);
		footer.setLayout(null);
		
		JLabel lblManual = new JLabel("Εγχειρίδιο χρήσης");
		lblManual.setForeground(new Color(0, 52, 117));
		lblManual.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblManual.setBounds(70, 24, 178, 45);
		footer.add(lblManual);
		
		JLabel lblQuestions = new JLabel("Συχνές Ερωτήσεις");
		lblQuestions.setForeground(new Color(0, 52, 117));
		lblQuestions.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblQuestions.setBounds(258, 24, 178, 45);
		footer.add(lblQuestions);
		
		JLabel lblSupport = new JLabel("Υποστήριξη Πολιτών");
		lblSupport.setForeground(new Color(0, 52, 117));
		lblSupport.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblSupport.setBounds(458, 24, 178, 45);
		footer.add(lblSupport);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 2, 746, 1);
		contentPane.add(separator);
	}
}
