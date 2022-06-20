package swing1;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class swing11 extends JFrame {
	//ImageIcon:�̹��������� �ε��� �� ��� 
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
	public swing11() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 547, 620);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn = new JButton("�̹��� �ε�");
		btn.setFont(new Font("����ü", Font.PLAIN, 12));
		btn.setBounds(22, 23, 128, 23);
		contentPane.add(btn);
		
		JLabel lb = new JLabel("");
		lb.setBorder(new LineBorder(new Color(0, 0, 0)));
		lb.setBounds(22, 63, 503, 512);
		contentPane.add(lb);
		//ImageIcon img = new ImageIcon();
		//ImageIcon img = new ImageIcon("C:\\java5\\Swing\\src\\swing1\\cun.jpg");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon img = new ImageIcon("C:\\java5\\Swing\\src\\swing1\\cun3.jpg");
				Image reimg=img.getImage();
				Image resize=reimg.getScaledInstance(547, 620, Image.SCALE_SMOOTH);
				//getScaledInstance:����, ����, ��ȯ���
				//Image.SCALE_SMOOTH:�ε巴�� ����
				//SCALE_FAST:����������(pix�� ����)
				//SCALE_DEFAULT:�̹����� ������ �ִ� �ػ󵵿� ���� ����
				//SCALE_AREA+AVERAGING:����� �ػ� ��հ����� ���� 
				ImageIcon rimg= new ImageIcon(resize);
				lb.setIcon(rimg);
			}
		});
	}

}
