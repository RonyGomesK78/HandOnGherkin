package pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import pages.locators.CarSearchLocators;
import utils.SeleniumDriver;

public class CarSearchActions {

    CarSearchLocators carSearchLocators = null;

    public CarSearchActions () {

        this.carSearchLocators = new CarSearchLocators();

        PageFactory.initElements(SeleniumDriver.getDriver(), carSearchLocators);
    }

    public void selectCarMake (String carBrand) {

        Select selectMake =  new Select(carSearchLocators.carMake);
        selectMake.selectByVisibleText(carBrand);
    }

    public void selectCarModel (String carModel) {

        Select selectModel = new Select(carSearchLocators.carModel);
        selectModel.selectByVisibleText(carModel);
    }

    public void selectCarLocation (String location) {

        Select selectLocation = new Select(carSearchLocators.carLocation);
        selectLocation.selectByVisibleText(location);
    }

    public void selectPrice (String price) {

        Select selectPrice = new Select(carSearchLocators.carPrice);
        selectPrice.selectByVisibleText(price);
    }

    public void clickFindMyNextCarBtn () {

        carSearchLocators.findMyNextCarBtn.click();
    }

}
