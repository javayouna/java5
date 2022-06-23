import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

//0623
//Reader(최상위) Writer(최상위, 아직 안 배움)
//(하위)BufferedReader, FileReader, CharArrayReader -문서파일 ASCII
//(하위)InputStreamReader - 이미지, 동영상 , 오디오 
//inputStream(입력)

public class file9 {

	public static void main(String[] args) throws IOException {
		// Stream : 이미지, 동영상, 오디오 같은 파일을 로드하기 위해서 (바이너리)
		// InputStream : 입력장치 값을 받는 클래스입니다. 기본(int)-ASCII
		// InputStream (최상위 입력장치)
		// (하위클래스...) FileInputStream, AudioInputStream, ObjectInputStream
		// Reader r = new Reader() //read랑 close만 쓸 수 있음 최상위....

		
//		
//		InputStream user = System.in; //키보드입력받음(Scanner같이...)
//		int code = user.read();
		
	
		
		InputStream is = new InputStream() { //기본클래스를 로드해서 오버라이드 메소드를불러옴 
			@Override
			public int read() throws IOException { //byte
				int a = 15;
				return a; // 리턴 얘는 기본 게터임
			}
		};

	// int b = is.read(); //바로 받아서 처리가 가능
		//InputStreamReader (언어패킹변경)
		//InputStreamReader ("파일명", EUCKR) or InputStreamReader("파일명",UTF8)
		InputStreamReader ir = new InputStreamReader(is); // 읽는 InputStream<<Reader>> class
	
		
		try
	{
		System.out.println(ir.read()); // is.read();도 되는데 안 쓴이유! is에 뭐가 들어올 지 모르니까

	}
	catch(Exception z){
		System.out.println(z);
	}
	InputStream user = System.in; //키보드입력받음(Scanner같이...)
	//int code = user.read();
	
	try {
		int code = user.read(); //키보드 입력 ASCII 코드값 반환 
		if(code == 13) {
			System.out.println("엔터키는 사용하실 수 없습니다.");
		}
		
		
		//System.out.println(code);
	}
	catch(Exception z) {
		
	}
	
	}
	
}

