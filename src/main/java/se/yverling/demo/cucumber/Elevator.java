package se.yverling.demo.cucumber;

public class Elevator {
	private static final int ENTRANCE_FLOOR = 0;
	private int currentFloor = ENTRANCE_FLOOR;

	public void moveToEntranceFloor() {
		currentFloor = ENTRANCE_FLOOR;
	}

	public void callFromFloor(int floorNumber) {
		move(floorNumber);
	}

	public int getCurrentFloor() {
		return currentFloor;
	}

	private void move(int floorNumber) {
		currentFloor = floorNumber;
	}
}