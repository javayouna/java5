import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

//Stream을 이용한 파일 로드
public class file11 {

	public static void main(String[] args) throws IOException{
	
	try {
	//FileInputStream fs = new FileInputStream("C:\\java5\\File_Strame\\src\\list.txt"); //얘도 맍고
	
	//[파일 크기 무제한 용량]	
	InputStream fs = new FileInputStream("C:\\java5\\File_Strame\\src\\list.txt"); //얘도 맞는 말
	System.out.println(fs.available()); //available: 파일 전체 크기
	//System.out.println((len=fs.read(temp))!=-1);
	byte temp[] = new byte[fs.available()];//무제한 용량 배열 파일(파일 크기에 따라 유동성 있게 변함)
	int ea = fs.read(temp);
	String data = new String(temp,"UTF-8");
	System.out.println(data);
	
		
	/*[원시 형태]
	byte temp[] = new byte[100]; //1024=1mb *16 파일코드 		
	int ea = fs.read(temp); //ASCII 코드로 전체를 읽어서 ea에 받도록 함
	String data = new String(temp,"UTF-8"); //String  문자형태로 배열 받아서 출력 언어 패킷 맞게 출력 가능
	System.out.println(data);
	*/
	}
	catch(Exception e) {
		
	}
	}

}
