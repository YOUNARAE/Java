package chapter0702;

import chapter07.Vehicle;

public class Taxi extends Vehicle {
	@Override
	public void run() {
		System.out.println("택시가 달립니다.");
	}
}
