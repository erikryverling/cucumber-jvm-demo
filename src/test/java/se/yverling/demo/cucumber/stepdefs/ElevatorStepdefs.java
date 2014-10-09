package se.yverling.demo.cucumber.stepdefs;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import se.yverling.demo.cucumber.Elevator;

public class ElevatorStepdefs {
	Elevator elevator = new Elevator();

	@Given("^The elevator is on the entrance floor$")
	public void moveElevatorToEntranceFloor() {
		elevator.moveToEntranceFloor();
	}

	@When("^the elevator is called from the (\\d+) floor$")
	public void callElevatorFromFloor(int floorNumber) {
		elevator.callFromFloor(floorNumber);
	}

	@Then("^the elevator is moved to the (\\d+) floor$")
	public void verifyElevatorIsOnFloor(int floorNumber) {
		assertThat(elevator.getCurrentFloor(), is(floorNumber));
	}
}