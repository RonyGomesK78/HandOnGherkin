package pages.actions;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import pages.locators.HomePageLocators;
import utils.SeleniumDriver;

import javax.swing.*;

public class HomePageActions {

    HomePageLocators homePageLocators = null;

    public HomePageActions () {

        this.homePageLocators = new HomePageLocators();

        PageFactory.initElements(SeleniumDriver.getDriver(), homePageLocators);
    }

    public void moveToBuyAndSaleMenu () {

        Actions actions = new Actions(SeleniumDriver.getDriver());
        actions.moveToElement(homePageLocators.buyAndSaleSaleLink)
                .perform();

    }

    public void clickOnSearchCar () {
        homePageLocators.searchCarsLink.click();
    }
}
