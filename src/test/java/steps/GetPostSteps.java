package steps;

import cucumber.api.java.en.Given;
import util.BDDStyle;


public class GetPostSteps {

    @Given("^GET for the id is unique \"([^\"]*)\"$")
    public void getForTheIdIsUnique(String url) throws Throwable {
        BDDStyle.checkUniqueId(url);
    }

    @Given("^GET post for user \"([^\"]*)\"$")
    public void getPostForUser(String url) throws Throwable {
        BDDStyle.postForUser(url);
    }
}
