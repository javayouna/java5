import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) throws IOException {
		/* [���빮��]
		 * ����ڰ� ��ȭ������ �˻��մϴ�.
		 * �ش� ��ȭ���� �����Ͱ��� ���� ���
		 * ��ȭ��ü ������ ����մϴ�.
		 * ��Ʈ:Scanner�� ���
		 * "�˻��� ��ȭ ������ �Է��ϼ���"
		 *  ex ���˵���2
		 *  [���˵���2] - ��õ5 2022�� 4�� ���� 
		 *  
		 *  "�˻��� ��ȭ�� Ȯ�ε����ʽ��ϴ�^^"
		 * http://mekeyace.dothome.co.kr/movie_db.txt
		 */

		
		try {
		List<String> data = Files.readAllLines(Paths.get("C:\\java5\\File_Strame\\src\\movie.txt"));
		System.out.println("�˻��� ��ȭ ������ �Է��ϼ���.");
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
			System.out.println("�ش� ��ȭ ������ ����.");		
	}
		}
		catch(IOException e) {
				//if(e.getMessage()!=null) {
				//System.out.println("Ȯ�ε��� �ʾҽ��ϴ�");
			}
		

	}
}