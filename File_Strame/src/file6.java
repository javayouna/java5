import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Scanner;

//Scanner�� �̿��� ���� ���� ��� �� 
public class file6 {

	public static void main(String[] args)throws IOException{
			try {
			FileWriter fw = new FileWriter("C:\\java5\\File_Strame\\src\\db.txt",true); //,ture���� ����!!
			Scanner sc = new Scanner(System.in); //FileWriter�ϱ� system.in �ڻ���� �����Է�
			
			System.out.println("������ �Է����ּ���:");

			
			for(int a=0;a<3;a++) { //��3�� �ݺ�
			String notice = sc.nextLine() + "\n"; // \n�ٿ��ָ� ���Ͱ���� �޸��忡 �Է� �� 
			fw.write(notice); //������ ����
			
			}
			sc.close();
			fw.close();
			}
			catch(Exception z) {
				System.out.println(z);
			}
		
	}

	}


