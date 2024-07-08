package object;

public class Ex1 {

	public static void main(String[] args) {

		// 만원을 가진 둘리라는 학생을 만든다
		Student student = new Student("둘리", 10000);
		// 100번 버스를 만든다
		Bus bus = new Bus(100);
		//학생이 100번 버스에 탄다
		student.takeBus(bus);
		
		student.showInfo();
		bus.showInfo();
	
	}

}

//버스클래스
class Bus {
	int busNumber; // 버스번호
	int passengerCount; // 승객수
	int money; // 수입 // 초기값이 0이기에 별도로 초기화 할 필요가 없음
	
	// 버스번호를 초기화하는 생성자
	public Bus(int busNumber) {
		this.busNumber = busNumber;
		
	}
	
	// 버스에 승객을 태우는 메소드
	public void take(int money) {
		this.money = this.money + money; // 버스 수입 증가
		passengerCount++; // 승객수 1명 증가
		
	}
	
	public void showInfo() {
		System.out.println("버스 " + busNumber +
						"번의 승객은 " + passengerCount +
						"명이고, 수입은 " + money + "입니다.");
	}
	
}

class Subway {
	String lineNumber; // 지하철 노선번호
	int passengerCount; // 승객수 // (0명) = 초기값
	int money; // 수입 // (0원) = 초기값
	
	// 지하철 노선번호를 초기화하는 생성자
	public Subway(String lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	// 지하철에 승객을 태우는 메소드
	public void take(int money) { // int money = 요금.
		this.money = this.money + money; // this.money = 수입.
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.println("지하철 " + lineNumber +
						"의 승객은 " + passengerCount +
						"명이고, 수입은 " + money + "입니다.");
	}
	
}

class Student {
	String studentName; // 학생이름
	int money; // 소지금
	
	// 학생이름과 가진돈을 초기화하는 생성자
	public Student(String studentName, int money) {
		super();
		this.studentName = studentName;
		this.money = money;
	}
	
	// 버스에 타서 요금을 지불하는 메소드
	public void takeBus(Bus bus) {
		bus.take(1000); // 1000원 지불
		this.money = this.money - 1000; // 가진돈 1000원을 잃음
	}
	
	// 지하철에 타서 요금을 지불하는 메소드
	public void takeSubway(Subway subway) {
		subway.take(1500); // 1500원 지불
		this.money = this.money - 1500; // 가진돈 1500원을 잃음
	}
	
	public void showInfo() {
		System.out.println(studentName + "님의 남은 돈은" 
										+ money + "입니다.");
	}
	
}