import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class file13 {

	public static void main(String[] args) throws IOException {

		
		try {
			
			/* [�űԻ���]
			createDirectories :
			Files.createDirectories(Paths.get("C:\\java5\\File_Strame\\src\\test"));
			*/
			
			/* [�����ϱ�]
			Path data1 = Paths.get("C:\\java5\\File_Strame\\src\\movie.txt");
			Path data2 = Paths.get("C:\\java5\\File_Strame\\src\\movie2.txt");
			Files.copy(data1,data2); //����....
			*/
			
			/* [�ű��]
			Path data3 = Paths.get("C:\\java5\\File_Strame\\src\\movie2.txt");
			Path derectory = Paths.get("C:\\java5\\movie2.txt");
			Files.move(data3,derectory);
			*/
			
			/* [����]
			Path data3 = Paths.get("C:\\java5\\File_Strame\\src\\movie2.txt");
			Files.delete(data3);
			*/
			
			/* [����]
			Path data3 = Paths.get("C:\\java5\\File_Strame\\src\\movie3.txt");
			Files.createFile(data3);
			*/
			
		}
		catch(Exception z) {
			System.out.println(z);
	
		}
	}

}
