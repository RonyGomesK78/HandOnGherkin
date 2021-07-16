package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.actions.CarSearchActions;
import pages.actions.HomePageActions;
import utils.SeleniumDriver;

import java.util.List;

public class SearchCarsSteps {

    HomePageActions homePageActions = new HomePageActions();
    CarSearchActions carSearchActions = new CarSearchActions();

    @Given("I am on the homepage {string} of Cars Guide Website")
    public void I_am_on_the_homepage_of_cars_guide_website(String website) {
        SeleniumDriver.openBrowser(website);
    }

    @When("I move to the menu")
    public void i_move_to_the_menu(List<String> list) {

        String menu = list.get(1);
        System.out.println("Menu selected is : " + menu);
        homePageActions.moveToBuyAndSaleMenu();
    }

    @And("click on {string} link")
    public void click_on_link(String string) {
        homePageActions.clickOnSearchCar();
    }

    @And("select car brand as {brand} from AnyMade dropdown list")
    public void select_car_brand_as_from_any_made_dropdown_list(String brand) {
        carSearchActions.selectCarModel(brand);
    }

    @And("select car model as {model} from Any Model dropdwon list")
    public void select_car_model_as_from_any_model_dropdwon_list(String model) {
        carSearchActions.selectCarMake(model);
    }

    @And("select location as {string} from Any Location dropdown list")
    public void select_location_as_from_any_location_dropdown_list(String string) {
        carSearchActions.selectCarLocation(string);
    }

    @And("select price as {string} from Price dropdown list")
    public void select_price_as_from_price_dropdown_list(String string) {
        carSearchActions.selectPrice(string);
    }

    @And("click on Find My Next Car button")
    public void click_on_find_my_next_car_button() {
        carSearchActions.clickFindMyNextCarBtn();
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
