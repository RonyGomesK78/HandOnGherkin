package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SellMyCarLocators {

    @FindBy(how = How.XPATH, using = "//input[@name='number_plate']")
    public WebElement numberPlate;

    @FindBy(how = How.XPATH, using = "//div[@class='select--input']")
    public WebElement divStateOfCar;

    @FindBy(how = How.XPATH, using = "//div[@class='select--dropdown']")
    public WebElement stateOfCar;

    @FindBy(how = How.XPATH, using = "//button[@class='button button-full primary']")
    public WebElement startMyAddBtn;

}
