import java.io.FileReader;
import java.io.IOException;

public class file1 {
/* 
 * I/O : inputStream, outputStream
 * 입력 스트림 : 프로그램으로 들어오는 스트림(inputStreame : 키보드, 마우스, HDD)
 * 출력 스트림 : 프로그램에서 밖으로 나가는 부분 (outputStream : 모니터, HDD, 프린터)
 * Stream : input, output 사용자 처리
 * JAVA.io(API)
 * File, FileReader(일반)->StrameAPI(FileinputStream)
 * FileWriter -> StrameAPI (FileOutputStream)
 *
 */
	
	
	public static void main(String[] args) throws IOException,Exception { //무조건 throws IOException 이걸 써야 쓸 수 있음 
		//FileReader 
		//1.문자 데이터를 파일로부터 읽는 클래스;
		//2.파일이름을 생성자 인수값(파라미터)으로 사용해서 FileReader객체 생성 
		
		try {
		FileReader fr = new FileReader("C:\\java5\\File_Strame\\src\\list.txt");
		
		String a = "a1";
		tests(a);
		}
		catch(IOException z) { //IOException에 대한 예외처리
			System.out.println(z.getMessage());
		}
		catch(Exception z1) { //일반 Exception에 대한 예외처리 방식
			System.out.println(z1.getMessage());
		}
		
	}
	static public void tests(String data) throws IOException,Exception { //main에 IOException이니까 throws도 IOException! but 
													//main에 Exception하고 밑에 IOException은 됨 
		int  k = Integer.parseInt(data);
		Exception ex = new Exception();
		throw ex;
		
		
	}

}
