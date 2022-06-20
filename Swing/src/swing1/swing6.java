package swing1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.UIManager;
import java.awt.Font;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class swing6 extends JFrame {

	private JPanel contentPane;
	private JTextField tel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					swing6 frame = new swing6();
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
	public swing6() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tel = new JTextField();
		
		
		tel.setBorder(new LineBorder(new Color(171, 173, 179)));
		tel.setFont(new Font("\uB3CB\uC6C0\uCCB4", tel.getFont().getStyle(), tel.getFont().getSize()));
		tel.setBounds(32, 38, 207, 21);
		contentPane.add(tel);
		tel.setColumns(10);
		
		JLabel msg = new JLabel("");
		msg.setBorder(new LineBorder(new Color(0, 0, 0)));
		msg.setFont(new Font("����ü", Font.PLAIN, 12));
		msg.setBounds(32, 69, 379, 23);
		contentPane.add(msg);
		
		
		JButton btnNewButton = new JButton("������ȣ �ޱ�");
		btnNewButton.setFont(new Font("����ü", Font.PLAIN, 12));
		btnNewButton.setBounds(255, 37, 156, 23);
		contentPane.add(btnNewButton);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		//keyPressed :Ű�� ���� �� 
		//keyReleased :Ű�� �����ٰ� up�� �Ǿ��� �� 
		//keyTyped : Ű ���ڸ� �Է� ���� �� 
		
		tel.addKeyListener(new KeyAdapter() {//Ű�� ���� ��� ����Ǵ� �̺�Ʈ Ŭ���� 
			@Override
			public void keyTyped(KeyEvent k) {
				//�Է°��� ���� �ڸ���
				int i = tel.getText().length();
				if(i >11) {
					k.consume(); 
				}
				//System.out.println(k.getKeyChar());
				//System.out.println(k.getKeyCode());
				int n = Integer.valueOf(k.getKeyChar()); //�ƽ�Ű �ڵ�� �ٲ� 
			
				//System.out.println(n);
				if(n>=48 && n<=57) { // sysout���� �������� ���� getKeyChar()��������, Integer�� ����� �ƽ�Ű �ڵ�� ���� 
					//�ƽ�Ű�ڵ� 48���� 57������ 0~9
					msg.setText("");
				}
				else {
					//System.out.println("test");
					//if(!Character.isDigit(n)) {
						msg.setText("���ڸ� �Է��ϼ���");
						k.consume(); //KeyTyped���� ���� consume�� �ش� �Է½� null�� ������ 
	 					
					//}
					
					
				}
			}
		});
		
	
	}

}
