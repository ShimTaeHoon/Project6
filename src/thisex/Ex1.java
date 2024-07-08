package thisex;

public class Ex1 {

	public static void main(String[] args) {

		Birthday bDay = new Birthday(); // 객체생성
		bDay.setYear(2000); // 연도 입력
		System.out.println(bDay);
		bDay.printThis();
		
	}

}

// 생일 클래스
class Birthday {
	int year;
	
	// 태어난 연도를 변경하는 메소드
	public void setYear(int year) {
		this.year = year; // this를 써주지 않으면 매개변수로 인식됨
	}
	// this의 값을 출력하는 메소드
	public void printThis() {
		System.out.println(this);
	}
}
