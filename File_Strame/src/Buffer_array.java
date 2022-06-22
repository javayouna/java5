import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;

//file7 추가 설명 BufferedReader+Array (output ->input ->output)
public class Buffer_array {

	public static void main(String[] args) throws IOException {
		
		try {
			FileReader fr = new FileReader("C:\\java5\\File_Strame\\src\\buffer.txt",Charset.forName("UTF8"));
			BufferedReader br = new BufferedReader(fr); //얘는 이제 한번밖에 못 씀 
			
			ArrayList<String> ar = new ArrayList<>(); //빈 배열 class
			String word="";
			
			while((word=br.readLine())!=null) { //buffer에 있는 값 String 자료형으로 이전 후
				ar.add(word); //해당 자료형에 저장 된 문자를 배열로 추가시킴
			}
			
			br.close(); //얘 써주면 fr.clase()도 닫힘 
			System.out.print(ar);
			System.out.println(ar.size());
		}catch(Exception e) {
			
		}
		
		
		

	}

}
