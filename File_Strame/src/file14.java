import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.stream.FileImageInputStream; 

//0627 �̹�������
//�̹���(binary)���� ���� byte���� (Filereader (x))
//FileInputStream�� �̿��ϰ� read()�� ���

public class file14 {

	public static void main(String[] args) {
		
		try {
			InputStream is = new FileInputStream("C:\\java5\\File_Strame\\src\\img.jpg");
			//InputStream is = new FileImageInputStream(""); �̰͵� ����
			//FileInputStream fs = new FileInputStream(""); �̰͵� ����
			
			//System.out.println(is.read()); //255:�ȼ������� ����(����ġ) 
			//*Stream�� ���ۿ� ����ؼ� read�� ����ϸ� ����� ������ �������
			//���⼭ ���� �ſ��� read�� -Ȱ��ȭ �Ǿ������� ���� �ȵ� (Buffer�� ���� ����)
			
			//byte b[]=new byte[is.available()];//�뷮 Ȯ�� 
			//System.out.println(is.read(b)); //�뷮 ��ü ũ��
			
			byte b[]=new byte[1024]; //�迭 ũ�� ���� ����
			//byte b[]=new byte[is.available()/100]; //�̷��� �ϸ� 1~100%���� ��µ�
			//Output:���� 
			FileOutputStream os = new FileOutputStream("img.jpg"); //C:\java5\File_Strame\\src�� ����� 
			int img =0; //�д� ����Ʈ��
			int check =0; //�д� Ƚ��
//			while((img=is.read(b))!=-1) { //�̰͵� ���� �ϰ�, true�־ (���ѷ���) ���ǹ����� ���
//				os.write(b); //�ݺ��� ������� ����
//			}
			
			
			/* �ٿ�ε� �ε� ���*/
			while(true) {	
				img = is.read(b); //�ش� ������ �о ����Ʈ ������ �ѱ�
				if(img== -1) {
					break;
				}
				else {
					System.out.println(check+"%"); //�ٿ�ε� %�� ǥ���� �� ����ϱ� ����
					os.write(b,0,img); 					
				}
				check++;
				if(check ==101) {
					break;
				}
				//System.out.println();
				//os.write(b); ����ok �ݺ����� �� ���� �� 
				//os.write(b,0,img); ����ok progress bar?�� ���� �� ��� 
 			}
			
		}
		
		catch(IOException e){ //�̰͵��� 
			
			
		}
		

	}

}
