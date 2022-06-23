import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class file13 {

	public static void main(String[] args) throws IOException {

		
		try {
			
			/* [신규생성]
			createDirectories :
			Files.createDirectories(Paths.get("C:\\java5\\File_Strame\\src\\test"));
			*/
			
			/* [복사하기]
			Path data1 = Paths.get("C:\\java5\\File_Strame\\src\\movie.txt");
			Path data2 = Paths.get("C:\\java5\\File_Strame\\src\\movie2.txt");
			Files.copy(data1,data2); //복사....
			*/
			
			/* [옮기기]
			Path data3 = Paths.get("C:\\java5\\File_Strame\\src\\movie2.txt");
			Path derectory = Paths.get("C:\\java5\\movie2.txt");
			Files.move(data3,derectory);
			*/
			
			/* [삭제]
			Path data3 = Paths.get("C:\\java5\\File_Strame\\src\\movie2.txt");
			Files.delete(data3);
			*/
			
			/* [생성]
			Path data3 = Paths.get("C:\\java5\\File_Strame\\src\\movie3.txt");
			Files.createFile(data3);
			*/
			
		}
		catch(Exception z) {
			System.out.println(z);
	
		}
	}

}
