import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Scanner;
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

//0623 이거 실행 안됨..java.lang.NullPointerException오류..
public class Example1t {

	public static void main(String[] args) {
		
		
		try { //파일로드 및 메소드 전달
			Scanner sc = new Scanner(System.in);
			System.out.println("1. 개봉작 2. 개봉예정 ");
			int user = sc.nextInt();
			if(user==1) {
			movie m = new movie("movie.txt");  //개봉중   //여기서 바로 부를 수 있음 
			}
			else if(user==2) {
				System.out.println("서비스 준비중입니다.");
				sc.close();
			}
		}
		catch(Exception k) {
			if(k.getMessage()!=null) {
			System.out.println("현재 서비스가 정상적이지 않습니다.");
		}
		}
	}

}
class movie {
	
private String path = "C:\\java5\\File_Strame\\src\\";
private FileReader fr = null;
private BufferedReader bf = null;
private ArrayList<String> list = null;
private Scanner sc = null;

	public movie(String filename) throws IOException{ //class호출하자마자 작동!		
		try {
			FileReader fr = new FileReader(this.path+filename,Charset.forName("UTF8"));
			this.coustom();
			this.fr.close();
			this.search();
			
		}
		catch(Exception a){
			System.out.println(a);
		}	
	}
	

	public void coustom() throws IOException { //여기에서도 throws가 있어야 함 
		this.bf = new BufferedReader(this.fr);
		this.list = new ArrayList<>();
		
		String datas=this.bf.readLine();
		
		//System.out.println(this.bf.readLine()); //출력할 때 .readLine()
		//while((datas=this.bf.readLine())!=null) { //이것도 되는데 for:each,do~while이 제일 빠름
		
		do {
			this.list.add(datas);
		}while((datas=this.bf.readLine())!=null);
		//System.out.println(this.list);
		
		}
	public void search() {
		this.sc = new Scanner(System.in);
		System.out.println("검색할 영화 제목을 입력해주세요:");
		//indexOf,contanis
		String subject = this.sc.next().intern(); //intern 쓰는 이유? equals 안 쓰겠다는 뜻 ==로 됨
		boolean call = false;
		if(subject=="종료") {
			sc.close();
			System.exit(0);
		}
		for(String moviesb: this.list) {
			/*
			if(moviesb.indexOf(subject)!=-1) {
				System.out.println(moviesb);
			}
			*/
			if(moviesb.contains(subject)) {
			 System.out.println(moviesb);
			 call=true;
			}
			
		}
		if(call==false) {
			System.out.println("데이터를 확인 할 수 없습니다.");
		}
		this.search(); //재귀메소드 다시 반복
	}
	
		
		
	}
	
	

