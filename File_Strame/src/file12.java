import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

//FileOutputStream


public class file12 {

	public static void main(String[] args) throws IOException{
		String test = "연습입니다.";
		//FileOutputStream os = new FileOutputStream("C:\\java5\\File_Strame\\src\\array.txt");  이것도 맞는 것
		OutputStream os = new FileOutputStream("C:\\java5\\File_Strame\\src\\array.txt");
		byte[] data = test.getBytes(); //getBytes : 문자를 "연습입니다."를 ASCII로 변환 한것 
		os.write(data);
		os.flush(); 
		// Stream에 저장된 모든 값이 메모리에 있음. 
		// flush() 메모리값을 모두비우는 작업
		
		
		

	}

}
