package runner;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.testng.annotations.BeforeClass;
//import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;


import io.cucumber.testng.AbstractTestNGCucumberTests;

import io.cucumber.testng.CucumberOptions;


@CucumberOptions(

        plugin = {"json:target/RunCuce/cucumber.json", "html:target/RunCuce/cucumber.html", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        features = "src/test/resources/features",
        glue = "steps",
        tags = "@Search-cars"

)

public class RunCuke extends AbstractTestNGCucumberTests {


    @BeforeClass

    public static void setup() {

        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy_hhmmss");

        Date date = new Date();

        String strDate = sdf.format(date);

        String fileName = System.getProperty("user.dir") + "\\target\\Extent_Reports\\" + strDate;

        File newFile = new File(fileName);

        //ExtentCucumberAdapter.initiateExtentCucumberFormatter(newFile, false);

    }

}
