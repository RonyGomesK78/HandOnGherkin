package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SellMyCarLocators {

    @FindBy(how = How.XPATH, using = "//input[@name='number_plate']")
    public WebElement numberPlate;

    @FindBy(how = How.XPATH, using = "//input[@class='select--typeahead select--no-height']")
    public WebElement stateOfCar;

    @FindBy(how = How.XPATH, using = "//button[@class='button button-full primary']")
    public WebElement startMyAddBtn;

}
