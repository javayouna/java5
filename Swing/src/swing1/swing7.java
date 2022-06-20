package swing1;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

public class swing7 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					swing7 frame = new swing7();
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
	public swing7() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(28, 32, 400, 33);
		contentPane.add(panel);
		//panel.setLayout(null);
		
		JRadioButton rd1 = new JRadioButton("�ſ�ī��");
		rd1.setName("CARD");
		rd1.setSelected(true);
		rd1.setFont(new Font("����ü", Font.PLAIN, 12));
		panel.add(rd1);
		
		JRadioButton rd2 = new JRadioButton("������ü");
		rd2.setName("BANK");
		rd2.setFont(new Font("����ü", Font.PLAIN, 12));
		panel.add(rd2);
		
		JRadioButton rd3 = new JRadioButton("�������Ա�");
		rd3.setName("NOBANK"); //setName�� ���� ���� ������, background���� �ش� �Ӽ����� �����ϴ� ���� ���մϴ�.
		rd3.setFont(new Font("����ü", Font.PLAIN, 12));
		panel.add(rd3);
		
		ButtonGroup gp = new ButtonGroup(); // radio���� ButtonGroup �̤ˤ��Ͻñ� ..üũ�� �ϳ����� �� �ְ� 
		gp.add(rd1);
		gp.add(rd2);
		gp.add(rd3);
		

		
		JButton btn = new JButton("��������");
		btn.setFont(new Font("����ü", Font.PLAIN, 12));
		btn.setBounds(176, 90, 93, 23);
		contentPane.add(btn);
//		rd1.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				
//			}
//		});
		
		JPanel mu = new JPanel();
		mu.setFont(new Font("����ü", Font.PLAIN, 12));
		mu.setVisible(false);
		mu.setToolTipText("test");
		mu.setBounds(28, 168, 400, 75);
		contentPane.add(mu);
		mu.setBorder(new TitledBorder("�������Ա�"));
		mu.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 21, 166, 21);
		mu.add(textField);
		textField.setColumns(10);
	
		
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String pay ="";
				
				
				if(rd1.isSelected()==true) { //�ſ�ī��
					pay=rd1.getName();
					
					System.out.println("�ſ�ī�� ����");
					mu.setVisible(false);
				}
				else if(rd2.isSelected()==true) { //������ü
					System.out.println("������ü ����");
					mu.setVisible(false);
				
			}
				else { //������
					 mu.setVisible(true);
				}
				}
		});
	

}
	}
