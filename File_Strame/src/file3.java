import java.io.FileReader;
import java.io.IOException;

//����ó���� �Ѵٴ� ��,, �����ϰ� �ѱ�ٴ� �� 
//.dat���� �ҷ�����...
//IOException + Exception 
public class file3 {

	public static void main(String[] args) throws Exception {

		filein f = new filein();

	}
}

class filein {

	FileReader fr = null;

	public filein() throws IOException, Exception { // �������ڸ��� �ٷ� �۵� ��Ű�ڴٴ� �� (*public ���� �־ ������ �����ٶ� 2���� �����°� ����
		try {
			this.fr = new FileReader("C:\\java5\\File_Strame\\src\\data.dat"); // dat���� �ҷ�����
			this.word();

		} catch (IOException k) {
			if (k.getMessage() != null) {
				System.out.println(k);
			}
		} catch (Exception k1) {
			if (k1.getMessage() != null) {
				System.out.println(k1);
			}
		}
	}

	public void word() throws Exception { // ���� IO�̸� �ؿ� IO�� �ᵵ��..?
		try {
			int w;
			while (true) { // ���ѷ���������..
				w = this.fr.read();
				if (w == -1) {
					break;
				}
				System.out.print((char) w);
			}
			this.fr.close(); // FileReader ����

		} catch (Exception j) {
			if (j.getMessage() != null) {
				System.exit(0);
			}
		}

	}
}
