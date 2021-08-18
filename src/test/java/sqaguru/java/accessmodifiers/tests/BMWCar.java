package sqaguru.java.accessmodifiers.tests;

public class BMWCar extends Car {
	public void showBMWCarSpeed() {
		showCarSpeed();
	}
	
	public void accelerateBMWCarSpeed(int increaseBy) {
		accelerateCarSpeedBy(increaseBy);
	}
}
