import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Scanner;
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

//0623 �̰� ���� �ȵ�..java.lang.NullPointerException����..
public class Example1t {

	public static void main(String[] args) {
		
		
		try { //���Ϸε� �� �޼ҵ� ����
			Scanner sc = new Scanner(System.in);
			System.out.println("1. ������ 2. �������� ");
			int user = sc.nextInt();
			if(user==1) {
			movie m = new movie("movie.txt");  //������   //���⼭ �ٷ� �θ� �� ���� 
			}
			else if(user==2) {
				System.out.println("���� �غ����Դϴ�.");
				sc.close();
			}
		}
		catch(Exception k) {
			if(k.getMessage()!=null) {
			System.out.println("���� ���񽺰� ���������� �ʽ��ϴ�.");
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

	public movie(String filename) throws IOException{ //classȣ�����ڸ��� �۵�!		
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
	

	public void coustom() throws IOException { //���⿡���� throws�� �־�� �� 
		this.bf = new BufferedReader(this.fr);
		this.list = new ArrayList<>();
		
		String datas=this.bf.readLine();
		
		//System.out.println(this.bf.readLine()); //����� �� .readLine()
		//while((datas=this.bf.readLine())!=null) { //�̰͵� �Ǵµ� for:each,do~while�� ���� ����
		
		do {
			this.list.add(datas);
		}while((datas=this.bf.readLine())!=null);
		//System.out.println(this.list);
		
		}
	public void search() {
		this.sc = new Scanner(System.in);
		System.out.println("�˻��� ��ȭ ������ �Է����ּ���:");
		//indexOf,contanis
		String subject = this.sc.next().intern(); //intern ���� ����? equals �� ���ڴٴ� �� ==�� ��
		boolean call = false;
		if(subject=="����") {
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
			System.out.println("�����͸� Ȯ�� �� �� �����ϴ�.");
		}
		this.search(); //��͸޼ҵ� �ٽ� �ݺ�
	}
	
		
		
	}
	
	

