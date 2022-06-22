import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) throws IOException {
		/* [응용문제]
		 * 사용자가 영화제목을 검색합니다.
		 * 해당 영화제목 데이터값이 있을 경우
		 * 영화전체 정보를 출력합니다.
		 * 힌트:Scanner로 사용
		 * "검색할 영화 제목을 입력하세요"
		 *  ex 범죄도시2
		 *  [범죄도시2] - 추천5 2022년 4월 개봉 
		 *  
		 *  "검색한 영화는 확인되지않습니다^^"
		 * http://mekeyace.dothome.co.kr/movie_db.txt
		 */

		
		try {
		List<String> data = Files.readAllLines(Paths.get("C:\\java5\\File_Strame\\src\\movie.txt"));
		System.out.println("검색할 영화 제목을 입력하세요.");
		Scanner sc = new Scanner(System.in);
		String user=sc.next().intern();
		sc.close();
		boolean ch=false;
		
		for(int i=0;i<data.size();i++) {
			if(data.get(i).indexOf(user)!=-1) {
			//if(data.get(i).contains(user)) {
				System.out.println(data.get(i));
				ch=true;
			}
		}
		if(ch==false) {
			System.out.println("해당 영화 정보가 없다.");		
	}
		}
		catch(IOException e) {
				//if(e.getMessage()!=null) {
				//System.out.println("확인되지 않았습니다");
			}
		

	}
}