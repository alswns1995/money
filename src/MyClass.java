import java.util.Random;

public class MyClass {

	public void coin () {
		System.out.println("1000won plus");
	}
	public void coin2 () {
		System.out.println("2000won plus");
	}
	public void coin3 () {
		System.out.println("3000won plus");
	}
	
	public int coin(int m) {
		// TODO Auto-generated method stub
		m = m + 1000;
		System.out.println("your money is " + m + "won");
		return m;
	}
	public int coin2(int m) {
		// TODO Auto-generated method stub
		m = m + 2000;
		System.out.println("your money is " + m + "won");
		return m;
	}
	public int coin3(int m) {
		// TODO Auto-generated method stub
		m = m + 3000;
		System.out.println("your money is " + m + "won");
		return m;
	}
	
	public int coinRandom(int money) {
		Random rnd = new Random();
		//System.out.println("Random number? : " + rnd.nextInt(3));
		int num = rnd.nextInt(3);
		if(num == 0) {
			money = money + 1000;
		}
		else if (num == 1) {
			money = money + 2000;
		}
		else if (num == 2) {
			money = money + 3000;
		}
		return money;
	}
}
