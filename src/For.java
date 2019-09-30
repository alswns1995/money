
public class For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = 0;

		for (int i = 0; i < 3; i++) {

			System.out.println("GO!");
			System.out.println("Get 1000won!");
			m = m + 1000;
			System.out.println("I have " + m + "won");
		}
		
		if (m >= 3000) {
			System.out.println("Eat");
		}
		else {
			System.out.println("TT");
		}
		
		//클래스 불러오기
		MyClass mc = new MyClass();
		m = mc.coin(m);
		m = mc.coin2(m);
		m = mc.coin3(m);
		
		System.out.println("My money? " + m + "won!!");		
	}
}
