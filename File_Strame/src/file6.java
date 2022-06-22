import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Scanner;

//Scanner를 이용한 파일 쓰기 사용 법 
public class file6 {

	public static void main(String[] args)throws IOException{
			try {
			FileWriter fw = new FileWriter("C:\\java5\\File_Strame\\src\\db.txt",true); //,ture쓰면 누적!!
			Scanner sc = new Scanner(System.in); //FileWriter니까 system.in ★사용자 직접입력
			
			System.out.println("내용을 입력해주세요:");

			
			for(int a=0;a<3;a++) { //★3번 반복
			String notice = sc.nextLine() + "\n"; // \n붙여주면 엔터값대로 메모장에 입력 됨 
			fw.write(notice); //★파일 쓰기
			
			}
			sc.close();
			fw.close();
			}
			catch(Exception z) {
				System.out.println(z);
			}
		
	}

	}


