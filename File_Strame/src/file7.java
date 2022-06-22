import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberInputStream;
import java.io.LineNumberReader;
import java.nio.charset.Charset;

/* 공통명렁어 사항: read(),readLine(),next().nextLine() */

//BufferReader (output) : 한번 선언하면 끝이라서, 재귀 함수 써야함 

public class file7 {

	public static void main(String[] args) throws IOException{
		
		try {
			FileReader fr = new FileReader("C:\\java5\\File_Strame\\src\\buffer.txt",Charset.forName("UTF8"));
			//FileReader는 1회성임..!! 한번 리더되면 다시 선언해줘야 읽힘 
			
			//System.out.println(fr.read()); // 확인하려면 .read붙이기
			//System.out.println((char)fr.read());
			
			//BufferedReader : Temp(임시저장소)-효율적으로 파일을 보다 빠르게 가져올 수 있습니다.
			BufferedReader bf = new BufferedReader(fr); //readLIne()으로 해당 값을 가져올 수 있습니다.
			//bf.close();
			//fr.close();
			//System.out.println(bf.readLine()); //해당 임시저장소에서 저장된 내용 중 한개 라인이 로드 됩 (1번 째 줄)
			
			/*Buffer는 최초 값을 출력하였을 경우 무조건 다음 라인의 값을 출력하게됩니다.
			  조건문 사용시에도 한번 작동이 이루어지게 됩니다.*/
			
			//System.out.println(bf.readLine()); //1번째줄 출력 
			//BufferedReader bf = new BufferedReader(fr);
			
			
			/*
			if(bf.readLine()!=null) { //헐 이것도 찍힌거임!!!!!
				
				int w =0;
				while(w<=1) {
					String data=bf.readLine();
					System.out.println(data);
					//System.out.println(bf.readLine()); //2번째꺼부터 출력 버퍼는 한번 찍히면 다음번에는 그 다음게출력 됨 
					w++;
				
			}
			
			
			}
			*/
		//System.out.println(data);
			
			/* buffer는 속도가 빠른 대신 사용 부분에 무조건 변수 또는 배열로 받은 후 사용하는 것을 권장합니다. */
			
		String line="";
		while((line=bf.readLine())!=null) { //그래서 line에 넘겨버리기!! 제일 좋은건 배열 			
			System.out.println(line);
		}
			
			/* 데이터 문서의 라인 갯수를 확인 */
			/* LineNumberReader: 파일 전체 라인 갯수를 확인하는 클래스 */
			FileReader fr2 = new FileReader("C:\\java5\\File_Strame\\src\\buffer.txt",Charset.forName("UTF8"));
		 	LineNumberReader li  = new LineNumberReader(fr2); //FileReader 써야함
		 	
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
