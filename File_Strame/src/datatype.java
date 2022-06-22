import java.util.Scanner;
//.intern();
public class datatype {

	public static void main(String[] args) {
	
		//intern(): equals를 사용하지 않고 == (부등기호로 사용 가능)
		String data[]= {"홍길동","이순신"};
		
		String a = "홍길동";
		String b = "홍길동";
		String c = new String("홍길동").intern(); 
		String d = new String("홍길동");
		String e = data[0];
		//Scanner sc = new Scanner (System.in);
		//String f =sc.next().intern();
		String h = new String(data[0]).intern();
		String h2 = new String(data[1]).intern();
		
		String g = new String(a);
		
		System.out.println(h==h2);
	
			//new String : 소속이 없는 자유분방한 자료형(문자,배열 값)
		
		/*if(a==e) {
			System.out.println("값이 같습니다.");
			*/
		}

	}


