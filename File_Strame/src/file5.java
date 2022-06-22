import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Scanner;

//Scanner를 이용한 파일 로드 사용법 
public class file5 {

	public static void main(String[] args) throws IOException{ //불러오는거라서 IOException?
		//system.in : input
		//system.out : output
		//FileReader fr = new FileReader("C:\\java5\\File_Strame\\src\\db.txt"); 이렇게 써도 되고 바로 밑 처럼 써도 됨
		
		try {
		FileReader fr = new FileReader("C:\\java5\\File_Strame\\src\\db.txt",Charset.forName("UTF8")); //이 방법 추천쓰
		//system.in(사용자가 직접), FileReader:파일 로드
		Scanner sc = new Scanner(fr); 
		//sc.close();
		//Scanner sc = new Scanner(new FileReader("C:\\java5\\File_Strame\\src\\db.txt",Charset.forName("UTF8"))); 
		
		int count=0;
		while(sc.hasNext()) {  //hasNext();true,false와 같음
			sc.nextLine();
			count++;
		}
		System.out.println(count);
		sc.close();
		fr.close();
		
		
		
		/*
		for(;;) { //loop시 예외처리로 빠질 수 있음 
			String result = sc.nextLine(); //파일로드 된 입력값을 result 전달 
			if(result!=null) {
		System.out.println(result); //출력 
		}
		
		else {
			sc.close(); break; 
		}
		
		}*/
	}
		catch(Exception e) {
		System.out.println(e);	
		}
	
	}
}
		
		
		
		
	


