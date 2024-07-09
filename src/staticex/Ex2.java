package staticex;

public class Ex2 {

	public static void main(String[] args) {
		
		Student2 student2 = new Student2();
		

	}

}

class Student2 {
	
	private static int count = 0;
	int studentID;
	String studentName;
	
	public Student2() {
		count++;
		studentID = count;
	}
	
	public static int getCount() {
		return count;
	}
	
	public static void setCount(int cnt) {
		Student2.count = cnt;
//		studentName = "둘리";
		// 에러남. static메소드 안에서 인스턴스 변수 사용 불가(생성 시점이 다름)
	}
	
}
