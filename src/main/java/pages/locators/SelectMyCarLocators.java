package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SelectMyCarLocators {

    @FindBy(how = How.XPATH, using = "(//input)[1]")
    public WebElement carMake;

    @FindBy(how = How.XPATH, using = "(//input)[2]")
    public WebElement carModel;

    @FindBy(how = How.XPATH, using = "(//input)[3]")
    public WebElement carYear;

    @FindBy(how = How.XPATH, using = "(//input)[4]")
    public WebElement carBodyType;

    @FindBy(how = How.XPATH, using = "(//input)[5]")
    public WebElement carTransmission;

    @FindBy(how = How.XPATH, using = "(//input)[6]")
    public WebElement fuelType;

    @FindBy(how = How.XPATH, using = "(//input)[7]")
    public WebElement variant;

    @FindBy(how = How.XPATH, using = "//button[@class='button selectCar--button primary']")
    public WebElement createYourFreeAddBtn;
}
