import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberInputStream;
import java.io.LineNumberReader;
import java.nio.charset.Charset;

/* ������� ����: read(),readLine(),next().nextLine() */

//BufferReader (output) : �ѹ� �����ϸ� ���̶�, ��� �Լ� ����� 

public class file7 {

	public static void main(String[] args) throws IOException{
		
		try {
			FileReader fr = new FileReader("C:\\java5\\File_Strame\\src\\buffer.txt",Charset.forName("UTF8"));
			//FileReader�� 1ȸ����..!! �ѹ� �����Ǹ� �ٽ� ��������� ���� 
			
			//System.out.println(fr.read()); // Ȯ���Ϸ��� .read���̱�
			//System.out.println((char)fr.read());
			
			//BufferedReader : Temp(�ӽ������)-ȿ�������� ������ ���� ������ ������ �� �ֽ��ϴ�.
			BufferedReader bf = new BufferedReader(fr); //readLIne()���� �ش� ���� ������ �� �ֽ��ϴ�.
			//bf.close();
			//fr.close();
			//System.out.println(bf.readLine()); //�ش� �ӽ�����ҿ��� ����� ���� �� �Ѱ� ������ �ε� �� (1�� ° ��)
			
			/*Buffer�� ���� ���� ����Ͽ��� ��� ������ ���� ������ ���� ����ϰԵ˴ϴ�.
			  ���ǹ� ���ÿ��� �ѹ� �۵��� �̷������ �˴ϴ�.*/
			
			//System.out.println(bf.readLine()); //1��°�� ��� 
			//BufferedReader bf = new BufferedReader(fr);
			
			
			/*
			if(bf.readLine()!=null) { //�� �̰͵� ��������!!!!!
				
				int w =0;
				while(w<=1) {
					String data=bf.readLine();
					System.out.println(data);
					//System.out.println(bf.readLine()); //2��°������ ��� ���۴� �ѹ� ������ ���������� �� ��������� �� 
					w++;
				
			}
			
			
			}
			*/
		//System.out.println(data);
			
			/* buffer�� �ӵ��� ���� ��� ��� �κп� ������ ���� �Ǵ� �迭�� ���� �� ����ϴ� ���� �����մϴ�. */
			
		String line="";
		while((line=bf.readLine())!=null) { //�׷��� line�� �Ѱܹ�����!! ���� ������ �迭 			
			System.out.println(line);
		}
			
			/* ������ ������ ���� ������ Ȯ�� */
			/* LineNumberReader: ���� ��ü ���� ������ Ȯ���ϴ� Ŭ���� */
			FileReader fr2 = new FileReader("C:\\java5\\File_Strame\\src\\buffer.txt",Charset.forName("UTF8"));
		 	LineNumberReader li  = new LineNumberReader(fr2); //FileReader �����
		 	
		 	int ea =0;
		 	while(li.readLine()!=null) {
		 	 ea =li.getLineNumber();
		
		 	}
		 	System.out.println(ea);
		}
		
		catch(Exception z) {
			System.out.println(z);
		}
		
		
		
	}

}
