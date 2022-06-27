import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.Buffer;


//Stream은 휘발성/ 한번 쓰면 끝!!
//이미지 파일 용량제한
public class file15 {

	public static void main(String[] args) throws IOException{
		
		String file="C:\\java5\\File_Strame\\src\\img2.jpg";
		InputStream is = new FileInputStream(file);
		//FileinputStream을 buffer로 사용하게되면, 더이상 FileinputStream을 사용 못함
		//그 수단으로 buffer에 new FileinputSTream 생성하여 별도로 사용할 수 있도록 셋팅함
		BufferedInputStream bi = new BufferedInputStream(new FileInputStream(file)); //용량체크할 때는
		
		/*Stream이든 Buffer든 한 번밖에 사용 못하는 휘발성..요렇게도 선언 가능*/
		
		byte filesize[] = new byte[bi.available()]; // 1. 전체 읽고 용량인 
		byte fileori[] = new byte[is.available()];
		int total = bi.read(filesize);
		//int total = is.read(filesize); //2. 
		
		//System.out.println(is.read(filesize));
		//System.out.println(is.read());
		if(total > 92160) { //용량 제한 
			System.out.println("이미지 제한 용량은 90kb까지 입니다.");
		}
		else {
			System.out.println("정상적으로 등록되었습니다.");
			FileOutputStream fo = new FileOutputStream("img_copy.jpg");
			fo.write(is.read(fileori));
		}
		

	}

}
