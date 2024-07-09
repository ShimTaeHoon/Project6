package staticex;

public class Ex3 {

	public static void main(String[] args) {

		System.out.println(10*10*Calculator.pi);
		System.out.println(Calculator.plus(1, 1));
		System.out.println(Calculator.minus(10, 5));
	
	}

}

// 계산기 클래스
class Calculator {
	// 예를들면 pi는 항상 똑같은 값이라,
	// 객체마다 만들어줄 필요가 없이 static으로 공통으로 만들어주면 됨
	// static = 공통속성
	static double pi = 3.14159; //공통속성
	
	// 계산기 기능도 똑같기에 static으로 만들어주면 됨
	// 고유한 값(이름, 학년 등)이 필요하면 static말고 인스턴스(개별)속성으로 생성
	static int plus(int x, int y) { //공통메소드
		return x + y;
	}
	
	static int minus(int x, int y) {
		return x - y;
	}
	
	
	
}
