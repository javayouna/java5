import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

//0623
//Reader(�ֻ���) Writer(�ֻ���, ���� �� ���)
//(����)BufferedReader, FileReader, CharArrayReader -�������� ASCII
//(����)InputStreamReader - �̹���, ������ , ����� 
//inputStream(�Է�)

public class file9 {

	public static void main(String[] args) throws IOException {
		// Stream : �̹���, ������, ����� ���� ������ �ε��ϱ� ���ؼ� (���̳ʸ�)
		// InputStream : �Է���ġ ���� �޴� Ŭ�����Դϴ�. �⺻(int)-ASCII
		// InputStream (�ֻ��� �Է���ġ)
		// (����Ŭ����...) FileInputStream, AudioInputStream, ObjectInputStream
		// Reader r = new Reader() //read�� close�� �� �� ���� �ֻ���....

		
//		
//		InputStream user = System.in; //Ű�����Է¹���(Scanner����...)
//		int code = user.read();
		
	
		
		InputStream is = new InputStream() { //�⺻Ŭ������ �ε��ؼ� �������̵� �޼ҵ带�ҷ��� 
			@Override
			public int read() throws IOException { //byte
				int a = 15;
				return a; // ���� ��� �⺻ ������
			}
		};

	// int b = is.read(); //�ٷ� �޾Ƽ� ó���� ����
		//InputStreamReader (�����ŷ����)
		//InputStreamReader ("���ϸ�", EUCKR) or InputStreamReader("���ϸ�",UTF8)
		InputStreamReader ir = new InputStreamReader(is); // �д� InputStream<<Reader>> class
	
		
		try
	{
		System.out.println(ir.read()); // is.read();�� �Ǵµ� �� ������! is�� ���� ���� �� �𸣴ϱ�

	}
	catch(Exception z){
		System.out.println(z);
	}
	InputStream user = System.in; //Ű�����Է¹���(Scanner����...)
	//int code = user.read();
	
	try {
		int code = user.read(); //Ű���� �Է� ASCII �ڵ尪 ��ȯ 
		if(code == 13) {
			System.out.println("����Ű�� ����Ͻ� �� �����ϴ�.");
		}
		
		
		//System.out.println(code);
	}
	catch(Exception z) {
		
	}
	
	}
	
}

