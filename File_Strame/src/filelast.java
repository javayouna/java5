import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/*
  InputStream > inputStreamreader > BufferedReader (o)
  InputStream >	BufferedReader (x)
  InputStream > BufferedInputStream (o)
  inputStreamreader > BufferedReader (o)

  ※ BufferedReader, BufferedWriter
    BufferedReader : close(); 메모리종료
    BufferedWriter : flush()메모리를 초기화 + close();
 
 */



public class filelast {

	public static void main(String[] args) throws IOException {
		try {
		String url = "src\\movie.txt";
		FileInputStream fs = new FileInputStream(url);
		//int a = fs.read();
		//byte a[] = new byte[400];
		InputStreamReader ir = new InputStreamReader(fs,"UTF8"); 
		//!input 위에있는데 밑에 Reader로 바로 오지않음!
		//그래서 InputStreamReader 선언 
		
		BufferedReader br = new BufferedReader(ir);
		//System.out.println(fs.read(a)); //400으로 읽음 
		br.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		

	}

}
