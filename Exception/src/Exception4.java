import java.io.IOException;
import java.rmi.server.ExportException;

public class Exception4 {

	public static void main(String[] args) throws IOException,Exception {
		//Exception = try ~catch 사용 하라구 !
		//SQLException = 데이터 베이스 어쩌구 
		try {
//		ex e = new ex();
//		e.loader("data");
	
			
		//자기자신을 바로 예외상황으로 만듦
		Exception aaa = new Exception();
		throw aaa; //throw //자신을 호출해서 예외가 발생하면 자신을 호출판 class return
		 
		}
		catch(Exception e){ // | 하나로 쓰는 방법 catch하나만 쓰려면 catch(Exception|NumberFormatException e)
			if(e.getMessage()!=null) {
				
			}
			System.out.println(e);
		}
//		catch(IOException i) { //얘는 파일리드, 불러올때 사용 
//			System.out.println(i);
//		}
		

	}

}


class ex{
	Exception ep = null; 
	//IOException io = null;
	
	public void loader(String a) throws Exception{ //리턴 못 씀 catch(Exception)으로 감
		//여기에 throws없으면 밑에 throw this 못씀
		//throws try~catch를 받기위한 class로드 
		
		/*잘못된 문법사항 (자신의 오류를 상위 main class에 모두 전달하는 상황*/
		/*if(a=="ok") {
			//정상적이지만, loader class자체적인 오류발생  
			int keycods = Integer.valueOf(a); 
			
		}
		else {
			//해당 문법은 자신의 오류 사항에 대한 예외처리가 잘못된 경우..
//			this.ep = new Exception(); //꼭 선언을 해줘야함 
//			throw this.ep; //문법 제일 밑이거나, try안에 넣어야 작동
			
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
		this.ep = new Exception(); //꼭 선언을 해줘야함  
		//자신의 오류사항을 리턴받아서 확인함
		throw this.ep; //문법 제일 밑이거나, try안에 넣어야 작동
		}
		}
	}

