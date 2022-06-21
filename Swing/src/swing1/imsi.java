package swing1;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.LineBorder;

public class imsi extends JFrame {
	JLabel msg = new JLabel(""); //이걸 모르겟네..
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					swing11 frame = new swing11();
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
	public imsi() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ButtonGroup yn = new ButtonGroup();

		JRadioButton rdbtnNewRadioButton = new JRadioButton("회원");
		rdbtnNewRadioButton.setAutoscrolls(true);
		rdbtnNewRadioButton.setBounds(25, 21, 126, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("비회원");
		rdbtnNewRadioButton_1.setBounds(159, 21, 121, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		yn.add(rdbtnNewRadioButton);
		yn.add(rdbtnNewRadioButton_1);
		
		JButton btnNewButton = new JButton("출력하기");
		btnNewButton.setBounds(301, 21, 97, 23);
		contentPane.add(btnNewButton);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("짜장면");
		rdbtnNewRadioButton_2.setBounds(25, 116, 121, 23);
		contentPane.add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("짬뽕");
		rdbtnNewRadioButton_3.setBounds(159, 116, 121, 23);
		contentPane.add(rdbtnNewRadioButton_3);
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("탕수육");
		rdbtnNewRadioButton_4.setBounds(301, 116, 121, 23);
		contentPane.add(rdbtnNewRadioButton_4);
		
		//JLabel msg = new JLabel("");
		msg.setBorder(new LineBorder(new Color(0, 0, 0)));
		msg.setBounds(34, 172, 281, 23);
		contentPane.add(msg);
	
		btnNewButton.addActionListener(new ActionListener() { //출력하기
			

			public void actionPerformed(ActionEvent e) {
			
		//	msg="회원";
			
			}
		});
	}
}
