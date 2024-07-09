package scope;

public class Quiz3 {
	// 블록에 따라 변수의 유효범위를 작성하세요
	public static void main(String[] args) {
		
		// 객체 생성 후 person으로 인스턴스 주소값을 받고
		// new Person으로 초기화하면
		// main메소드 안에서만 유효
		Person person = new Person();
		
		// main메소드 안에서만 유효
		int i = 10;
		
		// if문 {}안에서만 유효
		if(i > 1) { 
			String str = "안녕하세요";
			System.out.println();
		}
		
		//for문 스코프 안에서만 유효
		for(int k=0; k<10; k++) { 
			System.out.println(k);
		}
		
	}
	
}
