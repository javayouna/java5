import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Arrays;

//OutputStreamReader (output) - �ֻ���
//(����) FileOutputStream, ObjectOutputStream, //AudioOutputStream �����Ե� ��

public class file10 {

	public static void main(String[] args) {
		
		String a= "123456789";
		//byte[]:���ڿ��� ASCII ���� �迭�� ���� �� �� ���
		byte[] b = a.getBytes(); //getBytes("�����Ŷ") �޼ҵ�
		System.out.println(Arrays.toString(b)); //������ Ű�θ� ���� 
		OutputStream os = System.out; //��¸� ��� 
		
		try {
		os.write(b,0,b.length); //(byte�迭�̸�, �迭��ȣ, �迭ũ��)
		os.flush(); //��� ��Ʈ
		}

		catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
