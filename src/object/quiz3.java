package object;

public class quiz3 {

	public static void main(String[] args) {

		Customer customer = new Customer("둘리", 10000);
		Customer customer2 = new Customer("또치", 20000);
		
		Cafe cafe = new Cafe("별다방");
		
		customer.buyAmericano(cafe);
		customer2.buyCaffeelatte(cafe);
		
		customer.showInfo();
		customer2.showInfo();
		cafe.showInfo();
		
	}

}

class Cafe {
	String cafeName;
	int money;

	public Cafe(String cafeName) {
		this.cafeName = cafeName;
	}

	public void sellCoffee(int price) {
		this.money = this.money + price;
	}

	public void showInfo() {
		System.out.println("카페 " + cafeName + "의 수입은" + money + "입니다..^.^");
	}
	
}

class Customer {
	String name;
	int money;

	public Customer(String name, int money) {

		this.name = name;
		this.money = money;

	}
	
	public void buyAmericano(Cafe cafe) {
		if (money < 4000) {
			System.out.println(name + "의 소지금이 부족합니다.");
			return;
		}
		cafe.sellCoffee(4000);
		this.money = this.money - 4000;
	}
	
	public void buyCaffeelatte(Cafe cafe) {
		if (money < 4500) {
			System.out.println(name + "의 소지금이 부족합니다.");
			return;
		}
		cafe.sellCoffee(4500);
		this.money = this.money - 4500;
	}

	public void showInfo() {
		System.out.println(name + "님의 남은 돈은 : " + money + "입니다..^_^");
	}

}
