import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Scanner;

//Scanner�� �̿��� ���� �ε� ���� 
public class file5 {

	public static void main(String[] args) throws IOException{ //�ҷ����°Ŷ� IOException?
		//system.in : input
		//system.out : output
		//FileReader fr = new FileReader("C:\\java5\\File_Strame\\src\\db.txt"); �̷��� �ᵵ �ǰ� �ٷ� �� ó�� �ᵵ ��
		
		try {
		FileReader fr = new FileReader("C:\\java5\\File_Strame\\src\\db.txt",Charset.forName("UTF8")); //�� ��� ��õ��
		//system.in(����ڰ� ����), FileReader:���� �ε�
		Scanner sc = new Scanner(fr); 
		//sc.close();
		//Scanner sc = new Scanner(new FileReader("C:\\java5\\File_Strame\\src\\db.txt",Charset.forName("UTF8"))); 
		
		int count=0;
		while(sc.hasNext()) {  //hasNext();true,false�� ����
			sc.nextLine();
			count++;
		}
		System.out.println(count);
		sc.close();
		fr.close();
		
		
		
		/*
		for(;;) { //loop�� ����ó���� ���� �� ���� 
			String result = sc.nextLine(); //���Ϸε� �� �Է°��� result ���� 
			if(result!=null) {
		System.out.println(result); //��� 
		}
		
		else {
			sc.close(); break; 
		}
		
		}*/
	}
		catch(Exception e) {
		System.out.println(e);	
		}
	
	}
}
		
		
		
		
	


