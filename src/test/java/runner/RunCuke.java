package runner;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.testng.annotations.BeforeClass;
//import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;


import io.cucumber.testng.AbstractTestNGCucumberTests;

import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;


@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = "steps",
        tags = ""
)

public class RunCuke extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }

}
