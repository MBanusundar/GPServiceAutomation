package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(features = "featureFIle/login.feature" , glue = "StepDefenitions")
public class RunnerClass {
}
