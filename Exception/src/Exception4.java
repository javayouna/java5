import java.io.IOException;
import java.rmi.server.ExportException;

public class Exception4 {

	public static void main(String[] args) throws IOException,Exception {
		//Exception = try ~catch ��� �϶� !
		//SQLException = ������ ���̽� ��¼�� 
		try {
//		ex e = new ex();
//		e.loader("data");
	
			
		//�ڱ��ڽ��� �ٷ� ���ܻ�Ȳ���� ����
		Exception aaa = new Exception();
		throw aaa; //throw //�ڽ��� ȣ���ؼ� ���ܰ� �߻��ϸ� �ڽ��� ȣ���� class return
		 
		}
		catch(Exception e){ // | �ϳ��� ���� ��� catch�ϳ��� ������ catch(Exception|NumberFormatException e)
			if(e.getMessage()!=null) {
				
			}
			System.out.println(e);
		}
//		catch(IOException i) { //��� ���ϸ���, �ҷ��ö� ��� 
//			System.out.println(i);
//		}
		

	}

}


class ex{
	Exception ep = null; 
	//IOException io = null;
	
	public void loader(String a) throws Exception{ //���� �� �� catch(Exception)���� ��
		//���⿡ throws������ �ؿ� throw this ����
		//throws try~catch�� �ޱ����� class�ε� 
		
		/*�߸��� �������� (�ڽ��� ������ ���� main class�� ��� �����ϴ� ��Ȳ*/
		/*if(a=="ok") {
			//������������, loader class��ü���� �����߻�  
			int keycods = Integer.valueOf(a); 
			
		}
		else {
			//�ش� ������ �ڽ��� ���� ���׿� ���� ����ó���� �߸��� ���..
//			this.ep = new Exception(); //�� ������ ������� 
//			throw this.ep; //���� ���� ���̰ų�, try�ȿ� �־�� �۵�
			
			//this.io= new Exception();
		//throw this.io;*/
			
			try {
				if(a=="ok") {
					int keycode = Integer.valueOf(a);
				}
				else {
					System.out.println("test");
			}
			
			}	
		catch(Exception e) {
		System.out.println(e.getMessage());
		this.ep = new Exception(); //�� ������ �������  
		//�ڽ��� ���������� ���Ϲ޾Ƽ� Ȯ����
		throw this.ep; //���� ���� ���̰ų�, try�ȿ� �־�� �۵�
		}
		}
	}

