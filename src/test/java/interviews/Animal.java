package interviews;

import groovy.util.logging.Log;

public class Animal extends Base {
	public Animal() {
		log("animal constructor");
	}

	public void barking() {
		System.out.println("barking animal");
	}
}
