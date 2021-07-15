package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {

    @FindBy(how = How.LINK_TEXT, using = "buy + sell")
    public WebElement buyAndSaleSaleLink;

    @FindBy(how = How.LINK_TEXT, using = "Sell my car")
    public WebElement carsForSaleLink;

    @FindBy(how = How.LINK_TEXT, using = "Search Cars")
    public WebElement searchCarsLink;
}
