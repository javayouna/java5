import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;

public class file2 {

	public static void main(String[] args) throws IOException{
		
		try {
		//FileReader fr = new FileReader("C:\\java5\\File_Strame\\src\\list.txt"); 
		//자바 8번 때 사용하던 방법 
		
		FileReader fr = new FileReader("C:\\java5\\File_Strame\\src\\list.txt",Charset.forName("EUCKR"));  //EUCKR:한글 
		//Charset.forName : JAVA12 -> EUCKR(ANSI),UTF8,UTF16
		//System.out.println(fr.getEncoding()); //인코더 형식 확인 FileReader
		
		//System.out.println(fr.read());//용량 크기 확인 .read(); //데이터 크기 
		//int w =0;
		while(true) { //루프(기본으로 루프돌려야함)
		//System.out.println(m);
			int m = fr.read(); // -1:내용이 없음 (더 이상 문자가 없을 경우) while문 안에 read들어가야함 
			System.out.print((char)m); //2byte char로 사용함
			//char사용이유: 한글자씩 가져 올 수 있음 
			
			if(m==-1) {
				break;
			}
			
				//w++;
		}
		
		fr.close(); //FileReader를 종료함 
		
		
		}
		catch(IOException e) {
			if(e.getMessage()!=null) {
				System.out.println(e);
			}
		}
		
		
		

	}

}
