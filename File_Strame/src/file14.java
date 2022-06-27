import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.stream.FileImageInputStream; 

//0627 이미지추출
//이미지(binary)파일 설정 byte단위 (Filereader (x))
//FileInputStream을 이용하고 read()만 사용

public class file14 {

	public static void main(String[] args) {
		
		try {
			InputStream is = new FileInputStream("C:\\java5\\File_Strame\\src\\img.jpg");
			//InputStream is = new FileImageInputStream(""); 이것도 가능
			//FileInputStream fs = new FileInputStream(""); 이것도 가능
			
			//System.out.println(is.read()); //255:픽셀단위로 읽음(색수치) 
			//*Stream은 버퍼와 비슷해서 read를 사용하면 비워짐 문서는 관계없음
			//여기서 읽은 거여서 read가 -활성화 되어있으면 복사 안됨 (Buffer랑 같은 개념)
			
			//byte b[]=new byte[is.available()];//용량 확인 
			//System.out.println(is.read(b)); //용량 전체 크기
			
			byte b[]=new byte[1024]; //배열 크기 강제 조절
			//byte b[]=new byte[is.available()/100]; //이렇게 하면 1~100%까지 출력됨
			//Output:복사 
			FileOutputStream os = new FileOutputStream("img.jpg"); //C:\java5\File_Strame\\src에 저장됨 
			int img =0; //읽는 바이트수
			int check =0; //읽는 횟수
//			while((img=is.read(b))!=-1) { //이것도 가능 하고, true넣어서 (무한루프) 조건문으로 출력
//				os.write(b); //반복문 사용하지 않음
//			}
			
			
			/* 다운로드 로드 출력*/
			while(true) {	
				img = is.read(b); //해당 파일을 읽어서 바이트 변수로 넘김
				if(img== -1) {
					break;
				}
				else {
					System.out.println(check+"%"); //다운로드 %를 표시할 때 사용하기 위함
					os.write(b,0,img); 					
				}
				check++;
				if(check ==101) {
					break;
				}
				//System.out.println();
				//os.write(b); 가능ok 반복문에 안 들어가도 됨 
				//os.write(b,0,img); 가능ok progress bar?에 넣을 때 사용 
 			}
			
		}
		
		catch(IOException e){ //이것도됨 
			
			
		}
		

	}

}
