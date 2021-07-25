package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.actions.CarSearchActions;
import pages.actions.HomePageActions;
import utils.SeleniumDriver;

import java.util.List;

public class SearchCarsSteps {

    HomePageActions homePageActions = new HomePageActions();
    CarSearchActions carSearchActions = new CarSearchActions();

    @Given("I am on the homepage {string} of Cars Guide Website")
    public void i_am_on_the_homepage_of_cars_guide_website(String string) {
        SeleniumDriver.openBrowser(string);
    }

    @When("I move to the menu")
    public void i_move_to_the_menu(List<String> list) {

        //String menu = list.get(1);
        //System.out.println("Menu selected is : " + menu);
        homePageActions.moveToBuyAndSaleMenu();
    }

    @And("click on {string} link from the buy link")
    public void click_on_link_from_the_buy_link(String string) {
        homePageActions.clickOnSearchCar();
    }

    @And("select car brand as {string} from AnyMade dropdown list")
    public void select_car_brand_as_from_any_made_dropdown_list(String string) {
        carSearchActions.selectCarMake(string);
    }

    @And("select car model as {string} from Any Model dropdown list")
    public void select_car_model_as_from_any_model_dropdown_list(String string) {
        carSearchActions.selectCarModel(string);
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
        System.out.println("Car list found");
    }

    @And("the page title should be {string}")
    public void the_page_title_should_be(String string) {

        String actualTitle =  SeleniumDriver.getDriver().getTitle();

        Assert.assertEquals(actualTitle, string);
    }


}
