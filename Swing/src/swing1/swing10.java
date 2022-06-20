package swing1;

import java.awt.EventQueue;
import java.awt.SystemColor;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class swing10 extends JFrame {

   private JPanel contentPane;

   /**
    * Launch the application.
    */
   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               swing10 frame = new swing10();
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
   
   public swing10() {
      
      
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setBounds(100, 100, 450, 300);
      contentPane = new JPanel();
      contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
      setContentPane(contentPane);
      contentPane.setLayout(null);
      
      String list[] = {"SKT","KT","LGT","알뜰폰"};
      
      JComboBox cb = new JComboBox(list);
      cb.setBounds(22, 24, 128, 34);
      contentPane.add(cb);
      
      JLabel msg = new JLabel("");
      msg.setBorder(new LineBorder(SystemColor.textHighlight, 2));
      msg.setBounds(22, 79, 385, 26);
      contentPane.add(msg);
      cb.addItemListener(new ItemListener() {
         
         @Override
         public void itemStateChanged(ItemEvent e) {
            int v = cb.getSelectedIndex();   //배열 index 형태로 로드/ 단, 필드에 배열이 선언되어야 함
            //System.out.println(e.getItem());
            //System.out.println(cb.getSelectedIndex());
            //String data = String.valueOf(cb.getSelectedItem());
            //String data = cb.getSelectedItem().toString();
            //String data = String.valueOf(e.getItem());
            //String data = e.getItem().toString();
            //msg.setText(data);
            msg.setText(list[v]);
            
         }
      });
      
      
      
      
      
      
   }
   
   
}