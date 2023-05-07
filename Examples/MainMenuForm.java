import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.EmptyBorder;

public class MainMenuForm extends JFrame {

	private JPanel mainPane;
	private LabelRound basicInfoBtnOff;
	private LabelRound homeBtnOff;
	private LabelRound LogoutBtnOff;
	private LabelRound basicInfoBtnOn;
	private LabelRound homeBtnOn;
	private LabelRound LogoutBtnOn;
	public JLabel nameLabel = new JLabel();
	
	public MainMenuForm() {
		
		setIconImage(Toolkit.getDefaultToolkit().getImage("src/tail.png"));
		setResizable(false);
		setTitle("Welcome");
		setSize(920, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 930, 600);
		setLocationRelativeTo(null);
		mainPane = new JPanel();
		mainPane.setBackground(Color.BLACK);
		mainPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(mainPane);
		mainPane.setLayout(null);
		
		JPanel RightPanel = new JPanel();
		RightPanel.setBackground(new Color(0, 0, 0));
		RightPanel.setBounds(272, 0, 642, 561);
		mainPane.add(RightPanel);
		RightPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel();
		lblNewLabel.setBackground(new Color(240, 240, 240));
		lblNewLabel.setIconTextGap(0);
		lblNewLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon("src/fish.gif"));
		lblNewLabel.setBounds(0, 0, 642, 561);
		RightPanel.add(lblNewLabel);
		
		JPanel LeftPanel = new JPanel();
		LeftPanel.setBackground(new Color(0, 0, 0));
		LeftPanel.setBounds(10, 0, 265, 561);
		mainPane.add(LeftPanel);
		LeftPanel.setLayout(null);
		
		nameLabel = new JLabel("New label");
		nameLabel.setForeground(new Color(241, 147, 129));
		nameLabel.setFont(new Font("Hall Fetica", Font.PLAIN, 32));
		nameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		nameLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		nameLabel.setBounds(0, 25, 247, 43);
		LeftPanel.add(nameLabel);
		
		basicInfoBtnOff = new LabelRound();
		basicInfoBtnOff.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		basicInfoBtnOff.setRoundTopRight(100);
		basicInfoBtnOff.setRoundBottomRight(100);
		basicInfoBtnOff.setRoundTopLeft(100);
		basicInfoBtnOff.setRoundBottomLeft(100);
		basicInfoBtnOff.setBackground(new Color(243, 245, 197));
		basicInfoBtnOff.setHorizontalTextPosition(SwingConstants.CENTER);
		basicInfoBtnOff.setHorizontalAlignment(SwingConstants.CENTER);
		ImageIcon basicIcon = new ImageIcon(new ImageIcon("src/info.png").getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
		basicInfoBtnOff.setIcon(basicIcon);
		basicInfoBtnOff.setBounds(47, 119, 153, 93);
		LeftPanel.add(basicInfoBtnOff);
		
		homeBtnOff = new LabelRound();
		homeBtnOff.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		homeBtnOff.setRoundTopRight(100);
		homeBtnOff.setRoundBottomRight(100);
		homeBtnOff.setRoundTopLeft(100);
		homeBtnOff.setRoundBottomLeft(100);
		homeBtnOff.setBackground(new Color(243, 245, 197));
		homeBtnOff.setHorizontalTextPosition(SwingConstants.CENTER);
		homeBtnOff.setHorizontalAlignment(SwingConstants.CENTER);
		ImageIcon homeIcon = new ImageIcon(new ImageIcon("src/home.png").getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
		homeBtnOff.setIcon(homeIcon);
		homeBtnOff.setBounds(47, 258, 153, 93);
		LeftPanel.add(homeBtnOff);		
		
		LogoutBtnOff = new LabelRound();
		LogoutBtnOff.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		LogoutBtnOff.setRoundTopRight(100);
		LogoutBtnOff.setRoundBottomRight(100);
		LogoutBtnOff.setRoundTopLeft(100);
		LogoutBtnOff.setRoundBottomLeft(100);
		LogoutBtnOff.setBackground(new Color(243, 245, 197));
		ImageIcon LogoutIcon = new ImageIcon(new ImageIcon("src/logout.png").getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
		LogoutBtnOff.setIcon(LogoutIcon);
		LogoutBtnOff.setHorizontalTextPosition(SwingConstants.CENTER);
		LogoutBtnOff.setHorizontalAlignment(SwingConstants.CENTER);
		LogoutBtnOff.setBounds(47, 415, 153, 93);
		LeftPanel.add(LogoutBtnOff);		
		
		basicInfoBtnOn = new LabelRound();
		basicInfoBtnOn.setIconTextGap(-5);
		basicInfoBtnOn.setHorizontalAlignment(SwingConstants.CENTER);
		basicInfoBtnOn.setText("INFO");
		basicInfoBtnOn.setFont(new Font("Pristina", Font.PLAIN, 24));
		basicInfoBtnOn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		basicInfoBtnOn.setRoundTopRight(100);
		basicInfoBtnOn.setRoundTopLeft(100);
		basicInfoBtnOn.setRoundBottomRight(100);
		basicInfoBtnOn.setRoundBottomLeft(100);
		ImageIcon basicIconOn = new ImageIcon(new ImageIcon("src/infoOn.png").getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
		basicInfoBtnOn.setIcon(basicIconOn);
		basicInfoBtnOn.setBackground(new Color(60, 187, 200));
		basicInfoBtnOn.setBounds(47, 119, 210, 93);
		basicInfoBtnOn.setVisible(false);
		LeftPanel.add(basicInfoBtnOn);
		
		homeBtnOn = new LabelRound();
		homeBtnOn.setIconTextGap(10);
		homeBtnOn.setText("HOME");
		homeBtnOn.setFont(new Font("Pristina", Font.PLAIN, 24));
		homeBtnOn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		homeBtnOn.setRoundTopRight(100);
		homeBtnOn.setRoundTopLeft(100);
		homeBtnOn.setRoundBottomRight(100);
		homeBtnOn.setRoundBottomLeft(100);
		homeBtnOn.setHorizontalAlignment(SwingConstants.CENTER);
		ImageIcon homeIconOn = new ImageIcon(new ImageIcon("src/homeOn.png").getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
		homeBtnOn.setIcon(homeIconOn);
		homeBtnOn.setBackground(new Color(60, 187, 200));
		homeBtnOn.setBounds(47, 258, 210, 93);
		homeBtnOn.setVisible(false);
		LeftPanel.add(homeBtnOn);
		
		LogoutBtnOn = new LabelRound();
		LogoutBtnOn.setFont(new Font("Pristina", Font.PLAIN, 24));
		LogoutBtnOn.setIconTextGap(10);
		LogoutBtnOn.setText("LOGOUT");		
		LogoutBtnOn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		LogoutBtnOn.setRoundTopRight(100);
		LogoutBtnOn.setRoundTopLeft(100);
		LogoutBtnOn.setRoundBottomRight(100);
		LogoutBtnOn.setRoundBottomLeft(100);
		LogoutBtnOn.setHorizontalAlignment(SwingConstants.CENTER);
		ImageIcon LogoutIconOn = new ImageIcon(new ImageIcon("src/logoutOn.png").getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
		LogoutBtnOn.setIcon(LogoutIconOn);
		LogoutBtnOn.setBackground(new Color(60, 187, 200));
		LogoutBtnOn.setBounds(47, 415, 210, 93);
		LogoutBtnOn.setVisible(false);
		LeftPanel.add(LogoutBtnOn);
		
		RightPanel.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent evt) {
				RightPanelMouseMoved(evt);
			}
		});
				
		basicInfoBtnOff.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent evt) {
				basicInfoBtnOffMouseMoved(evt);
			}
		});
				
		homeBtnOff.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent evt) {
				homeBtnOffMouseMoved(evt);
			}
		});
				
		LogoutBtnOff.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent evt) {
				LogoutBtnOffMouseMoved(evt);
			}
		});
				
		basicInfoBtnOn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent evt) {
				basicInfoBtnOnmouseClicked(evt);
			}
		});
		
		LogoutBtnOn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent evt) {
				LogoutBtnOnmouseClicked(evt);
			}
		});
	}
	
	private void basicInfoBtnOffMouseMoved(java.awt.event.MouseEvent evt) {
		basicInfoBtnOn.setVisible(true);
		basicInfoBtnOff.setVisible(false);
		homeBtnOn.setVisible(false);
		homeBtnOff.setVisible(true);
		LogoutBtnOn.setVisible(false);
		LogoutBtnOff.setVisible(true);
	}
	
	private void homeBtnOffMouseMoved(java.awt.event.MouseEvent evt) {
		basicInfoBtnOn.setVisible(false);
		basicInfoBtnOff.setVisible(true);
		homeBtnOn.setVisible(true);
		homeBtnOff.setVisible(false);
		LogoutBtnOn.setVisible(false);
		LogoutBtnOff.setVisible(true);		
	}
	
	private void LogoutBtnOffMouseMoved(java.awt.event.MouseEvent evt) {
		basicInfoBtnOn.setVisible(false);
		basicInfoBtnOff.setVisible(true);
		homeBtnOn.setVisible(false);
		homeBtnOff.setVisible(true);
		LogoutBtnOn.setVisible(true);
		LogoutBtnOff.setVisible(false);		
	}
	
	private void RightPanelMouseMoved(java.awt.event.MouseEvent evt) {
		basicInfoBtnOn.setVisible(false);		
		homeBtnOn.setVisible(false);
		LogoutBtnOn.setVisible(false);		
		basicInfoBtnOff.setVisible(true);
		homeBtnOff.setVisible(true);
		LogoutBtnOff.setVisible(true);		
	}
	
	private void basicInfoBtnOnmouseClicked(java.awt.event.MouseEvent evt) {
		this.dispose();
		new InfoForm().setVisible(true);
	}
	
	private void LogoutBtnOnmouseClicked(java.awt.event.MouseEvent evt) {
		this.dispose();
		new LoginForm().setVisible(true);
	}
	
	public static void main(String[] args) {
		new MainMenuForm().setVisible(true);;
	}
}
