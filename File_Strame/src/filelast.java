import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/*
  InputStream > inputStreamreader > BufferedReader (o)
  InputStream >	BufferedReader (x)
  InputStream > BufferedInputStream (o)
  inputStreamreader > BufferedReader (o)

  �� BufferedReader, BufferedWriter
    BufferedReader : close(); �޸�����
    BufferedWriter : flush()�޸𸮸� �ʱ�ȭ + close();
 
 */



public class filelast {

	public static void main(String[] args) throws IOException {
		try {
		String url = "src\\movie.txt";
		FileInputStream fs = new FileInputStream(url);
		//int a = fs.read();
		//byte a[] = new byte[400];
		InputStreamReader ir = new InputStreamReader(fs,"UTF8"); 
		//!input �����ִµ� �ؿ� Reader�� �ٷ� ��������!
		//�׷��� InputStreamReader ���� 
		
		BufferedReader br = new BufferedReader(ir);
		//System.out.println(fs.read(a)); //400���� ���� 
		br.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		

	}

}
