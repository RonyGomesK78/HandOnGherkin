package pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import pages.locators.SellMyCarLocators;
import utils.SeleniumDriver;

public class SellMyCarActions {

    SellMyCarLocators sellMyCarLocators = null;

    public SellMyCarActions () {

        this.sellMyCarLocators = new SellMyCarLocators();

        PageFactory.initElements(SeleniumDriver.getDriver(), sellMyCarLocators);
    }

    public void enterCarPlate (String carPlate) {

        Select selectPlate = new Select(sellMyCarLocators.numberPlate);
        selectPlate.selectByVisibleText(carPlate);
    }

    public void selectStateOfCar (String stateOfCar) {

        Select selectState = new Select(sellMyCarLocators.stateOfCar);
        selectState.selectByVisibleText(stateOfCar);
    }

    public void clickStartMyAd () {
        sellMyCarLocators.startMyAddBtn.click();
    }
}
