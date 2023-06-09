import javax.swing.*;
import java.awt.*;
import javax.swing.border.EmptyBorder;

public class LoginForm extends JFrame {

	private JPanel mainPane;
	private TxtfieldRound userTxtfield;
	private PasswordfieldRound passwordTxtfield;

	public LoginForm() {
		
		setIconImage(Toolkit.getDefaultToolkit().getImage("src/tail.png"));
		setSize(800, 600);
		setTitle("Portfolio");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		setLocationRelativeTo(null);
		mainPane = new JPanel();
		mainPane.setBackground(new Color(0, 0, 0));
		mainPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(mainPane);
		mainPane.setLayout(null);
		
		PanelRound loginPanel = new main.PanelRound();
		loginPanel.setRoundBottomRight(50);
		loginPanel.setRoundTopRight(50);
		loginPanel.setBounds(0, 243, 207, 114);
		loginPanel.setBackground(new Color(147, 237, 212));
		mainPane.add(loginPanel);
		loginPanel.setLayout(null);
		
		JLabel loginLabel = new JLabel();
		loginLabel.setText("Log In");
		loginLabel.setBounds(10, 11, 187, 92);
		loginLabel.setFont(new Font("Hall Fetica", Font.PLAIN, 64));
		loginLabel.setHorizontalAlignment(SwingConstants.CENTER);
		loginPanel.add(loginLabel);
		
		PanelRound mainPanel = new main.PanelRound();
		mainPanel.setRoundBottomLeft(100);
		mainPanel.setRoundBottomRight(100);
		mainPanel.setRoundTopRight(100);
		mainPanel.setRoundTopLeft(100);
		mainPanel.setBounds(273, 28, 459, 510);
		mainPanel.setBackground(new Color(147, 237, 212));
		mainPane.add(mainPanel);
		mainPanel.setLayout(null);
		
		JLabel LoginLogo = new JLabel();
		LoginLogo.setText(null);
		LoginLogo.setHorizontalAlignment(SwingConstants.CENTER);
		LoginLogo.setIcon(new ImageIcon("src/tail.png"));
		LoginLogo.setBounds(0, 0, 459, 128);
		mainPanel.add(LoginLogo);
		
		JLabel emailusernameLabel = new JLabel();
		emailusernameLabel.setText("Email/Username");
		emailusernameLabel.setForeground(new Color(241, 147, 129));
		emailusernameLabel.setFont(new Font("Hall Fetica", Font.PLAIN, 20));
		emailusernameLabel.setBounds(25, 203, 192, 22);
		mainPanel.add(emailusernameLabel);
	
		JLabel PasswordLabel = new JLabel();
		PasswordLabel.setText("Password");
		PasswordLabel.setForeground(new Color(241, 147, 129));
		PasswordLabel.setFont(new Font("Hall Fetica", Font.PLAIN, 20));
		PasswordLabel.setBounds(25, 312, 192, 22);
		mainPanel.add(PasswordLabel);
		
		userTxtfield = new TxtfieldRound();
		userTxtfield.setBackground(new Color(243, 245, 197));
		userTxtfield.setBounds(44, 236, 371, 50);
		userTxtfield.setRoundBottomLeft(50);
		userTxtfield.setRoundBottomRight(50);
		userTxtfield.setRoundTopRight(50);
		userTxtfield.setRoundTopLeft(50);
		mainPanel.add(userTxtfield);
		userTxtfield.setColumns(10);
		
		JLabel loginBtn1 = new JLabel();		
		loginBtn1.setIcon(new ImageIcon("src/log_in.png"));
		loginBtn1.setHorizontalAlignment(SwingConstants.CENTER);
		loginBtn1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		loginBtn1.setBounds(347, 419, 47, 50);
		mainPanel.add(loginBtn1);
				
		JLabel loginBtn2 = new JLabel();
		loginBtn2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		loginBtn2.setIcon(new ImageIcon("src/log_in.png"));
		loginBtn2.setHorizontalAlignment(SwingConstants.CENTER);
		loginBtn2.setBounds(317, 419, 42, 50);
		mainPanel.add(loginBtn2);
			
		passwordTxtfield = new PasswordfieldRound();
		passwordTxtfield.setBackground(new Color(243, 245, 197));
		passwordTxtfield.setBounds(44, 342, 371, 50);
		passwordTxtfield.setRoundBottomLeft(50);
		passwordTxtfield.setRoundBottomRight(50);
		passwordTxtfield.setRoundTopRight(50);
		passwordTxtfield.setRoundTopLeft(50);
		mainPanel.add(passwordTxtfield);
		
		loginBtn1.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				loginBtnMouseClicked(evt);
				}
			});
		
		loginBtn2.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				loginBtnMouseClicked(evt);
				}
			});	
	}
	
	private void loginBtnMouseClicked(java.awt.event.MouseEvent evt) {
		MainMenuForm go = new MainMenuForm();
		String user = userTxtfield.getText();
		String password = new String (passwordTxtfield.getPassword());
		System.out.println(user + " " +password);
		
		if(user.equals("Yangge") && (password.equals("betlog008"))){	
			this.dispose();
			go.setVisible(true);
			go.nameLabel.setText("Hi, "+user+"!");
		} else {
			JOptionPane.showMessageDialog(this.mainPane, "Incorrect Username/Email or Password entered.", "ERROR", JOptionPane.ERROR_MESSAGE);
			passwordTxtfield.setText(null);
			userTxtfield.setText(null);					
		}
	}
	
	public static void main(String[] args) {
		new LoginForm().setVisible(true);;
	}
}
