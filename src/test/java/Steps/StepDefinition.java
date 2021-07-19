package Steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.net.MalformedURLException;

public class StepDefinition extends Steps {
    @Given("I open the music and I'm on the home screen")
    public void iOpenTheMusicAndIMOnTheHomeScreen() throws MalformedURLException {
        desiredCap();
    }

    @And("I navigate to genre")
    public void iNavigateToGenre() throws InterruptedException {
        clickGenre();
    }


    @And("I select a genre {string}")
    public void iSelectAGenre(String arg0) {
        navigateGenre(arg0.trim());
    }

    @When("I select a music {string}")
    public void iSelectAMusic(String arg0) {
        navigateMusic(arg0.trim());
    }

    @Then("I validate the music plays.")
    public void iValidateTheMusicPlays() {
        validateSong();
    }
}



