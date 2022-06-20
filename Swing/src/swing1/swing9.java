package swing1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JEditorPane;

public class swing9 extends JFrame {
	//jEditorPane 은 게시판 내용 출력 또는 입력 등 사용되며,
	//하이브리드 웹앱에서는 HTML을 로드해 출력할 수 도 있습니다.
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					swing9 frame = new swing9();
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
	public swing9() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 800);
		setTitle("하이브리드 웹 앱");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JEditorPane webpage = new JEditorPane(); //ContentType :문자도 사용 그리고 HTML코드도 사용 
		webpage.setBounds(27, 10, 751, 577);
		contentPane.add(webpage);
		webpage.setContentType("text/html");
	      webpage.setText("<h1>DOG~~</h1>"
	            + "<img src='https://t1.daumcdn.net/cfile/tistory/24283C3858F778CA2E'>"
	            + "DOG CUTE~"
	            + "<br><input type='text' id='name'>"
	            );
		
		
	}
}
