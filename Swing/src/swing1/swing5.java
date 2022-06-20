package swing1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class swing5 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField mid;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					swing5 frame = new swing5();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public swing5() { 
		/* Frame�� absolute ���·� layer�� �����մϴ�*/
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("���̵� üũ");
		
		btnNewButton.setFont(new Font("����ü", Font.PLAIN, 12));
		btnNewButton.setBounds(163, 65, 109, 23);
		contentPane.add(btnNewButton);
		
		
		JLabel msg = new JLabel("");
		msg.setFont(new Font("����ü", Font.PLAIN, 12));
		msg.setBounds(101, 161, 253, 15);
		contentPane.add(msg);
		
		mid = new JTextField();
		mid.setFont(new Font("����ü", Font.PLAIN, 12));
		mid.setBounds(165, 34, 107, 21);
		contentPane.add(mid);
		
		/* �ڵ鸵 class������Ʈ ���� ���� �ڵ忡 ������
		 *  �ش� ������Ʈ���ε����� ���մϴ�.*/
		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(mid.getText().equals("")){
					msg.setText("���̵� �Է����ּ���.");
				}
				else {
					int lg = mid.getText().length(); //�Է¹��� ������ Ȯ�� 
					if(lg<5) {
						msg.setText("���̵�� 5�� �̻� ��밡���մϴ�");  
					}
					else {
						msg.setText("���̵� ���� ���Դϴ�...");
					}
					
				}
				
			}
		});
	}
}
