import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;
public class Swing2 extends JFrame {
	public Swing2() {
	}
    private JPanel contentPane;
    private JTextField textField;
   
    private JRadioButton radioBtn1 ;
    private JRadioButton radioBtn2 ;
   
    private JCheckBox checkBox1 ;
    private JCheckBox checkBox2 ;
    private JCheckBox checkBox3 ;
    private JCheckBox checkBox4 ;
   
    private JComboBox comboBox ;
   
    /*
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    RestaurantMgr frame = new RestaurantMgr();
                    frame.setVisible(true);
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    /*
     * Create the frame.
     */
    public RestaurantMgr() {       
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        setBounds(100, 100, 450, 300);
       
        contentPane = new JPanel();
       
        setContentPane(contentPane);
        contentPane.setLayout(null);
       
        JButton button = new JButton("����ϱ�");
       
        button.addActionListener(new ActionListener() {
            String str = " " ;
           
            public void actionPerformed(ActionEvent e) {
                if (radioBtn1.isSelected()) {
                    str += radioBtn1.getText() ;
                }
               
                if (radioBtn2.isSelected()) {
                    str += radioBtn2.getText() ;
                }
               
                str += " " ;
                str += comboBox.getSelectedItem() ;
                str += " " ;
               
                if (checkBox1.isSelected()) {
                    str += checkBox1.getText() ;
                }
               
                str += " " ;
               
                if (checkBox2.isSelected()) {
                    str += checkBox2.getText() ;
                }
               
                str += " " ;
               
                if (checkBox3.isSelected()) {
                    str += checkBox3.getText() ;
                }
               
                str += " " ;
               
                if (checkBox4.isSelected()) {
                    str += checkBox4.getText() ;
                }
               
                str += " ����Ǿ� �ֽ��ϴ�." ;
                 
                textField.setText(str) ;
            }
        });
       
        button.setBounds(333, 33, 97, 55);
        contentPane.add(button);
       
        JPanel panel = new JPanel();
        panel.setBorder(new TitledBorder(null, "ȸ��&��ȸ��", TitledBorder.LEADING,    
                                                        TitledBorder.TOP, null, null));
        panel.setToolTipText("");
        panel.setBounds(12, 26, 309, 62);
        contentPane.add(panel);
       
        radioBtn1 = new JRadioButton("ȸ��");
        radioBtn1.setSelected(true);
        panel.add(radioBtn1);
       
        radioBtn2 = new JRadioButton("��ȸ��");
        panel.add(radioBtn2);
       
        comboBox = new JComboBox();
        comboBox.setModel(new DefaultComboBoxModel(new String[] {"1�ð� ��",
                              "2�ð� ��", "3�ð� ��", "4�ð� ��", "5�ð� ��", "6�ð� ��"}));
        panel.add(comboBox);
       
        JPanel panel_1 = new JPanel();
        panel_1.setBorder(new TitledBorder(UIManager.getBorder                                
                                ("TitledBorder.border"), "���� ����", TitledBorder.LEADING, 
                                             TitledBorder.TOP, null, new Color(0, 0, 0)));
        panel_1.setBounds(12, 110, 418, 72);
        contentPane.add(panel_1);
       
        checkBox1 = new JCheckBox("����Ÿ");
        panel_1.add(checkBox1);
       
        checkBox2 = new JCheckBox("�ε�ī��");
        panel_1.add(checkBox2);
       
        checkBox3 = new JCheckBox("������ũ");
        panel_1.add(checkBox3);
       
        checkBox4 = new JCheckBox("�Ұ��");
        panel_1.add(checkBox4);
       
        textField = new JTextField();
        textField.setBounds(12, 205, 418, 27);
        contentPane.add(textField);
        textField.setColumns(10);
    }
}
