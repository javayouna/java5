import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

//Stream�� �̿��� ���� �ε�
public class file11 {

	public static void main(String[] args) throws IOException{
	
	try {
	//FileInputStream fs = new FileInputStream("C:\\java5\\File_Strame\\src\\list.txt"); //�굵 ����
	
	//[���� ũ�� ������ �뷮]	
	InputStream fs = new FileInputStream("C:\\java5\\File_Strame\\src\\list.txt"); //�굵 �´� ��
	System.out.println(fs.available()); //available: ���� ��ü ũ��
	//System.out.println((len=fs.read(temp))!=-1);
	byte temp[] = new byte[fs.available()];//������ �뷮 �迭 ����(���� ũ�⿡ ���� ������ �ְ� ����)
	int ea = fs.read(temp);
	String data = new String(temp,"UTF-8");
	System.out.println(data);
	
		
	/*[���� ����]
	byte temp[] = new byte[100]; //1024=1mb *16 �����ڵ� 		
	int ea = fs.read(temp); //ASCII �ڵ�� ��ü�� �о ea�� �޵��� ��
	String data = new String(temp,"UTF-8"); //String  �������·� �迭 �޾Ƽ� ��� ��� ��Ŷ �°� ��� ����
	System.out.println(data);
	*/
	}
	catch(Exception e) {
		
	}
	}

}
