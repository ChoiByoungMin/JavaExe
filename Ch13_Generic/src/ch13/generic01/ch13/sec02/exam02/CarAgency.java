package ch13.generic01.ch13.sec02.exam02;

public class CarAgency implements Rentable<Car> {

	@Override
	public Car rent() {
		return new Car();
	}

}
