import java.io.FileWriter;
import java.io.IOException;

//���� ����(write)

public class file4 {

	public static void main(String[] args) throws Exception{ //writer�� Exception �ϳ��� �־ ��?!
		
		try{ 
			//FileWriter : ���� �����͸� ���Ͽ� ���� class
			
			String user[]= {"ȫ�浿40","������60","������100","������300"};
			
			//FileWriter fw = new FileWriter("C:\\java5\\File_Strame\\src\\array.txt"); //�����
			FileWriter fw = new FileWriter("C:\\java5\\File_Strame\\src\\array.txt",true);  //����+�ű�
			//FileWriter true�� ����ϸ� ���� �Էµ� ������ ���ܵ� 
				
			for(int f=0;f<user.length;f++) {
				System.out.println(user[f]);
				fw.write(user[f]); //write:����,�迭 ������ ���� ���Ͽ� ������
				
			}
	
			fw.close(); // ���� ���»����� �����Ͽ� ������
		}
		catch(Exception x) {
			System.out.println("test");
		}

		
		
	}


	}


