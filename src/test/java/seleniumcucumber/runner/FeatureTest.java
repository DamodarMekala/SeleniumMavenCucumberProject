package seleniumcucumber.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:/Users/damekala/IdeaProjects/SeleniumMavenProject/src/test/java/features/login.feature",
        glue = "features" )

public class FeatureTest {

}
