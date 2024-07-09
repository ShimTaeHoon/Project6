package object;

public class Test1 {

	public static void main(String[] args) {

		Cafe2 cafe = new Cafe2("별다방");
		
		Customer2 ddo = new Customer2("또치", 10000);
		Customer2 dow = new Customer2("도우너", 20000);
		
		ddo.buyAmericano(cafe);
		dow.buyCaffelatte(cafe);
		
		cafe.showInfo();
		ddo.showInfo();
		dow.showInfo();
		
	}

}

class Cafe2{
	String cafeName;
	int money;
	
	public Cafe2(String cafeName) {
		this.cafeName = cafeName;
	}
	
	public void sellCoffee(int price) {
		this.money = this.money + price;
	}
	
	public void showInfo() {
		System.out.println(cafeName + "카페의 수익은 "
						+ money + "입니다");
	}
}

class Customer2{
	String name;
	int money;
	
	public Customer2(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	public void buyAmericano(Cafe2 cafe){
		cafe.sellCoffee(4000);
		this.money = this.money - 4000;
	}
	
	public void buyCaffelatte(Cafe2 cafe) {
		cafe.sellCoffee(4500);
		this.money = this.money - 4500;
	}
	
	public void showInfo() {
		System.out.println(name + "님의 잔액은 "
					+ money + "입니다" );
	}
	
	
}
