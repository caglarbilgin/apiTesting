package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import util.BDDStyle;


public class GetPostSteps {
    @Given("^GET operation for \"([^\"]*)\"$")
    public void getOperationFor(String url)  {
    }

    @And("^GET for the user number \"([^\"]*)\"$")
    public void getForTheUserNumber(String postNumber)  {
        BDDStyle.simpleGETPost();

    }

    @Then("^Should see the \"([^\"]*)\"$")
    public void shouldSeeThe(String arg0)  {

    }
}
