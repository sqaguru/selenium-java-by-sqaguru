package sqaguru.java.accessmodifiers.tests;

public class MyCarTest {
	public static void main(String[] args) {
		Car car = new Car();

		car.showCarSpeed();

		System.out.println(car.getSoundVolume());

		car.setCarSpeed(50);

		boolean hasAutomatic=car.getHasAutomaticEngine();
		
		System.out.println("hasAutomatic: "+hasAutomatic);
		
		car.showCarSpeed();

		car.accelerateCarSpeedBy(30);

		car.showCarSpeed();

		car.accelerateCarSpeedBy(70);

		car.showCarSpeed();

		car.accelerateCarSpeedBy(6);

		car.showCarSpeed();

		car.decelerateCarSpeedBy(20);

		car.showCarSpeed();

		car.decelerateCarSpeedBy(200);

		car.showCarSpeed();
	}
}
