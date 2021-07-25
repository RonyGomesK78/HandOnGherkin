package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pages.actions.HomePageActions;
import pages.actions.SelectMyCarActions;
import pages.actions.SellMyCarActions;

public class SellMyCarSteps {

    SellMyCarActions sellMyCarActions = new SellMyCarActions();
    SelectMyCarActions selectMyCarActions = new SelectMyCarActions();
    HomePageActions homePageActions = new HomePageActions();

    @And("click on {string} link from the sell menu")
    public void click_on_link_from_the_sell_menu(String string) {
        homePageActions.clickOnSellCar();
    }

    @And("enter number plate as {string} from Your Number Plate dropdown list")
    public void enter_your_number_plate_as_from_your_number_plate_dropdown_list(String string) {
        sellMyCarActions.enterCarPlate(string);
    }

    @And("select state of car as {string} from state of car registration dropdown list")
    public void select_state_of_car_as_from_state_of_car_registration_dropdown_list(String string) {
        sellMyCarActions.selectStateOfCar(string);
    }
    
    @And("click on Start my ad button")
    public void click_on_start_my_ad_button() {
        sellMyCarActions.clickStartMyAd();
    }

    @And("select car brand as {string} from Make dropdown list")
    public void select_car_brand_as_from_make_dropdown_list(String string) {
        selectMyCarActions.selectCarMake(string);
    }

    @And("select car model as {string} from Model dropdown list")
    public void select_car_model_as_from_model_dropdown_list(String string) {
        selectMyCarActions.selectCarModel(string);
    }

    @And("select car year as {string} from Year dropdown list")
    public void select_car_year_as_from_year_dropdown_list(String string) {
        selectMyCarActions.selectYear(string);
    }
    @And("select car body type as {string} from Body Type dropdown list")
    public void select_car_body_type_as_from_body_type_dropdown_list(String string) {
        selectMyCarActions.selectBodyType(string);
    }

    @And("select car transmission as {string} from Transmission dropdown list")
    public void select_car_transmission_as_from_transmission_dropdown_list(String string) {
        selectMyCarActions.selectTransmission(string);
    }

    @And("select car fuel type as {string} from Fuel type dropdown list")
    public void select_car_fuel_type_as_from_fuel_type_dropdown_list(String string) {
        selectMyCarActions.selectFuelType(string);
    }

    @And("select car variant as {string} from Variant dropdown list")
    public void select_car_variant_as_from_variant_dropdown_list(String string) {
        selectMyCarActions.selectVariant(string);
    }

    @And("select car series as {string} from Series dropdown list")
    public void select_car_series_as_from_series_dropdown_list(String string) {
        selectMyCarActions.selectSeries(string);
    }

    @And("click on Click your FREE ad")
    public void click_on_click_your_free_ad() {
        selectMyCarActions.clickCreateAddBtn();
    }


}
