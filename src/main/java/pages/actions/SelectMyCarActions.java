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
        selectMyCarLocators.carMake.click();
    }

    public void selectCarModel (String carModel) {
        selectMyCarLocators.carModel.click();
    }

    public void selectYear(String year) {
        selectMyCarLocators.carYear.click();
    }

    public void selectBodyType (String bodyType) {
        selectMyCarLocators.carBodyType.click();
    }

    public void selectTransmission (String transmission) {
        selectMyCarLocators.carTransmission.click();
    }

    public void selectFuelType (String fuelType) {
        selectMyCarLocators.fuelType.click();
    }

    public void selectVariant (String variant) {
        selectMyCarLocators.variant.click();
    }

    public void selectSeries (String series) {
        selectMyCarLocators.series.click();
    }

    public void clickCreateAddBtn () {
        selectMyCarLocators.createYourFreeAddBtn.click();
    }
}
