package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchCarsSteps {

    @Given("I am on the homepage {string} of Cars Guide Website")
    public void i_am_on_the_homepage_of_cars_guide_website(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("I move to the menu")
    public void i_move_to_the_menu(io.cucumber.datatable.DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        throw new io.cucumber.java.PendingException();
    }

    @And("click on {string} link")
    public void click_on_link(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @And("select car brand as {string} from AnyMade dropdown list")
    public void select_car_brand_as_from_any_made_dropdown_list(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @And("select car model as {string} from Any Model dropdwon list")
    public void select_car_model_as_from_any_model_dropdwon_list(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @And("select location as {string} from Any Location dropdown list")
    public void select_location_as_from_any_location_dropdown_list(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @And("select price as {string} from Price dropdown list")
    public void select_price_as_from_price_dropdown_list(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @And("click on Find My Next Car button")
    public void click_on_find_my_next_car_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("I should see a list of searched cars")
    public void i_should_see_a_list_of_searched_cars() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @And("the page title should be {string}")
    public void the_page_title_should_be(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
