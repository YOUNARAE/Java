package chapter07;

public class KumhoTire extends Tire {
	//필드
	//생성자
	
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	//메소드
	@Override
	public boolean roll() {
		++accomulatedRotation;
		if(accomulatedRotation<maxRotation) {
			System.out.println(location + " kumhoTire 수명: " + (maxRotation-accomulatedRotation) + "회");
			return true;
		} else {
			System.out.println("*** " + location + " KumhoTire 펑크 ***");
			return false;
		}
	}
}
