package object;

public class quiz1 {
	
	public static void main(String[] args) {
		
		Student student = new Student("둘리", 5000);
		Student student2 = new Student("도우너", 10000);
		
		Bus bus = new Bus(100);
		Subway subway = new Subway("2호선");
		student.takeBus(bus);
		student2.takeSubway(subway);
		
		student.showInfo();
		student2.showInfo();

		bus.showInfo();
		subway.showInfo();
		
	}
}
