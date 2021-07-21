package pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import pages.locators.SelectMyCarLocators;
import utils.SeleniumDriver;

public class SelectMyCarActions {

    SelectMyCarLocators selectMyCarLocators = null;

    public SelectMyCarActions () {

        this.selectMyCarLocators = new SelectMyCarLocators();

        PageFactory.initElements(SeleniumDriver.getDriver(), selectMyCarLocators);
    }

    public void selectCarMake (String carMake) {

        Select selectCarMake = new Select(selectMyCarLocators.carMake);
        selectCarMake.selectByVisibleText(carMake);
    }

    public void selectCarModel (String carModel) {

        Select selectCarModel= new Select(selectMyCarLocators.carModel);
        selectCarModel.selectByVisibleText(carModel);
    }

    public void selectYear(String year) {

        Select selectYear = new Select(selectMyCarLocators.carYear);
        selectYear.selectByVisibleText(year);
    }

    public void selectBodyType (String bodyType) {

        Select selectBodyType = new Select(selectMyCarLocators.carBodyType);
        selectBodyType.selectByVisibleText(bodyType);
    }

    public void selectTransmission (String transmission) {

        Select selectTransmission = new Select(selectMyCarLocators.carTransmission);
        selectTransmission.selectByVisibleText(transmission);
    }

    public void selectFuelType (String fuelType) {

        Select selectFuelType= new Select(selectMyCarLocators.fuelType);
        selectFuelType.selectByVisibleText(fuelType);
    }

    public void selectVariant (String variant) {

        Select selectVariant = new Select(selectMyCarLocators.variant);
        selectVariant.selectByVisibleText(variant);
    }

    public void clickCreateAddBtn () {
        selectMyCarLocators.createYourFreeAddBtn.click();
    }
}
