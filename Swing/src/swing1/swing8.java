package swing1;

import java.awt.EventQueue;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
//progress바 사용법 
public class swing8 extends JFrame {
	public JProgressBar progress =null;
	private JPanel contentPane;
	public JLabel lb = null;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					swing8 frame = new swing8();
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
	public swing8() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		this.progress = new JProgressBar();
		this.progress.setStringPainted(true);
		this.progress.setBounds(57, 37, 314, 20);
		contentPane.add(progress);
		
		this.lb = new JLabel();
		this.lb.setBounds(76, 106, 295, 28);
		contentPane.add(this.lb);
		
		
		//swing 프로그램이 작동 후 해당 메소드로 1초 후 실행되도록 적용함 
		Timer t = new Timer();
		TimerTask task = new TimerTask() {
			
			public void run() {
				pstart();
			}
		};
		t.schedule(task, 0); //한번 거치는 것 
		//pstart();

	}

	public void pstart() {

		int w=0;
		try {
			while(w<=100) {
			this.progress.setValue(w); //progress에 this. 넣으려면 맨~~위에다가 선언!! 12번줄,42번줄 참고 
			Thread.sleep(100);	
			w++;
			}
		} catch (Exception k) {
			System.out.println("오류발생");
		}
		if(this.progress.getValue()==100) {
			this.lb.setText("다운로드가 모두 완료 되었습니다.");
		}
		

	}
}
