package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SelectMyCarLocators {

    @FindBy(how = How.XPATH, using = "(//input)[1]")
    WebElement carMake;

    @FindBy(how = How.XPATH, using = "(//input)[2]")
    WebElement carModel;

    @FindBy(how = How.XPATH, using = "(//input)[3]")
    WebElement carYear;

    @FindBy(how = How.XPATH, using = "(//input)[4]")
    WebElement carBodyType;

    @FindBy(how = How.XPATH, using = "(//input)[5]")
    WebElement carTransmission;

    @FindBy(how = How.XPATH, using = "(//input)[6]")
    WebElement fuelType;

    @FindBy(how = How.XPATH, using = "(//input)[7]")
    WebElement variant;
}
