import java.io.FileReader;
import java.io.IOException;

//예외처리를 한다는 것,, 안전하게 넘긴다는 뜻 
//.dat파일 불러오기...
//IOException + Exception 
public class file3 {

	public static void main(String[] args) throws Exception {

		filein f = new filein();

	}
}

class filein {

	FileReader fr = null;

	public filein() throws IOException, Exception { // 실행하자마자 바로 작동 시키겠다는 뜻 (*public 옆에 있어서 위에서 던져줄때 2개다 던지는게 좋음
		try {
			this.fr = new FileReader("C:\\java5\\File_Strame\\src\\data.dat"); // dat파일 불러오기
			this.word();

		} catch (IOException k) {
			if (k.getMessage() != null) {
				System.out.println(k);
			}
		} catch (Exception k1) {
			if (k1.getMessage() != null) {
				System.out.println(k1);
			}
		}
	}

	public void word() throws Exception { // 여기 IO이면 밑에 IO안 써도됨..?
		try {
			int w;
			while (true) { // 무한루프돌려서..
				w = this.fr.read();
				if (w == -1) {
					break;
				}
				System.out.print((char) w);
			}
			this.fr.close(); // FileReader 종료

		} catch (Exception j) {
			if (j.getMessage() != null) {
				System.exit(0);
			}
		}

	}
}
