package bowling;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * @author suhas
 *
 */
public class RollsTest {
	private Game game;

	@Given("All the rolls for a game are completed")
	public void all_the_rolls_for_a_game_are_completed() {
		// Do nothing
		// No need to check for valid rolls.
		// No need to check for correct number of rolls and frames.
		// No need to provide scores for intermediate frames.
	}

	@When("When the roll sequence is {string}")
	public void when_the_roll_sequence_is(String rollSequence) {
		game = new Game(rollSequence);
	}

	@Then("the score shall be {int}")
	public void the_score_shall_be(Integer score) {
		assertEquals(score.intValue(), game.getScore());
	}
}
