import java.util.Scanner;
//.intern();
public class datatype {

	public static void main(String[] args) {
	
		//intern(): equals�� ������� �ʰ� == (�ε��ȣ�� ��� ����)
		String data[]= {"ȫ�浿","�̼���"};
		
		String a = "ȫ�浿";
		String b = "ȫ�浿";
		String c = new String("ȫ�浿").intern(); 
		String d = new String("ȫ�浿");
		String e = data[0];
		//Scanner sc = new Scanner (System.in);
		//String f =sc.next().intern();
		String h = new String(data[0]).intern();
		String h2 = new String(data[1]).intern();
		
		String g = new String(a);
		
		System.out.println(h==h2);
	
			//new String : �Ҽ��� ���� �����й��� �ڷ���(����,�迭 ��)
		
		/*if(a==e) {
			System.out.println("���� �����ϴ�.");
			*/
		}

	}


