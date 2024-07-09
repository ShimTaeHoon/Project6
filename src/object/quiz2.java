package object;

public class quiz2 {

	public static void main(String[] args) {

		// 5만원을 가진 둘리라는 학생을 만든다
		Student student = new Student("둘리", 50000);
		// 
		Taxi taxi = new Taxi("70합 1234");
		// 둘리가 택시를 탄다
		student.takeTaxi(taxi);
		student.showInfo();
		taxi.showInfo();
	
	}

}

class Taxi {
	String taxiNumber; // 택시번호
	int money; // 수입
	
	// 택시번호를 초기화하는 생성자
	public Taxi(String taxiNumber) {
		this.taxiNumber = taxiNumber;
	}
	
	public void take(int money) {
		this.money = this.money + money;
	}
	
	public void showInfo() {
		System.out.println("택시번호 " + taxiNumber + "의 수입은 " + money);
	}
}
