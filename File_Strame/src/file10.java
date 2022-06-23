import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Arrays;

//OutputStreamReader (output) - 최상위
//(하위) FileOutputStream, ObjectOutputStream, //AudioOutputStream 선생님도 모름

public class file10 {

	public static void main(String[] args) {
		
		String a= "123456789";
		//byte[]:문자열을 ASCII 형태 배열로 변경 할 때 사용
		byte[] b = a.getBytes(); //getBytes("언어패킷") 메소드
		System.out.println(Arrays.toString(b)); //무조건 키로만 읽힘 
		OutputStream os = System.out; //출력만 사용 
		
		try {
		os.write(b,0,b.length); //(byte배열이름, 배열번호, 배열크기)
		os.flush(); //출력 파트
		}

		catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
