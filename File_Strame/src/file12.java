import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

//FileOutputStream


public class file12 {

	public static void main(String[] args) throws IOException{
		String test = "�����Դϴ�.";
		//FileOutputStream os = new FileOutputStream("C:\\java5\\File_Strame\\src\\array.txt");  �̰͵� �´� ��
		OutputStream os = new FileOutputStream("C:\\java5\\File_Strame\\src\\array.txt");
		byte[] data = test.getBytes(); //getBytes : ���ڸ� "�����Դϴ�."�� ASCII�� ��ȯ �Ѱ� 
		os.write(data);
		os.flush(); 
		// Stream�� ����� ��� ���� �޸𸮿� ����. 
		// flush() �޸𸮰��� ��κ��� �۾�
		
		
		

	}

}
