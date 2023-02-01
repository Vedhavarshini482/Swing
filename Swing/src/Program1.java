import javax.swing.*;

public class Program1 extends JFrame{
	private static final long serialVersionUID = -2265977338524441208L;
	JButton button = new JButton("Login");
	JTextField text1=new JTextField();
	JTextField text2=new JPasswordField();
	JLabel label1=new JLabel("User Name");
	JLabel label2=new JLabel("Password");
	
	public static void main(String[] args) {
		new Program1().start();		
	}
	private void start() {
		//JFrame frame = new JFrame();
		this.setTitle("Instagram");
		 text1.setBounds(100,50, 150,20);
		 text2.setBounds(100,80, 150,20);
		button.setBounds(100, 120, 95, 30);
		label1.setBounds(20, 50, 80, 20);
		label2.setBounds(20, 80, 80, 20);
		this.add(text1);
		this.add(text2);
		this.add(label1);
		this.add(label2);
		this.add(button);
		this.setSize(400, 400);
		this.setLayout(null);
		this.setVisible(true);
	}
}