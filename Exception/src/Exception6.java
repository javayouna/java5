
public class Exception6 {

	public static void main(String[] args) {
		/*
		 ���빮��. ����ڰ� 45*3+16+5+22*8 �ش� ���� ���� ��������
		 �ܺ� Ŭ������ �����մϴ�.
		 
		 �ش� �ܺ� Ŭ���������� �ش� ���� ¦���� ��� ���ܿ����� �߻��ϸ�
		 Ȧ���� ��� Ȧ���� �Դϴ�. �� �ٽ� ȸ�� �ǵ��� �մϴ�.
		 * */
		//return�޼ҵ尡 string �̾����
		
		/* ���빮�� ����
		  data file {"ȫ�浿", 55 , "������", "������", 48,"�̼���","����",34,88}
		  �ش� ������ ���� ���ڰ��� ��� �ǵ��� �� �迭 �Ͻñ� �ٶ��ϴ�.
		  ��, main������ �ش� �迭�� �ܺ� Ŭ���� (setter)�� �����մϴ�.
		  �ش� setter���� �迭���� Ȯ���Ͽ� �̸��� ��迭�� ����
		  getter���� �ش� �迭 return���� �������� �մϴ�.
		  ��, �ܺ� Ŭ�������� ���ڸ� �ִ� �迭�� ��� ����ó�� �ǵ��� �մϴ�.
		 */
		cost cs = new cost();
		int sum = 45*3+16+5+22*8;
		try {
			String result = cs.a(null);
			System.out.println(result);
			
		}
		catch(Exception e) {
			
			if(sum%2==0) {
				System.out.println(e);
			}
			else {
				
			}
		}
		
		
		
		
	}

}
class cost{
	public String a(String aa) throws Exception{
		if
	}

}