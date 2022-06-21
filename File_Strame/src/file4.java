import java.io.FileWriter;
import java.io.IOException;

//파일 쓰기(write)

public class file4 {

	public static void main(String[] args) throws Exception{ //writer라 Exception 하나만 있어도 됌?!
		
		try{ 
			//FileWriter : 문자 데이터를 파일에 쓰는 class
			
			String user[]= {"홍길동40","김유신60","강감찬100","유관순300"};
			
			//FileWriter fw = new FileWriter("C:\\java5\\File_Strame\\src\\array.txt"); //덮어씌기
			FileWriter fw = new FileWriter("C:\\java5\\File_Strame\\src\\array.txt",true);  //기존+신규
			//FileWriter true를 사용하면 기존 입력된 사항을 남겨둠 
				
			for(int f=0;f<user.length;f++) {
				System.out.println(user[f]);
				fw.write(user[f]); //write:문자,배열 데이터 값을 파일에 적용함
				
			}
	
			fw.close(); // 파일 오픈사항을 종료하여 적용함
		}
		catch(Exception x) {
			System.out.println("test");
		}

		
		
	}


	}


