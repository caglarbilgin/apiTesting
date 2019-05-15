package steps;

import cucumber.api.java.en.Given;
import util.BDDStyle;


public class GetPostSteps {
    @Given("^GET for the id is unique \"([^\"]*)\"$")
    public void getForTheIdIsUnique(String url){
        BDDStyle.checkUniqueId(url);
    }
}
