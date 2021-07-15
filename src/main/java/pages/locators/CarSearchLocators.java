package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CarSearchLocators {

    @FindBy(how = How.XPATH, using = "//select[@id='makes']")
    public WebElement carMake;

    @FindBy(how = How.XPATH, using = "//select[@id='models']")
    public WebElement carModel;

    @FindBy(how = How.XPATH, using = "//select[@id='locations']")
    public WebElement carLocation;

    @FindBy(how = How.XPATH, using = "//select[@id='priceTo']")
    public WebElement carPrice;

    @FindBy(how = How.XPATH, using = "//input[@type='submit']")
    public WebElement findMyNextCarBtn;
}
