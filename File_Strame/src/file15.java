import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.Buffer;


//Stream�� �ֹ߼�/ �ѹ� ���� ��!!
//�̹��� ���� �뷮����
public class file15 {

	public static void main(String[] args) throws IOException{
		
		String file="C:\\java5\\File_Strame\\src\\img2.jpg";
		InputStream is = new FileInputStream(file);
		//FileinputStream�� buffer�� ����ϰԵǸ�, ���̻� FileinputStream�� ��� ����
		//�� �������� buffer�� new FileinputSTream �����Ͽ� ������ ����� �� �ֵ��� ������
		BufferedInputStream bi = new BufferedInputStream(new FileInputStream(file)); //�뷮üũ�� ����
		
		/*Stream�̵� Buffer�� �� ���ۿ� ��� ���ϴ� �ֹ߼�..�䷸�Ե� ���� ����*/
		
		byte filesize[] = new byte[bi.available()]; // 1. ��ü �а� �뷮�� 
		byte fileori[] = new byte[is.available()];
		int total = bi.read(filesize);
		//int total = is.read(filesize); //2. 
		
		//System.out.println(is.read(filesize));
		//System.out.println(is.read());
		if(total > 92160) { //�뷮 ���� 
			System.out.println("�̹��� ���� �뷮�� 90kb���� �Դϴ�.");
		}
		else {
			System.out.println("���������� ��ϵǾ����ϴ�.");
			FileOutputStream fo = new FileOutputStream("img_copy.jpg");
			fo.write(is.read(fileori));
		}
		

	}

}
