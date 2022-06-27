import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
/* RandomAccessFile.length() : ���� ���� ��ȯ
RandomAccessFile.seek(������ ��ġ��) : ������ ��ġ���� ����
RandomAccessFile.read(����Ʈ�迭) : �� ������ ��ġ�������� ����Ʈ �迭 ���̸�ŭ �о� ����
RandomAccessFile.getFilePointer() :  �� ������ ��ġ�� ��ȯ
RandomAccessFile.close() : ���� �ݱ� 
 */

//�̹��� �б�, ����,�ؽ�Ʈ�� �� 
//�ڹ� 11�� �̻� ���� ���
public class file16 {

	public static void main(String[] args) throws IOException {
		// r,w,x => ������ r(read):�б� w(write):����, x:����
		// RandomAccessFile:����ڰ� ���� �Ӽ� ������ ������ �� ����
		try {
		String files ="C:\\java5\\File_Strame\\src\\img.jpg"; 
		String cp = "img222.jpg";
		
		RandomAccessFile file = new RandomAccessFile(files,"r"); //�б�
		RandomAccessFile file2 = new RandomAccessFile(cp, "rw"); //����

		//FileChannel: IO(FileInputStream, FileOutputStream) ���� ����
		//getChannel();: �ش� �޼ҵ带 �������� ����
		
		FileChannel fc= file.getChannel();
		FileChannel target = file2.getChannel();
		
		//transferTo, transferFrom (��������)
		//fc.transferTo(0, fc.size(), target); // transferTo (�迭0, �迭����ȣ, ������ġ)
		target.transferFrom(fc, 0, fc.size()); // transferFrom (������ ����,�迭0,���糡��ȣ)
		System.out.println(fc);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		}

}
