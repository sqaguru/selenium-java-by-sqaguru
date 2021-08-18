package sqaguru.java.accessmodifiers.tests;

public class Car {

	// data members => preferably Should be private only
	private int carSpeed;// private member accessible within the class only
	private int soundVolume;
	private String carColor;
	private boolean hasAutomaticEngine;

	public String getCarColor() {
		return carColor;
	}

	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}
	
	public boolean getHasAutomaticEngine() {
		return hasAutomaticEngine;
	}
	
	private void setHasAutomaticEngine(boolean hasAutomaticEngine){
		this.hasAutomaticEngine=hasAutomaticEngine;
	}
	

	protected int getCarSpeed() {
		return carSpeed;
	}

	protected void setCarSpeed(int carSpeed) {
		this.carSpeed = carSpeed;
	}

	protected int getSoundVolume() {
		return soundVolume;
	}

	protected void setSoundVolume(int soundVolume) {
		this.soundVolume = soundVolume;
	}

	public Car() {
		this.carSpeed = 0;
	}

	public void showCarSpeed() {
		System.out.println("My Car current speed is: " + carSpeed);
	}

	protected void accelerateCarSpeedBy(int increaseBy) {
		if (carSpeed + increaseBy <= 200) {
			carSpeed = carSpeed + increaseBy;
		} else {
			carSpeed = 200;
			System.out.println("Alert!! Car speed reached its max limit");
		}
	}

	protected void decelerateCarSpeedBy(int decreaseBy) {
		if (carSpeed - decreaseBy < 0) {
			carSpeed = 0;
			System.out.println("You have stopped the car!");
		} else {
			carSpeed = carSpeed - decreaseBy;
		}
	}

	protected void playMusic() {
		System.out.println("Playing music..");
	}
}
