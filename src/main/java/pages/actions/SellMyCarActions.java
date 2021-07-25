package pages.actions;

import io.cucumber.java.eo.Se;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
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
        sellMyCarLocators.numberPlate.sendKeys(carPlate);
    }

    public void selectStateOfCar (String stateOfCar) {

        //Select select = new Select(sellMyCarLocators.numberPlate);
        //select.selectByVisibleText(stateOfCar);
        sellMyCarLocators.stateOfCar.click();
        
    }

    public void clickStartMyAd () {
        sellMyCarLocators.startMyAddBtn.click();
    }
}
