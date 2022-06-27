import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
/* RandomAccessFile.length() : 파일 길이 반환
RandomAccessFile.seek(포인터 위치값) : 포인터 위치값을 설정
RandomAccessFile.read(바이트배열) : 현 포인터 위치에서부터 바이트 배열 길이만큼 읽어 들임
RandomAccessFile.getFilePointer() :  현 포인터 위치를 반환
RandomAccessFile.close() : 파일 닫기 
 */

//이미지 읽기, 쓰기,텍스트도 됨 
//자바 11번 이상 부터 사용
public class file16 {

	public static void main(String[] args) throws IOException {
		// r,w,x => 리눅스 r(read):읽기 w(write):쓰기, x:실행
		// RandomAccessFile:사용자가 파일 속성 권한을 설정할 수 있음
		try {
		String files ="C:\\java5\\File_Strame\\src\\img.jpg"; 
		String cp = "img222.jpg";
		
		RandomAccessFile file = new RandomAccessFile(files,"r"); //읽기
		RandomAccessFile file2 = new RandomAccessFile(cp, "rw"); //복사

		//FileChannel: IO(FileInputStream, FileOutputStream) 같은 형태
		//getChannel();: 해당 메소드를 가져오는 역할
		
		FileChannel fc= file.getChannel();
		FileChannel target = file2.getChannel();
		
		//transferTo, transferFrom (복사형태)
		//fc.transferTo(0, fc.size(), target); // transferTo (배열0, 배열끝번호, 복사위치)
		target.transferFrom(fc, 0, fc.size()); // transferFrom (복사팔 파일,배열0,복사끝번호)
		System.out.println(fc);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		}

}
