import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.EmptyBorder;

public class InfoForm extends JFrame {

	private JPanel mainPane;
	
	public InfoForm() {
		
		setIconImage(Toolkit.getDefaultToolkit().getImage("src/tail.png"));
		setTitle("Info");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		setSize(800, 600);
		setLocationRelativeTo(null);
		mainPane = new JPanel();
		mainPane.setBackground(new Color(0, 0, 0));
		mainPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(mainPane);
		mainPane.setLayout(null);
		
		JLabel profileIcon = new JLabel();
		profileIcon.setHorizontalAlignment(SwingConstants.CENTER);
		profileIcon.setIcon(new ImageIcon("src/profile.png"));
		profileIcon.setForeground(new Color(255, 255, 255));
		profileIcon.setBounds(56, 27, 129, 129);
		mainPane.add(profileIcon);
		
		JLabel backBtn = new JLabel();		
		backBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		backBtn.setIcon(new ImageIcon("src/back.png"));
		backBtn.setBounds(40, 490, 32, 32);
		mainPane.add(backBtn);
		
		JLabel edit = new JLabel();
		edit.setIcon(new ImageIcon("src/edit.png"));
		edit.setBounds(673, 37, 32, 32);
		mainPane.add(edit);
		
		PanelRound panel = new main.PanelRound();
		panel.setRoundTopLeft(50);
		panel.setRoundTopRight(50);
		panel.setRoundBottomRight(50);
		panel.setRoundBottomLeft(50);
		panel.setBackground(new Color(60, 187, 200));
		panel.setBounds(205, 37, 458, 500);
		mainPane.add(panel);
		panel.setLayout(null);
		
		JLabel usernameLabel = new JLabel();
		usernameLabel.setText("Username:");
		usernameLabel.setForeground(new Color(255, 255, 255));
		usernameLabel.setFont(new Font("Hall Fetica", Font.PLAIN, 20));
		usernameLabel.setBounds(21, 36, 99, 33);
		panel.add(usernameLabel);
		
		JLabel username = new JLabel();
		username.setText("Yangge");
		username.setForeground(Color.WHITE);
		username.setFont(new Font("Hall Fetica", Font.PLAIN, 20));
		username.setBounds(140, 36, 251, 33);
		panel.add(username);
		
		JLabel passwordLabel = new JLabel();
		passwordLabel.setText("Password:");
		passwordLabel.setForeground(Color.WHITE);
		passwordLabel.setFont(new Font("Hall Fetica", Font.PLAIN, 20));
		passwordLabel.setBounds(21, 99, 99, 33);
		panel.add(passwordLabel);
		
		JLabel password = new JLabel();
		password.setText("*********");
		password.setForeground(Color.WHITE);
		password.setFont(new Font("Hall Fetica", Font.PLAIN, 20));
		password.setBounds(140, 99, 251, 33);
		panel.add(password);
		
		JLabel nameLabel = new JLabel();
		nameLabel.setText("Name:");
		nameLabel.setForeground(Color.WHITE);
		nameLabel.setFont(new Font("Hall Fetica", Font.PLAIN, 20));
		nameLabel.setBounds(21, 156, 99, 33);
		panel.add(nameLabel);
		
		JLabel name = new JLabel("Maria Bea Nicole M. Nocum");
		name.setForeground(Color.WHITE);
		name.setFont(new Font("Hall Fetica", Font.PLAIN, 20));
		name.setBounds(140, 156, 251, 33);
		panel.add(name);
		
		JLabel birthdayLabel = new JLabel();
		birthdayLabel.setText("Birthday:");
		birthdayLabel.setForeground(Color.WHITE);
		birthdayLabel.setFont(new Font("Hall Fetica", Font.PLAIN, 20));
		birthdayLabel.setBounds(21, 226, 99, 33);
		panel.add(birthdayLabel);
		
		JLabel birthday = new JLabel("12/08/2001");
		birthday.setForeground(Color.WHITE);
		birthday.setFont(new Font("Hall Fetica", Font.PLAIN, 20));
		birthday.setBounds(140, 226, 251, 33);
		panel.add(birthday);
		
		JLabel addressLabel = new JLabel();
		addressLabel.setText("Address:");
		addressLabel.setForeground(Color.WHITE);
		addressLabel.setFont(new Font("Hall Fetica", Font.PLAIN, 20));
		addressLabel.setBounds(21, 281, 99, 33);
		panel.add(addressLabel);
		
		JLabel address = new JLabel();
		address.setText("<HTML>116 int. 13 M Hizon Street Brgy. 64 Caloocan City</HTML>");
		address.setForeground(Color.WHITE);
		address.setFont(new Font("Hall Fetica", Font.PLAIN, 20));
		address.setBounds(140, 270, 308, 44);
		panel.add(address);
		
		JLabel genderLabel = new JLabel();
		genderLabel.setText("Gender:");
		genderLabel.setForeground(Color.WHITE);
		genderLabel.setFont(new Font("Hall Fetica", Font.PLAIN, 20));
		genderLabel.setBounds(21, 336, 99, 33);
		panel.add(genderLabel);
		
		JLabel gender = new JLabel();
		gender.setText("Female");
		gender.setForeground(Color.WHITE);
		gender.setFont(new Font("Hall Fetica", Font.PLAIN, 20));
		gender.setBounds(140, 336, 308, 33);
		panel.add(gender);
		
		JLabel civilstatusLabel = new JLabel();
		civilstatusLabel.setText("<HTML>Civil Status:</HTML>");
		civilstatusLabel.setForeground(Color.WHITE);
		civilstatusLabel.setFont(new Font("Hall Fetica", Font.PLAIN, 20));
		civilstatusLabel.setBounds(21, 380, 99, 43);
		panel.add(civilstatusLabel);
		
		JLabel civilstatus = new JLabel();
		civilstatus.setText("Single");
		civilstatus.setForeground(Color.WHITE);
		civilstatus.setFont(new Font("Hall Fetica", Font.PLAIN, 20));
		civilstatus.setBounds(140, 390, 308, 33);
		panel.add(civilstatus);
		
		JLabel citizenshipLabel = new JLabel();
		citizenshipLabel.setText("Citizenship:");
		citizenshipLabel.setForeground(Color.WHITE);
		citizenshipLabel.setFont(new Font("Hall Fetica", Font.PLAIN, 20));
		citizenshipLabel.setBounds(21, 445, 99, 33);
		panel.add(citizenshipLabel);
		
		JLabel citizenship = new JLabel();
		citizenship.setText("Filipino");
		citizenship.setForeground(Color.WHITE);
		citizenship.setFont(new Font("Hall Fetica", Font.PLAIN, 20));
		citizenship.setBounds(140, 445, 308, 33);
		panel.add(citizenship);
		
		backBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent evt) {
				backBtnmouseClicked(evt);
			}
		});
		
	}
	
	private void backBtnmouseClicked(java.awt.event.MouseEvent evt) {
		this.dispose();
		new MainMenuForm().setVisible(true);
	}
	
	public static void main(String[] args) {
		new InfoForm().setVisible(true);;
	}
}
