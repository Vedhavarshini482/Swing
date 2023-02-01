import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Program2 {
	JFrame frame = new JFrame();
	JButton button = new JButton();
	JTextField text=new JTextField();
	JLabel label=new JLabel("User Name");
	
	public static void main(String[] args) {
		new Program2().start();		
	}
	private void start() {
		 text.setBounds(100,50, 150,20);
		button.setBounds(100, 120, 95, 30);
		frame.setBounds(300, 300, 500, 500);
		frame.add(button);
		frame.setLayout(null);
		frame.setVisible(true);
	}
}