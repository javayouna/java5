package swing1;

public class Imsi {

	public static void main(String[] args) {
			
		gugu yn = new gugu();
		//yn.getInt();
		yn.sum();
	 //System.out.println(yn.getInt());
	}

}

abstract class aa{

	public abstract void sum();	
	//public abstract int getInt();
}

class gugu extends aa{

	int total=0;
	@Override
	public void sum() {
		for(int t=1;t<10;t++) {
			this.total+=t*9;
			
		}	
		System.out.println(getInt());
	}	
	public int getInt() {
		return this.total;
	}
}